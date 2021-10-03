package Lab4;

import java.text.DecimalFormat;
import java.util.Scanner;

public class WeightConverter {

    private static  double gravity_Moon;


    public WeightConverter(double gravity_Moon) {
        this.gravity_Moon= gravity_Moon;
    }
    public static  void convertWeight(double weight){

        DecimalFormat df = new DecimalFormat("0.00");
        double weightOnMoon = weight*gravity_Moon;
        System.out.println("Your weight on the moon is: "+ weightOnMoon );
        System.out.println("The formatted weight on the moon is: "+ df.format(weightOnMoon));
    }
}
