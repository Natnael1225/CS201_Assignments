package Lab10;

import java.util.Scanner;

public class ArrayTemperature {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        String[] monthName = { "January", "February", "March", "April", "May", "June", "July", "August", "September",
                "October", "November", "December" };
        String[] daysName = { "Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday", "Sunday"};

        double[] temperature = new double[12];
        if (temperature.length <=12) {
            double sum = 0;
            double average = 0;
            for (int i = 0; i < temperature.length; i++) {
                System.out.println("Enter temperature for: " + monthName[i]);
                temperature[i] = input.nextInt();
//            sum+=temperature[i];
            }
            //average =sum/temperature.length;
            //System.out.println("Annual Average of the temperature is: "+average);
            System.out.print("[ ");
            for (int i = 0; i < temperature.length; i++) {
                System.out.print(temperature[i] + "\t ");
                sum += temperature[i];
            }
            System.out.print(" ]");
            average = sum / temperature.length;
            System.out.println("\nThe Average temperature of each month is: " + average);
            double coldest = temperature[0];
            double hottest = temperature[0];

            for (int i = 0; i < temperature.length; i++) {
                if (temperature[i] > hottest)
                    hottest = temperature[i];
            }
            for (int i = 0; i < temperature.length; i++) {
                if (temperature[i] < coldest)
                    coldest = temperature[i];
            }
            double difference = hottest - coldest;
            System.out.println("The hottest days of the months temperature is: " + (int) hottest);
            System.out.println("The coldest days of the months temperature is: " + (int) coldest);
            System.out.println("The difference b/n the coldest and hottest days of the month is: " + (int) difference);
        }else{
            System.out.println("Invalid month");
        }
        System.out.println("Program ends");
    }
}
