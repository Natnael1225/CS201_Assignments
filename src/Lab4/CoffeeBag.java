package Lab4;

import java.text.DecimalFormat;
import java.util.Scanner;

public class CoffeeBag {

    private static final double TAX_RATE = 0.0725;
    private static final double PRICE_PER_LB = 5.99;

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter numberOfBags");
        int numberOfBags = input.nextInt();
        System.out.println("Please enter your coffee bag weight");
        double bagWeight = input.nextDouble();
        weightBagOfCoffee(bagWeight, numberOfBags);
    }
    public static void weightBagOfCoffee( double weightCoffee, int numberOfBags ) {
        double totalPrice = weightCoffee * numberOfBags * PRICE_PER_LB;
        double totalPriceWithTax = totalPrice + (totalPrice * TAX_RATE);
        DecimalFormat decimalFormat = new DecimalFormat("0.00");
        System.out.println("Number of bags sold: " + numberOfBags + "\nWeight per bag : " + weightCoffee + " lb" +
                "\nPrice per pound is: $" + PRICE_PER_LB + "\nSales tax is: " +
                decimalFormat.format(TAX_RATE * 100) + "%" + "\nThe totalPrice is: $" +
                decimalFormat.format(totalPrice) + "\nThe totalPriceWithTax is: $" +
                decimalFormat.format(totalPriceWithTax));
    }
}
