package Lab8_9;

import java.util.Scanner;

public class Palindrome {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter a text to check whether the word is palindrome or not ");
        String word = input.nextLine();

        while (!word.equals("")){
            String reverse = "";
            for (int i = word.length() - 1; i >= 0; i--) {
                reverse += word.charAt(i);
            }
            if (word.equalsIgnoreCase(reverse))
                System.out.println("The entered text is Palindrome");
            else
                System.out.println("The entered text is not Palindrome");
            System.out.println("Please enter a text to check whether the word is palindrome or not. ");
            word = input.nextLine();
        }
        System.out.println("Program Ends");
    }
}
