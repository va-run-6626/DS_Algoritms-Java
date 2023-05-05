import java.util.*;
/**
 * Prog2_OrderAgnosticBinarySearch
 */
public class Prog2_OrderAgnosticBinarySearch {
    public static void main(String[] args) {
        int[] arr1 = {1,2,3,4,5,6,7,8,9,10};
        int target1 = 5;
        int[] arr2 = {10,9,8,7,6,5,4,3,2,1};
        int target2 = 9;
        System.out.println("Array : "+Arrays.toString(arr1) + " Target : " + target1);
        System.out.println("Target found at : "  + OAbinarySearch(arr1,target1));
        System.out.println("Array : "+Arrays.toString(arr2) + " Target : " + target2);
        System.out.println("Target found at : "  + OAbinarySearch(arr2,target2));
    }
    static int OAbinarySearch(int[] arr, int target){
        int start = 0;
        int end = arr.length-1;
        while(start <= end){
            int mid = start + (end - start)/2;
            if(arr[mid] == target){
                return mid;
            }else if(arr[0] < arr[arr.length-1]){
                if(arr[mid] > target){
                    end = mid - 1;
                }else{
                    start = mid + 1;
                }
            }else{
                if(arr[mid] > target){
                    start = mid + 1;
                }else{
                    end = mid - 1;
                }
            }
        }
        return -1;
    }
}