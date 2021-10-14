package Lab10;

import java.util.Random;

public class CountTemperature_365 {

    public static void main(String[] args) {
        double[][] temp = new double[12][30];

        Random randNum = new Random();
        for (int i = 0; i < temp.length; i++) {
            for (int j = 0; j < temp[i].length; j++) {
                temp[i][j] = (int) randNum.nextInt(60) + 5;
                System.out.print(temp[i][j] + " \t ");
            }
            System.out.println();
        }
        averageOfMonth(temp);
        coldestTemperature(temp);
        hottestTemperature(temp);


    }

    public static void averageOfMonth(double arr[][]) {
        String[] monthName = {"January", "February", "March", "April", "May", "June", "July", "August", "September",
                "October", "November", "December"};
        double hottest = arr[1][1];
        double coldest = arr[1][1];
        for (int r = 1; r <= arr.length; r++) {
            double sum = 0;
            for (int c = 1; c <= arr[r - 1].length; c++) {
                sum += arr[r - 1][c - 1];
            }
            System.out.println("The Average temperature for " + monthName[r - 1] + " is: " + sum / arr[r - 1].length + " degrees");
        }
    }

    public static void hottestTemperature(double[][] temperature) {
        int x = temperature.length;
        int z = temperature[0].length;
        double out[] = new double[x];
        for (int r = 0; r < x; r++) {
            double hottest = Integer.MIN_VALUE;
            for (int c = 0; c < z; c++) {
                if (temperature[r][c] > hottest)
                    hottest = temperature[r][c];
//                else if (temperature[r][c ] < coldest)
//                    coldest = temperature[r ][c ];
            }
            out[r] = hottest;
        }
        String[] monthName = {"January", "February", "March", "April", "May", "June", "July", "August", "September",
                "October", "November", "December"};
        for (int i = 0; i < x; i++) {
            //System.out.println(out[i]);
            System.out.println("The hottest temperature of for " + monthName[i] + " is: " + out[i] + " degrees");
        }
    }

    public static void coldestTemperature(double[][] temperature) {
        int x = temperature.length;
        int z = temperature[0].length;
        double res[] = new double[x];
        for (int r = 0; r < x; r++) {
            double coldest = Integer.MAX_VALUE;
            for (int c = 0; c < z; c++) {
                if (temperature[r][c] < coldest)
                    coldest = temperature[r][c];
            }
            res[r] = coldest;
        }
        String[] monthName = {"January", "February", "March", "April", "May", "June", "July", "August", "September",
                "October", "November", "December"};
        for (int i = 0; i < x; i++) {
            //System.out.println(out[i]);
            System.out.println("The coldest temperature of for " + monthName[i] + " is: " + res[i] + " degrees");

        }
    }
}
