public class CircleWithException {
    private double radius;

    public CircleWithException(double radius) {
        this.setRadius(radius);
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        double tempArea = radius * radius * Math.PI;
        if (radius > 0 && tempArea <= 1000) {
            this.radius = radius;
        }
        else if (radius <= 0) {
            throw new IllegalArgumentException("Invalid input. Please enter a positive number.");
        } else {
            throw new RuntimeException("Invalid input, number too large.");
        }
    }

    public double getArea() {
        return radius * radius * Math.PI;
    }

    public double getDiameter() {
        return radius * radius;
    }

}