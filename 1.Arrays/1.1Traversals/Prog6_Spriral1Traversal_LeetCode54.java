import java.util.*;
/**
 * Prog6_Spriral1Traversal_LeetCode54
 */
public class Prog6_Spriral1Traversal_LeetCode54 {
    public static void main(String[] args) {
        int[][] matrix = {
            {1, 2, 3, 4},
            {5, 6, 7, 8},
            {9, 10, 11, 12},
            {13, 14, 15,16}
        };
        List<Integer> list = spiralPrinting(matrix);
        for(Integer i : list){
            System.out.print(i + " ");
        }
    }
    static List<Integer> spiralPrinting(int[][] matrix){
        List<Integer> list = new ArrayList<>();

        //dimentions 
        int m = matrix.length;
        int n = matrix[0].length;

        //directions
        int top = 0;
        int bottom = m-1;
        int left = 0;
        int right = n-1;

        while(top <= bottom && left <= right){
            //print left --> right
            for(int i = left; i <= right; i++){
                list.add(matrix[top][i]);
            }
            top++;
            //print top --> bottom
            for(int i = top; i <= bottom; i++){
                list.add(matrix[i][right]);
            }
            right--;
            //print right --> left
            if(top <= bottom){
                for (int i = right; i >= left; i--) {
                    list.add(matrix[bottom][i]);
                }
                bottom--;
            }
            //print bottom --> top
            if(left <= right){
                for (int i = bottom; i >= top; i--) {
                    list.add(matrix[i][left]);
                }
                left++;
            }
        }
        return list;
    }
}