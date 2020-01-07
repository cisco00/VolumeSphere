import java.util.Scanner;

public class VolumeSphere {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter the radius of the Sphere: ");
        double radius = input.nextDouble();

        System.out.println("volume of a sphere is: " + VolumeSphere(radius));

    }

    public static double VolumeSphere(double radius) {

        double volume = (4.0 / 3.0) * Math.PI * Math.pow(radius, 3);
        return volume;
    }

    }