package DSA;

public class BinarySearch {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,7,8,9};

        int target = 9;

        binarySearch(arr, target);
    }


    // return the index 
    static void binarySearch(int[] arr, int target){
        int start = 0; 
        int end = 0;
        
        
        int mid = ( start + end )  / 2; 

        while(start<=end){
            if(arr[mid] == target){
            System.out.println(mid);
            }

            if(arr[mid] > target){
                end = mid -1;
            }else{
                start = mid + 1;
            }
        }
        
    }
}
