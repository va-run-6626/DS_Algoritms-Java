
/**
 * Prog3_CeilingOfANumber
 */
public class Prog3_CeilingOfANumber {
    public static void main(String[] args) {
        int[] arr = {2,3,5,9,14,16,18};
        int target = 15;
        int ceiling = ceilingNumber(arr, target);
        System.out.println("Ceiling of target ("+target+") is at : "+ceiling+" with value : "+arr[ceiling]);

    }
    static int ceilingNumber(int[] arr, int target){
        int start = 0;
        int end = arr.length;
        while(start <= end){
            int mid = start + (end - start) / 2;
            if(arr[mid] == target){
                return mid;
            }else if(arr[mid] > target){
                end = mid - 1;
            }else{
                start = mid + 1;
            }
        }
        return start;
    }
}