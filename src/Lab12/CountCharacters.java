package Lab12;

public class CountCharacters {

    public static void main(String[] args) {

        String name = "lily";
        System.out.println(countChar(name,0));

    }
    public static int countChar(String word, int i){
        if (i==word.length())
            return 0;
        else
            return 1+countChar(word,i+1);
    }
    }

