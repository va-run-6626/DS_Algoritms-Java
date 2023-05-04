/**
 * Prog4_MinimumNumber
 */
public class Prog4_MinimumNumber {
    public static void main(String[] args) {
        int[] arr = {18,12,-7,3,14,28};
        System.out.println("The minmum number is : " + minimum(arr));
    }
    static int minimum(int[] arr){
        int min = Integer.MAX_VALUE;
        for(int i : arr){
            min = Math.min(min,i);
        }
        return min;
    }
}