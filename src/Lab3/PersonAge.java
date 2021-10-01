package Lab3;

import java.time.YearMonth;
import java.util.Scanner;

public class PersonAge {

    public static void main(String[] args) {

/**
 * a program that inputs the year a person is born
 * and outputs the age of the person
 */
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter year were you born in ");
        int year  = input.nextInt();
        int currentYear = YearMonth.now().getYear();
        int currentAge = currentYear - year;
        System.out.println("You were born in "+year+" and you will be: " + currentAge + " this year.");
        input.close();
    }
}
