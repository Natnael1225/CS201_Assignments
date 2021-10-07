package Lab6;

public class EquivalentIf {

    public static void main(String[] args) {

        /**
         * Question 2 -  A
         *   A  and C are equivalent b is not equivalent
         *   because of the braces if is looking for
         *   the nearest open else
         */
        int a = 1;
        int b = 1;
        int c = 1;
        int d = c;// I assign to c to see the equivalency b/n the if clause

        if (a == b)
            if (c == d)
                a = 1;
            else
                b = 1;

        /**
         * Question 2 - B
         */
        if (a == b) {
            if (c == d)
                a = 1;
        } else
            b = 1;

        /**
         * Question 2 - C
         */
        if (a == b)
            if (c == d)
                a = 1;
            else
                b = 1;
    }
}


