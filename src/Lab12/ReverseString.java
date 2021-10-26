package Lab12;

public class ReverseString {

    public static void main(String[] args) {
        String name = "liam";
        reverseSentence(name);  //Reverse for recursion
        //reverseStringLab(name,0);  //Reverse for recursion
        System.out.println();
        //System.out.print(reverseWord("Java"));
        //System.out.print(reverseString("Java")); //Reverse without recursion

    }
    public static void reverseSentence(String word){
        if (word.length() == 1) {
            System.out.print(word);
        }else {
            reverseSentence(word.substring(1));
            System.out.print(word.substring(0, 1) );
        }
    }
    public static String reverseString(String word ){
        String reverse= "";
        for (int i = word.length()-1; i >=0; i--) {
            reverse+=word.charAt(i);
        }
        return reverse;
    }

    public static void reverseStringLab(String word, int index){
        if (index==word.length())
            return;

        else
            reverseStringLab(word,index+1);
          System.out.print(word.charAt(index) +" ");
    }
    public  static String reverseWord(String text){
        if(text.isEmpty() || text.length() <= 1)
            return text;
        else
            return  reverseWord(text.substring(1) + text.charAt(0));
    }

}
