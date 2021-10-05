package Lab5;

import java.util.Scanner;

public class PowerOfTen {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter the number of zero for Million, Billion, Trillion..., to display the number value in word");
        double number = input.nextInt();
        Math.pow(10,number);
        if (number == 6)
            System.out.println("The number is one Million");
        else if (number == 9)
            System.out.println("The number is one Billion");
        else if (number == 12)
            System.out.println("The number is one Trillion");
        else if (number == 15)
            System.out.println("The number is one Quadrillion");
        else if (number == 18)
            System.out.println("The number is one Quintillion");
        else if (number == 21)
            System.out.println("The number is one Sextillion");
        else if (number == 30)
            System.out.println("The number is one Nonillion");
        else if (number == 100)
            System.out.println("The number is one Googol");
        else
            System.out.println("The number to the power is out of range");
    }
    }

