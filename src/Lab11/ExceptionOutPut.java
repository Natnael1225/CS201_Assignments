package Lab11;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ExceptionOutPut {
    public static void main(String[] args) {

        /**
         * A, -1, -> The result print:-> Error: Not Zero
         * B, 0 ---> The result print: I'm happy with the input
         * C, 12XY --> The result print Invalid Entry
         */
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a number");
        try {
            int num = input.nextInt();
            if (num!=0){
                throw  new Exception("Not Zero");
            }
            System.out.println("I'm happy with the input");
        }catch (InputMismatchException e){
            System.out.println("Invalid Entry");
        }
        catch (Exception e){
            System.out.println("Error: " + e.getMessage());
        }
    }
}
