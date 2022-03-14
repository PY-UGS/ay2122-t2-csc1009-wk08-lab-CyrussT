public class CircleWithException {
    private double radius;

    public CircleWithException(double radius) {
        this.setRadius(radius);
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {

        if (radius > 0) {
            this.radius = radius;
        }
        else if (radius < 0) {
            throw new IllegalArgumentException();
        } else if (radius > 1000) {
            throw new RuntimeException();
        }
    }

    public double getArea() {
        return radius * radius * Math.PI;
    }

    public double getDiameter() {
        return radius * radius;
    }


}
