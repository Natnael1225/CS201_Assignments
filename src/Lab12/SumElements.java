package Lab12;

public class SumElements {

    public static void main(String[] args) {
        int [] num ={5,9,3};
        System.out.println(sumElements(num,0));

    }
    public static int sumElements(int[]arr, int index){
        if (index == arr.length)
            return 0;
        else
            return  arr[index] + sumElements(arr,index +1);

    }
}
