package Assignment1;
import java.util.*;
//Question 2:
//        Given an integer array nums sorted in non-decreasing order, return an array of the squares of each
//        number sorted in non-decreasing order.
//        Example 1:
//        Input: nums = [-4,-1,0,3,10]
//        Output: [0,1,9,16,100]
//        Explanation: After squaring, the array becomes [16,1,0,9,100].
//        After sorting, it becomes [0,1,9,16,100].
//        Example 2:
//        Input: nums = [-7,-3,2,3,11]
//        Output: [4,9,9,49,121]


public class Question2 {
    public static void main(String[] args) {
        int[]arr1 = {-4,-1,0,3,10};
        System.out.println(Arrays.toString(getSquare(arr1)));
        int[]arr2 = {-7,-3,2,3,11};
        System.out.println(Arrays.toString(getSquare(arr2)));

    }

    // Time Complexity O(n)
    // Space Complexity O(1)
    public static int[] getSquare(int[] arr){
        int left = 0;
        int right = arr.length-1;

        int[] res = new int[arr.length];

        for(int i = arr.length-1; i>=0; i--){
            if(Math.abs(arr[left]) > Math.abs(arr[right])){
                res[i] = arr[left]*arr[left];
                left++;
            }else{
                res[i] = arr[right]*arr[right];
                right--;
            }
        }

        return res;

    }
}
