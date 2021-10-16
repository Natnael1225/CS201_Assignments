package Lab12;

public class SmallestElement {

    public static void main(String[] args) {

            int[] num = {5, 9, 3, 1, 4, 2, 6};
            System.out.println(smallestElement(num, 0));

        }
        public static int smallestElement(int[] arr, int index){
        int nextVlue;
        if (index == arr.length-1)
            return arr[index];

                    nextVlue = smallestElement(arr, index+1);
                    if (arr[index] < nextVlue)
                        return arr[index];
                    else
                        return nextVlue;
        }
    }
