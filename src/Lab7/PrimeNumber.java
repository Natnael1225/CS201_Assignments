package Lab7;

import java.util.Scanner;

public class PrimeNumber {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Enter a number to find whether a number is prime or not prime");
        int  num = input.nextInt();

        while (num >= 0){
            System.out.println(isPrime(num));
            System.out.println("Enter a number to find whether a number is prime or not prime" +
                    " or enter negative number to exist");
            num = input.nextInt();
        }

    }
    public static boolean isPrime(int number) {
        if (number <= 1) {
            return false;
        }
        for ( int i = 2; i < number; i++) {
            if (number % i == 0)
                return false;
        }
        return true;
    }
}
