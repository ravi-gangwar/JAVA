import java.util.Arrays;
import java.util.Scanner;

public class Array {
    public static void main(String[] args) {
        int[] array1 = {1,2,3,4,5,6,7,8};  // data_type ArrayName[]; this is also valid
        Scanner in = new Scanner(System.in);
        

        for(int i = 0; i<array1.length; i++){
            System.out.print("Give Interger Value of index" + i +"to store in the Array: ");
            array1[i] = in.nextInt();
        }
        for(int i = 0; i<array1.length; i++){
            System.out.print(" " + array1[i] +",");
        }


        for(int num : array1){
            System.out.print(" " + num +",");
        }

        System.out.println(Arrays.toString(array1));


        // When we pass a array in function and in that function if we will change anything it will also change in Original array;
    }
}
