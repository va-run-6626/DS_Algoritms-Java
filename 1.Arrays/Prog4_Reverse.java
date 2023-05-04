import java.util.*;
public class Prog4_Reverse {
    public static void main(String[] args) {
        int[]arr = {1,2,3,4,5,6,7,8,9,10};
        System.out.println(Arrays.toString(arr));
        reverse(arr);
        System.out.println(Arrays.toString(arr));
    }
    public static void reverse(int[]arr){
        for(int i = 0, j = arr.length-1; i <=arr.length/2 && j >= arr.length/2; i++, j--){
            swap(arr,i,j);
        }
    }
    public static void swap(int[]arr, int i , int j){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}
