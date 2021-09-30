package Lab2;

import java.util.Scanner;

public class StringInput {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Please write any text word");
        String word= input.nextLine();
        System.out.println("The length of the sentence is: "+ word.length());
        System.out.println("The first character is: "+ word.substring(0,1));
        System.out.println("The last character is: "+ word.charAt(word.length()-1));
    }

}


