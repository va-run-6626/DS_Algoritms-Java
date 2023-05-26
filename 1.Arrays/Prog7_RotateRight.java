import java.util.*;
public class Prog7_RotateRight {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,7};
        int k = 10;
        System.out.println(Arrays.toString(arr));
        rotate(arr,k);
        System.out.println(Arrays.toString(arr));
    }
    public static void rotate(int[] nums, int k){
        k = k % nums.length;
        reverse(nums,0,nums.length-1-k);
        reverse(nums,0,nums.length-1);
        reverse(nums,0,k-1);
    }
    public static void reverse(int[]arr,int s, int e){
        int len = e - s + 1;
        for(int i = s, j = e; i <= len/2 && j >= len/2; i++,j--){
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
        }
    }
}