package Lab2;

import java.util.Scanner;

public class UserInput {

    public static void main(String[] args) {
        //To enter first , middle , name from the user

        Scanner input = new Scanner(System.in);
        System.out.println("Please enter first name");
        String fname= input.next();
        System.out.println("Please enter your middle name");
        String mname= input.next();
        System.out.println("Please enter your last name");
        String lname= input.next();
        System.out.println("Your full name is: "+fname+" " + mname.charAt(0)+". "+ lname);
    }
}
