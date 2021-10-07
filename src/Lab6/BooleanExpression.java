package Lab6;

public class BooleanExpression {

    public static void main(String[] args) {

/**
 * Question 3 -  A
 */
        int x = 10;
        int y = 20;
        int z = 30;
        boolean isEqual = x < 10 || x > 10;
        System.out.println(isEqual); //result gives false

        /**
         * Question 3 -  B
         */
        boolean isTrue = x > y && y > x;
        System.out.println(isTrue); //result gives false

        /**
         * Question 3 -  C
         */
        System.out.println((x < y + z) && (x + 10 <= 20)); //result gives true


        /**
         * Question 3 -  D
         */
        System.out.println((z - y == x) && Math.abs(y - z) == x); //result gives true

        /**
         * Question 3 -  E
         */
        System.out.println(x < 10 && x > 10); //result gives false

        /**
         * Question 3 -  F
         */
        System.out.println(x > y || y > x); //result gives true

        /**
         * Question 3 -  G
         */
        System.out.println(!(x < y + z) || !(x + 10 <= 20)); //result gives false

        /**
         * Question 3 -  H
         */
        System.out.println(!(x == y) && (x != y) && (x < y || y < x)); //result gives true
    }
}
