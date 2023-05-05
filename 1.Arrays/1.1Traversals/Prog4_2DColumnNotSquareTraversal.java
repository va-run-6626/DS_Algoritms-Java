public class Prog4_2DColumnNotSquareTraversal {
    public static void main(String[] args) {
        int[][] arr ={
            {1, 2, 3},
            {4, 5, 6},
        };
        int row = arr.length;
        int col = arr[0].length;
        for (int i = 0; i < col; i++) {
            for (int j = 0; j < row; j++) {
                System.out.print(arr[j][i] + " ");
            }
            System.out.println();
        }
    }
}
