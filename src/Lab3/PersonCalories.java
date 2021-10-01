package Lab3;

import java.util.Scanner;

public class PersonCalories {

    public static  final int CALORIES_PER_POUND_BODY_WEIGHT = 19;

    public static void main(String[] args) {

        /*
         * a program that accepts a person’s weight and displays
         * the number of calories the person needs in one day
         */
        Scanner input = new Scanner(System.in);
        System.out.println("Enter your bodyWeight please");
        double  bodyWeight = input.nextDouble();
        int numberOfCalories = (int)bodyWeight * CALORIES_PER_POUND_BODY_WEIGHT;
        System.out.println("The number of calories you needs in one day is: "+ numberOfCalories);
        input.close();
    }
}
