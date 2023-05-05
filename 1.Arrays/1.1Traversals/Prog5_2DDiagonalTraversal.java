public class Prog5_2DDiagonalTraversal {
    public static void main(String[] args) {
        int[][] arr = {
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9},
        };
        //diagonals only exists in square matrix!
        //primary diagonal
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i][i] + " ");
        }
        System.out.println();
        //secondary diagonal
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i][arr.length-1-i] + " ");
        }
        System.out.println();

    }
}
