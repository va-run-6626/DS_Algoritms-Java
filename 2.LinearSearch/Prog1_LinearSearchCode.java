/**
 * Prog1_LinearSearchCode
 */
public class Prog1_LinearSearchCode {
    public static void main(String[] args) {
        int[]arr = {1,2,3,4,5,6,7,8,9,10};
        int target = 8;
        System.out.println("Target "+target+" found at : "+LinearSearch(arr, target));
    }
    static int LinearSearch(int[]arr, int target){
        if(arr.length == 0){
            return -1;
        }
        for(int i = 0;i < arr.length; i++){
            if(arr[i] == target){
                return i;
            }
        }
        return -1;
    }    
}