package Lab7;

import java.util.Scanner;

public class FindErrors {
    public static void main(String[] args) {

        /**
         * Question 1 -  A
         * There is logical error gives infinite loop because we have to decrement
         * the value of i-- , this equation starts from back,
         * and we have declare and initialized the values of x ,y, a , z.
         */
        int x;
        int y = 0;
        int a;
        int b = 0;
        for (int i = 10; i > 0; i++) {
            x = y;
            a = b;
        }
        /**
         * Question 1 -  B
         * there is syntax error missing while key word
         * missing int data type for num ,optional missing message to use
         * don't sum the numbers if the number is less than 10000
         * we have to give the number greater than 10000 inorder to get the sum of the values
         */
        int sum = 0;
        Scanner input = new Scanner(System.in);
        do {
            System.out.println("Enter a numbers to sum their values");
            int num = input.nextInt();
            sum += num;
            System.out.println(sum);

        } while (sum > 10000);

/**
 * Question 1 -  C
 * Inside the While loop the boolean expression is always false so
 * didn't execute the result. There is logical error
 * Missing data type,and we have initialized the values of x, a , b.
 */
        int x1 = 0;
        while (x1 < 1 && x1 > 10) {
            a = b;
        }
        /**
         *Question 1 -  D
         * This is infinite loop, if a == b is equal ,this means always true
         * there is Syntax error after while
         * it should be braces only, we have to remove semi-colon
         * Missing data type,and we have initialized the values of x,y,a,b.
         */
        int a1 = 0;
        while (a1 == b) ;
        {
            a1 = b;
            x = y;
        }
    }
}
