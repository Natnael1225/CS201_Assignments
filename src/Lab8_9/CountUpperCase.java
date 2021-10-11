package Lab8_9;

import java.util.Scanner;

public class CountUpperCase {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Enter a word to count the upper cases");
        String word = input.nextLine();
        while (!word.equals("")){
            System.out.println(isUpperCase(word));
            System.out.println("Enter a word to count the upper cases");
            word = input.nextLine();
        }
        System.out.println("Program Ends");
    }
    public static int isUpperCase(String word){
        int count =0;
        for (int i = 0; i < word.length(); i++) {
            if (Character.isUpperCase(word.charAt(i)))
            count++;
        }
        return count;
    }
}
