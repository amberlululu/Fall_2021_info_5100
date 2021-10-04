package Assignment2;
import java.util.*;
//1)Transpose Matrix: https://leetcode.com/problems/transpose-matrix/
// Given a 2D integer array matrix, return the transpose of matrix.
// The transpose of a matrix is the matrix flipped over its main diagonal,
// switching the matrix's row and column indices.
// Example 1:Input:matrix = [[1,2,3],[4,5,6],[7,8,9]]Output:[[1,4,7],[2,5,8],[3,6,9]]
// Example 2:Input:matrix = [[1,2,3],[4,5,6]]Output:[[1,4],[2,5],[3,6]]
// Constraints:•m == matrix.length•n == matrix[i].length•1 <= m, n <= 1000•1 <= m * n <= 105•-109<= matrix[i][j] <= 109
public class Question1 {
    public static void main(String[] args) {
        int[][] matrix1 = {{1,2,3},{4,5,6},{7,8,9}};
        int[][] res1 = transpose(matrix1);
        print(res1);


        int[][] matrix2 = {{1,2,3},{4,5,6}};
        int[][] res2 = transpose(matrix2);
        print(res2);



    }

    // Time Complexity O(m*n)
    // Space Complexity O(1)
    public static int[][] transpose(int[][] matrix){
        int m = matrix.length;
        int n = matrix[0].length;

        int[][] matrixB = new int[n][m];

        for(int i = 0; i < m; i ++){
            for(int j = 0; j < n; j++){
                matrixB[j][i] = matrix[i][j];
            }
        }
        return matrixB;
    }

    // this print function is only used to test the final result
    public static void print(int[][] matrix){
        for(int i = 0; i < matrix.length; i++){
            StringBuilder sb = new StringBuilder();
            sb.append("[");
            for(int j = 0; j < matrix[0].length; j++){
                sb.append(matrix[i][j]);
                if(j!= matrix[0].length-1){
                    sb.append(",");
                }

            }

            sb.append("]");
            System.out.println(sb.toString());
        }

    }


}
