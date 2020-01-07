import java.util.Scanner;

public class DistanceBetweenPoint {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Enter the value of x1");
        double x1 = input.nextDouble();
        System.out.println("Enter the value of x2");
        double x2 = input.nextDouble();
        System.out.println("Enter the value of y1");
        double y1 = input.nextDouble();
        System.out.println("Enter the value of y2");
        double y2 = input.nextDouble();

        double point1 = Math.sqrt(x2 - x1);
        double point2 = Math.sqrt(y2 - y1);
        Distance(point1, point2);
        }

    public static double Distance(double point1, double point2) {
        double distance2 = 0;

        distance2 = Math.sqrt(point1 + point2);
        System.out.printf("%.2f: ",distance2 );
        return distance2;

    }
}


