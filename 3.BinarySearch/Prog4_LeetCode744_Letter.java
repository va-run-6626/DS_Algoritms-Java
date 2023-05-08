/**
 * Prog4_LeetCode744_Letter
 */
public class Prog4_LeetCode744_Letter {
    public static void main(String[] args) {
        char[] arr = {'b','d','f','h','i'};
        char target = 'j';
        int ans = findLetter(arr,target);
        System.out.println("Smallest Letter Greater Than Target ("+ target+") is : "+arr[ans]);
    }
    static int findLetter(char[]arr, char target){
        int start = 0;
        int end = arr.length-1;
        while(start <= end){
            int mid = start + (end - start) / 2;
            if(target < arr[mid]){
                end = mid - 1;
            }else{
                start = mid + 1;
            }
        }
        return start % arr.length;
    }
}