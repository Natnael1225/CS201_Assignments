package Lab4;

import java.text.DecimalFormat;
import java.util.Scanner;

public class WeightConverter {

    private static final double GRAVITY_MOON = 0.167;

    public static  void convertWeight(double weight){
        DecimalFormat df = new DecimalFormat("0.00");
        double weightOnMoon = weight*GRAVITY_MOON;
        System.out.println("Your weight on the moon is: "+ weightOnMoon );
        System.out.println("The formatted weight on the moon is: "+ df.format(weightOnMoon));
    }
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Enter your weight from the earth please");
        double weight= input.nextDouble();
        convertWeight(weight);

    }
}
