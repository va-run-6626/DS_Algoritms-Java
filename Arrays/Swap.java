/**
 * Swap
 */
public class Swap {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,7,8,9,10};
        printArray(arr);
        swap(arr,1,5);
        printArray(arr);
    }
    public static void swap(int[]arr, int i, int j){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
    public static void printArray(int[] arr){
        for(int i : arr){
            System.out.print(i+" ");
        }
        System.out.println();
    }
}