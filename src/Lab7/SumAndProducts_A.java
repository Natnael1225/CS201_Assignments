package Lab7;

public class SumAndProducts_A {

    public static void main(String[] args) {

        /**
         * Question 2 -  A
         *    SUM  & Product
         *   For Loop
         */
        int n = 100; //I took 100- meaning the user input upto n values
        int sum =0;
        double product =1;
        for(int i=1; i<= n;i++) {
            //System.out.print(i + " ");
            sum+= i;
            product *= i;
        }
        System.out.println("The sum-for-loop of the numbers is: "+sum );
        System.out.println("The product-for-loop of the numbers is: "+product);
        System.out.println("---------------------------");

        /**
         * Question 2 -  A
         *  Do While Loop
         *   SUM  & Product
         */
        int i = 1;
        int sum2 =0;
        double product2= 1;
        do{
            //System.out.print(i + " ");
            sum2+=i;
            product2*=i;
            i++;
        }
        while (i<=n);
        System.out.println("The sum-do while-loop of the numbers is: "+sum2);
        System.out.println("The product-do while-loop of the numbers is: "+product2);
        System.out.println("---------------------------");

        /**
         * Question 2 -  A
         *  While Loop
         *   SUM  & Product
         */
        int x = 1;
        int sum3 =0;
        double product3= 1;
        while (x <= n){
            //System.out.print(b + " ");
            sum3+=x;
            product3 *=x;
            x++;
        }
        System.out.println("The sum-while-loop of the numbers is: "+sum3);
        System.out.println("The product-while-loop of the numbers is: "+product3);
        System.out.println("--------------------------------------------");

        }
}
