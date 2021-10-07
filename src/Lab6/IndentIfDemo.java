package Lab6;

public class IndentIfDemo {

    public static void main(String[] args) {

        int a = 1;
        int b = 1;
        int c = 1;
        int d = 1; // I initialize to one to see the indentation b/n the if clause
        /**
         * Question 1 -  A
         */
        if (a == b)
            if (c == d)
                a = 1;
            else
                b = 1;
        else
            c = 1;
        /**
         * Question 1 -  B
         * The if  else  give their own result it is not nested if
         */
        if (a == b)
            a = 1;
        if (c == d)
            b = 1;
        else c = 1;
        /**
         * Question 1 -  C
         */
        if (a == b) {
            if (c == d)
                a = 1; //if  the two expression is true execute both this two, but the inner if is false execute b==2
            b = 2;     //and the outer if is false execute the nearest else c=1;
        } else c = 1;

        /**
         * Question 1 -  D
         */
        if (a == b) {
            if (c == d)
                a = 1;  //if  the two expression is true execute both this two, but the inner if is false execute b=2
            b = 2;   //and the outer if is false execute the nearest else  b=1; and check the next if & if it's true execute d=3;
        } else {
            b = 1;
            if (a == d)
                d = 3;
        }
    }
}
