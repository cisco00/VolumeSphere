import java.util.Scanner;

public class AreaofCycle {
    public static void main(String[] args) {
        Scanner input =new Scanner(System.in);

        System.out.println("Enter the radius of the cycle: ");
        double radius =input.nextDouble();
        System.out.printf("%.2f ",  CycleArea(radius));

    }

    public static double CycleArea(double radius){

        double Area = (Math.PI * Math.pow(radius,2));
        return Area;
    }
}
