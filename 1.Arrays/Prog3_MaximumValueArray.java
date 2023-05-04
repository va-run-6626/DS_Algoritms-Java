/**
 * Prog3_MaximumValueArray
 */
public class Prog3_MaximumValueArray {
    public static void main(String[] args) {
        int[] arr = {3,5,2,10,7,5,20};
        System.out.println("Max is :"+findMax(arr));
    }
    public static int findMax(int[]arr){
        int max = Integer.MIN_VALUE;
        for(int i : arr){
            max = Math.max(max, i);
        }
        return max;
    }
}