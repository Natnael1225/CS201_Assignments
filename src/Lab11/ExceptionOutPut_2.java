package Lab11;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ExceptionOutPut_2 {

    public static void main(String[] args) {

        //Finally, block is always executed whether exception is handled or not.
                /**
                 * A, -1, -> The result print:-> Error: Not Zero
                 * and in the nextLine print: Finally Clause Executed
                 *
                 * B, 0 ---> The result print: I'm happy with the input
                 * and in the nextLine print: Finally Clause Executed
                 *
                 * C, 12XY --> The result print Invalid Entry
                 * and in the nextLine print: Finally Clause Executed
                 */
                Scanner input = new Scanner(System.in);
        System.out.println("Enter a number");
        try {
            int num = input.nextInt();
            if (num != 0){
                throw new Exception("Not Zero");
            }
            System.out.println("I'm happy with the input");
        }catch (InputMismatchException e){
            System.out.println("Invalid Entry");
        }
        catch (Exception e){
            System.out.println("Error: " + e.getMessage());
        }
        finally {
            System.out.println("Finally Clause Executed");
        }
    }
}
