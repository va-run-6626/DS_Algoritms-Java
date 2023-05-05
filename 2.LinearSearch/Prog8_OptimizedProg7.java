/**
 * Prog7_EvenDigitsLC1295
 */
public class Prog8_OptimizedProg7 {
    public static void main(String[] args){
        int[] arr = {12,345,2,6,7896};
        System.out.println("No of even Digits : " + findEvenNums(arr));
    }
    static int findEvenNums(int[]nums){
        int count = 0;
        for (int i = 0; i < nums.length; i++) {
            if(isEven(nums[i])){
                count++;
            }
        }
        return count;
    }
    static boolean isEven(int num){
        int c = digits(num);
        if( c % 2 == 1)return false;
        return true;
    }
    static int digits(int n){
        if(n<0){
            n *= -1;
        }
        return (int)(Math.log10(n))+1;
    }
}