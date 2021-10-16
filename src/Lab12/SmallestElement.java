package Lab12;

import java.util.Scanner;

public class SmallestElement {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter the Array Size you want");
        int num = input.nextInt();
        int[] user = new int[num];
        for (int i = 0; i < user.length; i++) {
            System.out.println("Enter the Element: "+(i+1));
            user[i] = input.nextInt();
        }
        System.out.print("[ ");
        for (int i = 0; i < user.length; i++) {
            System.out.print(user[i] +"\t ");
        }
        System.out.print(" ]");
        System.out.println();
        System.out.print("The smallest element is: ");
            System.out.println(smallestElement(user, 1,0));

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
