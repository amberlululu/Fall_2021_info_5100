package Assignment2;
import java.util.*;
//3)Move Zeroes: https://leetcode.com/problems/move-zeroes/
// Given an integer array nums, move all0's to the end of it while maintaining the relative order of the non-zero elements.
// Note that you must do this in-place without making a copy of the array.
// Example 1:Input:nums = [0,1,0,3,12]Output:[1,3,12,0,0]
// Example 2:Input:nums = [0]Output:[0]
// Constraints:•1 <= nums.length <= 104•-231<= nums[i] <= 231-1
public class Question3 {
    public static void main(String[] args) {
        int[] nums1 = {0,1,0,3,12};
        int[] nums2 = {0};
        int[] nums3 = {0,1};
        moveZeros(nums1);
        System.out.println(Arrays.toString(nums1));
        moveZeros(nums2);
        System.out.println(Arrays.toString(nums2));
        moveZeros(nums3);
        System.out.println(Arrays.toString(nums3));

    }

    // Time Complexity O(n)
    // Space Complexity O(1)
    public static void moveZeros(int[] nums){
        int index = 0;
        for(int i = 0; i < nums.length; i++){
            if(nums[i]!= 0){
                nums[index] = nums[i];
                index++;
            }
        }

        for(int j = index; j < nums.length; j++){
            nums[j] = 0;
        }

    }

}
