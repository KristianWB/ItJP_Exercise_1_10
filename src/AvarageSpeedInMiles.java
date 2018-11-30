public class AvarageSpeedInMiles {
    public static void main(String[] args)   {

        /* The task will be broken down into two tasks
        1) Calculate the speed and converting kilometers/hour into miles/hour
        2) Displaying the result
         */

        // 1) Calculating the speed
        double speed = (14/1.6) / (45.5/60);

        // 2) Printing out result
        System.out.printf(
                "The speed in miles pr. hour of the runner is: " + "%.2f",speed
        );

    }
}
