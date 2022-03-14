import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        double radius;
        Scanner input = new Scanner(System.in);

        while (true) {
            try {
                System.out.println("Please enter radius for the circle: ");
                radius = input.nextDouble();
                break;
            } catch (IllegalArgumentException e) {
                System.out.println("Invalid input. Please enter a positive number.");
            } catch (RuntimeException e) {
                System.out.println("Invalid input, number too large. please enter a number smaller than 1000.");
            }
        }
        CircleWithException circle = new CircleWithException(radius);
        System.out.println("Area of circle is " + circle.getArea());
    }

}
