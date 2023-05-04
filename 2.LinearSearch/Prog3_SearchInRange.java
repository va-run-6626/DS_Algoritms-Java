/**
 * Prog3_SearchInRange
 */
public class Prog3_SearchInRange {
    public static void main(String[] args) {
        int[] arr= {18,12,-7,3,14,28};
        int s = 1;
        int e = 4;
        int target = 3;
        System.out.println("Target found in range " + s + " to " + e +" : " + seachRange(arr,s,e,target));
    }
    static boolean seachRange(int[]arr, int s , int e, int target){
        for (int i = s; i <= e; i++) {
            if(arr[i] == target){
                return true;
            }
        }
        return false;
    }
}