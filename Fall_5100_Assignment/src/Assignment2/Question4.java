package Assignment2;
import java.util.*;
//4) Leetcode 48 Rotate Image-https://leetcode.com/problems/rotate-image/
// You are given an n x n 2D matrix representing an image, rotate the image by90degrees (clockwise).
// You have to rotate the image in-place, which means you have to modify the input 2D matrix directly.
// DO NOT allocate another 2D matrix and do the rotation.
// Example 1:Input:matrix = [[1,2,3],[4,5,6],[7,8,9]]Output:[[7,4,1],[8,5,2],[9,6,3]]
// Example 2:Input:matrix = [[5,1,9,11],[2,4,8,10],[13,3,6,7],[15,14,12,16]]Output:[[15,13,2,5],[14,3,4,1],[12,6,8,9],[16,7,10,11]]
// Example 3:Input:matrix = [[1]]Output:[[1]]
// Example 4:Input:matrix = [[1,2],[3,4]]Output:[[3,1],[4,2]]
// Constraints:•matrix.length == n•matrix[i].length == n•1 <= n <= 20•-1000 <= matrix[i][j] <= 1000
public class Question4 {
    public static void main(String[] args) {
        int[][] matrix1 = {{1,2,3},{4,5,6},{7,8,9}};
        rotate(matrix1);
        print(matrix1);
        int[][] matrix2 = {{5,1,9,11},{2,4,8,10},{13,3,6,7},{15,14,12,16}};
        rotate(matrix2);
        print(matrix2);
        int[][] matrix3 = {{1}};
        rotate(matrix3);
        print(matrix3);
        int[][] matrix4 = {{1,2},{3,4}};
        rotate(matrix4);
        print(matrix4);

    }

    // Time Complexity O(n*n)
    // Space Complexity O(1)
    public static void rotate(int[][] matrix){
        for(int i = 0; i < matrix.length; i++){
            for(int j = i ; j < matrix[0].length; j++){
                int temp = matrix[i][j];
                matrix[i][j] = matrix[j][i];
                matrix[j][i] = temp;
            }
        }

        for(int i = 0; i < matrix.length; i++){
            for(int j = 0; j < matrix[0].length/2; j++){
                int temp = matrix[i][j];
                matrix[i][j] = matrix[i][matrix.length-1-j];
                matrix[i][matrix.length-1-j] = temp;
            }
        }

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
