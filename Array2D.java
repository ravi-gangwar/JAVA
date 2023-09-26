import java.util.Arrays;
import java.util.Scanner;

public class Array2D {
    public static void main(String[] args) {
        // 2D Array = {

        //      0 1 2 -> Coloums
        //     {1,2,3}, 0 -> Rows
        //     {4,5,6}, 1 -> Rows
        //     {7,8,9}  2 -> Rows

                // Every Row is a Induvisivily an Array of size number of coloumns  
        // }
            //************************************//
            // If we pass an Array in any of Function and chage the value int that Function it will reflect at original one;
        // data_type[][] Array_name = new data_type[rows][columns(optional)];


        int[][] arr = new int[3][2]; // coloums are Optional

        // input 
        Scanner in = new Scanner(System.in);

        for(int rows = 0; rows < arr.length; rows++){
            for(int col = 0; col < arr[rows].length; col++){
                System.out.print(":-> ");
                arr[rows][col] = in.nextInt();
            }

        }

        // Output
        System.out.println();

        for(int rows = 0; rows < arr.length; rows++){
            for(int col = 0; col < arr[rows].length; col++){
               System.out.print(arr[rows][col]+", ");
            }
            System.out.println();

        }
        System.out.println();
        System.out.println();

        for(int[] a : arr){
            System.out.println(Arrays.toString(a));
        }
            System.out.println();
            System.out.println();
        for(int row = 0; row < arr.length; row++){
            System.out.println(Arrays.toString(arr[row]));
        }
    }
}
