/**
 * Missing
 */
public class Missing {
    public static void main(String[] args) {
        int[]arr = {10,11,12,13,14,16,17,18};
        //given : index 0 can never be missing 
        //given : sorted array and in Range 
        int missed = missing(arr); 
        System.out.println("Missing Number is : " +missed);
    }
    public static int missing(int[]arr){
        int miss = arr[0];
        for(int i = 1; i < arr.length; i++){
            miss += 1;
            if(miss != arr[i]){
                return miss;
            }
        }
        return -1;
    }
    
}