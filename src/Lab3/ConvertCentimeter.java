package Lab3;

import java.util.Scanner;

public class ConvertCentimeter {

    public static void main(String[] args) {

/**
 * convert centimeters (input) to feet and inches (output)
 */
        Scanner input = new Scanner(System.in);
        System.out.println("Enter in cenimeter to convert to feet and inches");
        double centimeter = input.nextDouble();
        //double inch , feet;
        double totalInch = centimeter/2.54;
        int  feet =  (int)totalInch/12;
        int inch = (int) totalInch %12;
        System.out.println("The converted centimeter is : "+ feet+" feet and "+ inch+": inches");
        input.close();


    }
}
