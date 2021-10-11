package Lab8;

import javax.swing.*;
import java.util.Scanner;

public class DNAStrand {


    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the first strand");
        String strand = sc.nextLine();

        while (!strand.equals("")) {
            StringBuffer strand2 = new StringBuffer("");
            if (strand.matches("[ATCG]*")) {
                //System.out.println(complement(strand));
                for (int i = 0; i < strand.length(); i++) {
                    if (strand.charAt(i) == 'A') {
                        strand2.append("T");
                    }
                    if (strand.charAt(i) == 'T') {
                        strand2.append("A");
                    }
                    if (strand.charAt(i) == 'G') {
                        strand2.append("C");
                    }
                    if (strand.charAt(i) == 'C') {
                        strand2.append("G");
                    }

                }
                System.out.println(strand2.toString());
                System.out.println("Enter the next strand");
                strand = sc.nextLine();
            } else {
                System.out.println("Please enter a strand that only contains letters A,T,C, or G.");
                strand = sc.nextLine();
            }
        }
        System.out.println("Program Ends");
    }

}
