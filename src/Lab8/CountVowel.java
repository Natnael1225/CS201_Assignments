package Lab8;

import java.util.Scanner;

public class CountVowel {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Enter a word to count");
        String word = input.nextLine();
        while (!"".equals(word)){  // !word.equals("");
            countVowel(word);
            System.out.println("Enter a word to count");
            word = input.nextLine();
        }
        System.out.println("Program Ends");
    }
    public static void countVowel(String word){
        int count1 = 0,count2=0,  count3=0, count4=0, count5=0;
        for(int i = 0; i < word.length(); i++) {
            if(word.charAt(i) =='a')
                count1++;
            else if(word.charAt(i) =='e')
                count2++;
            else if(word.charAt(i) =='i')
                count3++;
            else if(word.charAt(i) =='o')
                count4++;
            else if(word.charAt(i) =='u')
                count5++;
        }
        System.out.println("# of \'a\' : " + count1);
        System.out.println("# of \'e\' : " + count2);
        System.out.println("# of \'i\' : " + count3);
        System.out.println("# of \'o\' : " + count4);
        System.out.println("# of \'u\' : " + count5);
    }
}
