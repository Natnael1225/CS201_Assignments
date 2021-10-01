package Lab3;

import java.util.Scanner;

public class Expressions {

    public static void main(String[] args) {
        /**
         *    Question - A  --  square root of the numbers
         */

        Scanner input = new Scanner(System.in);
        System.out.println(" Enter first number please");
        double B = input.nextDouble();
        System.out.println(" Enter second number please");
        double A = input.nextDouble();
        System.out.println(" Enter third number");
        double C = input.nextDouble();
        double squareRoot=  Math.sqrt(Math.pow(B,2) + (4 *A*C));
        System.out.println("The square root of the numbers is: "+squareRoot);
        System.out.println("---------------------------------------------");

        /**
         *  Question - B --  squareRoot for the value of X and Y
         */
        System.out.println("Enter a number for value X please");
        double X = input.nextDouble();
        System.out.println("Enter a number for value Y please");
        double Y = input.nextDouble();
        double squareRoot2=  Math.sqrt(X+ (4 *Math.pow(Y,3)));
        System.out.println("The squareRoot for the value of X and Y is: "+squareRoot2);
        System.out.println("----------------------------------------------");

        /**
         *    Question - C  -- cubeRoot for the value of X1 and Y1
         */
        System.out.println("Enter a number for value X1 please");
        double X1 = input.nextDouble();
        System.out.println("Enter a number for value Y1 please");
        double Y1 = input.nextDouble();
        double cubeRoot=  Math.cbrt(X1*Y1);
        System.out.println("The cubeRoot for the value of X1 and Y1 is: "+cubeRoot);
        System.out.println("---------------------------------------------");

        /**
         *     Question - D  ---  area of a circle
         */

        System.out.println("Enter a radius of a circle please");
        double radius = input.nextDouble();
        double area = (Math.PI*Math.pow(radius,2));
        System.out.println("The area of a circle is: "+area);
        input.close();
    }
}
