import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        double radius;
        Scanner input = new Scanner(System.in);

        try {
            System.out.println("Please enter radius for the circle: ");
            radius = input.nextDouble();
            CircleWithException circle = new CircleWithException(radius);
            System.out.printf("Area of circle is %.2f", circle.getArea());
        } catch (IllegalArgumentException e) {
            System.out.println(e);
        } catch (RuntimeException e) {
            System.out.println(e);
        }
    }
}