package Lab4;

import java.util.Scanner;

public class WeightConverterDemo {

    public static void main(String[] args) {
        WeightConverter wc = new WeightConverter(0.167);
        Scanner input = new Scanner(System.in);
        System.out.println("Enter your weight from the earth please");
        double weight= input.nextDouble();
        wc.convertWeight(weight);

    }
}
