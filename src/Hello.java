public class Hello {

    public static void main(String[] args) {
        System.out.println("Hello, Sunny ");

        boolean isAlien = true;
        if (isAlien == false) {
            System.out.println("its not an alien");
        }else{
            System.out.println("its an alien");
        }

        int topScore  = 60;
        if (topScore <  100){
            System.out.println("you got the high score");
        }

        int secondTopScore = 60;
        if (topScore > secondTopScore || topScore < 100){
            System.out.println("you passed!");
        }else{
            System.out.println("you failed");
        }

        int newValue = 50;
        if (newValue == 50){
            System.out.println("this is an error");
        }

        String makeOfCar = "honda";
        boolean isDomestic = makeOfCar == "honda" ? false : true;
        System.out.println(isDomestic);
    }
}
