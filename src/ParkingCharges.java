import java.util.Scanner;

public class ParkingCharges {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);


        System.out.println("Enter parking hour in the garage: ");
        double hour = input.nextDouble();
        calculateCharges(hour);

    }
    private static void calculateCharges(double hour){
        double minimumCharge = 2.00;
        double additionFee = 0.50;
        double maximumCharge = 10.00;

        if(hour > 3){
            double extraCharges = minimumCharge + additionFee * hour;
            System.out.println("Charges for parking" + extraCharges);
        }if(hour <=3){
            double parkingCharges = minimumCharge * hour;
            System.out.println("Your charges are" +parkingCharges);
        }

    }
}
