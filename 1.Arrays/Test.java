import java.util.*;
/**
 * Test
 */
public class Test {
    public static void main(String[] args) {
        int[] arr1 = {1,2,3};
        System.out.println(Arrays.toString(arr1));
        int[] arr2 = {2,4,5};
        System.out.println(Arrays.toString(arr2));
        int[] ans = merge(arr1,arr1.length,arr2,arr2.length);
        System.out.println(Arrays.toString(ans));
    }
    public static int[] merge(int[] nums1, int m, int[] nums2, int n){
        int[] ans = new int[m+n];
        int i = 0; int j = 0; int k = 0;
        while(i < m && j < n){
            if(nums1[i] <= nums2[j]){
                ans[k++] = nums1[i++];
            }else{
                ans[k++] = nums2[j++];
            }
        }
        while(i < m){
            ans[k++] = nums1[i++];
        }
        while(j < n){
            ans[k++] = nums2[j++];
        }
        return ans;
    }
}