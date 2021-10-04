package Assignment2;
import java.util.*;

//5)Spiral Matrix-https://leetcode.com/problems/spiral-matrix/
// Given an m x n matrix, return all elements of the matrix in spiral order.
// Example 1:Input:matrix = [[1,2,3],[4,5,6],[7,8,9]]Output:[1,2,3,6,9,8,7,4,5]
// Example 2:Input:matrix = [[1,2,3,4],[5,6,7,8],[9,10,11,12]]Output:[1,2,3,4,8,12,11,10,9,5,6,7]
// Constraints:•m == matrix.length•n == matrix[i].length•1 <= m, n <= 10•-100 <= matrix[i][j] <= 100

public class Question5 {
    public static void main(String[] args) {
        int[][] matrix1 = {{1,2,3},{4,5,6},{7,8,9}};
        System.out.println(spiralOrder(matrix1));
        int[][] matrix2 = {{1,2,3,4},{5,6,7,8},{9,10,11,12}};
        System.out.println(spiralOrder(matrix2));


    }
    // Time Complexity O(n)
    // Space Complexity O(1) list is used to return the function we co not count that as space usage
    public static List<Integer> spiralOrder(int[][] matrix){
        List<Integer> list = new ArrayList<>();
        int rowBegin = 0;
        int rowEnd = matrix.length-1;
        int colBegin = 0;
        int colEnd = matrix[0].length-1;

        while(rowBegin <= rowEnd && colBegin <= colEnd){
            // from left to right
            for(int i = colBegin; i <=colEnd; i++){
                list.add(matrix[rowBegin][i]);
            }
            rowBegin++;

            // from top to bottom

            for(int i = rowBegin; i <= rowEnd; i++){
                list.add(matrix[i][colEnd]);
            }
            colEnd--;

            // from right to left
            if(rowBegin <= rowEnd){
                for(int i = colEnd; i >=colBegin; i--){
                    list.add(matrix[rowEnd][i]);
                }
            }
           rowEnd--;

            // from bottom to top

            if(colBegin <= colEnd){
                for(int i = rowEnd; i>=rowBegin; i--){
                    list.add(matrix[i][colBegin]);
                }
                colBegin++;
            }

        }
        return list;
    }

}
