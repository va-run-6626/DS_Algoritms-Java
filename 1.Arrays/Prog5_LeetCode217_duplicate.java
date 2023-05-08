import java.util.*;
/**
 * Prog5_LeetCode217_duplicate
 */
public class Prog5_LeetCode217_duplicate {
    public static void main(String[] args){
        int[] arr = {1,2,3,1};
        System.out.println("if Array is Duplicate : " + isDuplicate(arr));
    }
    static boolean isDuplicate(int[] arr){
        Arrays.sort(arr);
        for (int i = 0; i < arr.length-1; i++) {
            if(arr[i] == arr[i+1]) return true;
        }
        return false;
    }
}