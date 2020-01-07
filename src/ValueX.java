public class ValueX {
    public static void main(String[] args) {
           // a(0.0);
            //x(-6.4);
            x(7.5);

           double x = Math.abs(7.5);
            System.out.printf("%d%n", x);
        System.out.printf("%.2f ", x);
        }

        public static double a(double a){
        a = Math.abs(0.0);
        System.out.printf("%d%n", a);
        return a;
        }
//}
    public static double x1(double x){
        x= Math.floor(7.5);
        System.out.printf("%d%n", x);
        return x;
        }
    public static double x(double x){
      x = Math.abs(-6.4);
        System.out.printf("%d%n", x);
        return x;
    }

}