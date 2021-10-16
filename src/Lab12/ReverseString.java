package Lab12;

public class ReverseString {

    public static void main(String[] args) {
        String name = "liam";
        reverseStringLab(name,0);

    }
    public static void reverseStringLab(String word, int index){
        if (index==word.length())
            return;

        else
            reverseStringLab(word,index+1);
          System.out.print(word.charAt(index) +" ");
    }
}
