package Lab7;

public class SumAndProducts_B {
    public static void main(String[] args) {

/**
 * Question 2 -  B
 *   For Loop
 *   SUM  & Product
 */
        int n = 50; // user input
        int sum = 0;
        long product = 1;
        for (int i = 5; i <= n; i += 5) {
            //System.out.print(i + " ");
            sum += i;
            product *= i;
        }
        System.out.println("The sum-for-loop of the numbers is: " + sum);
        System.out.println("The product-for-loop of the numbers is: " + product);
        System.out.println("---------------------------");

        /**
         * Question 2 -  B
         *  Do While Loop
         *   SUM  & Product
         */
        int j = 5;
        int sum2 = 0;
        long product2 = 1;
        do {
            //System.out.print(j + " ");
            sum2 += j;
            product2 *= j;
            j += 5;
        }
        while (j <= n);
        System.out.println("The sum-do while-loop of the numbers is: " + sum2);
        System.out.println("The product-do while-loop of the numbers is: " + product2);
        System.out.println("---------------------------");

        /**
         * Question 2 -  B
         *  While Loop
         *   SUM  & Product
         */

        int x = 5;
        int sum3 =0;
        long product3 =1;
        while (x <= n){
            //System.out.print(b + " ");
            sum3 += x;
            product3 *= x;
            x+=5;
        }
        System.out.println("The sum-while-loop of the numbers is: " +sum3 );
        System.out.println("The product-while-loop of the numbers is: " +product3);
        System.out.println("---------------------------");


    }
    }

