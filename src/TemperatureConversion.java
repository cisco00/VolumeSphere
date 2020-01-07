import java.util.Scanner;

public class TemperatureConversion {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
            //Fahrenheit(double celsius);
            //Celsius(double fahrenheit);

        System.out.println("Enter fahrenheit temparatur");
        double fahrenheit = input.nextDouble();

        System.out.printf("%.2f", Celsius(fahrenheit));
    }
    public static double Celsius(double fahrenheit){
        double celsius = 5.0/9.0 * (fahrenheit -32);
        return celsius;
    }
    public static double Fahrenheit(double celsius){
        double fahrenheit = 9.0/5.0 * celsius + 32;
        return  fahrenheit;
    }

}
