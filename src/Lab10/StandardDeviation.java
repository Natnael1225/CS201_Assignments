package Lab10;

import java.util.Scanner;

public class StandardDeviation {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double sum =0.0, insideCal = 0.0 , standardDeviation =0.0;
        System.out.println("Enter numbers you want to store in the array");
        int num = input.nextInt();
        double [] arr = new double[num];

        for (int i = 0; i < arr.length; i++) {
            System.out.println("Enter numbers in the array: "+ (i+1));
            arr[i] = input.nextDouble();
        }
        System.out.print("[ ");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " \t ");
            sum+=arr[i];
        }
       System.out.print("]");
        double x = sum/arr.length;
        System.out.println("\nThe average for the value of X is: "+ x);
        for (int i = 0; i < arr.length ; i++) {
            insideCal+=Math.pow(arr[i]-x,2);
        }
        standardDeviation=Math.sqrt(insideCal/num);
        System.out.println("The Standard deviation of "+num+" numbers is: "+standardDeviation);
    }
}
