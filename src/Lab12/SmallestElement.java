package Lab12;

public class SmallestElement {

    public static void main(String[] args) {

            int[] num = {5, 9, 3, 1, 4, 2, 6};
            System.out.println(smallestElement(num, 1,0));

        }
        public static int smallestElement(int[] arr, int nextVla, int index){
        if (index == arr.length-1)
            return arr[index];

                    nextVla = smallestElement(arr, nextVla,index+1);
                    if (arr[index] < nextVla)
                        return arr[index];
                    else
                        return nextVla;
        }
    }
