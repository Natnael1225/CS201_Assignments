package Lab2;

import java.util.Scanner;

public class MiddleCharacter {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Please write any text word");
        String word= input.nextLine();
        int length= word.length()/2;
        char middle= word.charAt(length);
        System.out.println("The middle character is: "+ middle);
    }
}

