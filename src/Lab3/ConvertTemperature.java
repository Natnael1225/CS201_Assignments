package Lab3;

import java.util.Scanner;

public class ConvertTemperature {

    public static  final double  CONSTANT_NUMBER = 1.8;
    public static  final int  CONSTANT_NUMBER2 = 32;
    public static void main(String[] args) {
/**
 * a program that inputs temperature in degrees Celsius and
 * prints out the temperature in degrees Fahrenheit
 */
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a temperature in degree Celsius and prints out in degrees Fahrenheit");
        double degreeCelsius = input.nextDouble();
        double Fahrenheit = CONSTANT_NUMBER * degreeCelsius + CONSTANT_NUMBER2;
        System.out.println("The temperature is " +Fahrenheit +" degree Fahrenheit.");
        input.close();
    }
}
