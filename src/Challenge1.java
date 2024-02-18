public class Challenge1 {

    public static void main(String[] args) {
        double d = 20.00;
        double d2  = 80.00;

        double multiply = (d + d2) * 100.00;

        System.out.println(multiply);

        double remainder = d2 % 40.00;

        System.out.println(remainder);

        boolean isZero = remainder == 0.00 ? true : false;

        System.out.println(isZero);

        if (!isZero){
            System.out.println("got some remainder");
        }
    }
}
