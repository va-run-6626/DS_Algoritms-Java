import java.util.Arrays;

/**
 * Prog1_BinarySearchCode
 */
public class Prog1_BinarySearchCode {
    public static void main(String[] args) {
        int[]arr = {1,2,3,4,5,6,7,8,9,10};
        int target = 8;
        System.out.println("Array : "+Arrays.toString(arr) + " Target : " + target);
        System.out.println("Target found at : "  + binarySearch(arr,target));
    }
    static int binarySearch(int[]arr, int target){
        int start = 0;
        int end = arr.length-1;
        while(start <= end){
            int mid = start +(end-start)/2;
            if(arr[mid]==target){
                return mid;
            }else if(arr[mid] > target){
                end = mid - 1;
            }else{
                start = mid + 1;
            }
        }
        return -1;
    }
}