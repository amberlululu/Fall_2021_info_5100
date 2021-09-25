package Assignment1;

import java.util.*;
//Question 1:
//        You are given an integer array nums. The unique elements of an array are the elements that
//        appear exactly once in the array.
//        Return the sum of all the unique elements of nums.
//        Example 1:
//        Input: nums = [1,2,3,2]
//        Output: 4
//        Explanation: The unique elements are [1,3], and the sum is 4.
//        Example 2:
//        Input: nums = [1,1,1,1,1]
//        Output: 0
//        Explanation: There are no unique elements, and the sum is 0.
//        Example 3:
//        Input: nums = [1,2,3,4,5]
//        Output: 15
//        Explanation: The unique elements are [1,2,3,4,5], and the sum is 15.

public class Question1 {

    public static void main(String[] args) {
        int[] arr1 ={1,2,3,2};
        System.out.println(getDum(arr1));

        int[] arr2 ={1,1,1,1,1};
        System.out.println(getDum(arr2));

        int[] arr3 ={1,2,3,4,5};
        System.out.println(getDum(arr3));
    }

    // Time Complexity O(n)
    // Space Complexity O(n)

    public static int getDum(int[] nums){
        Map<Integer, Integer> map = new HashMap<>();

        int sum = 0;
        for(int num : nums){
            map.put(num, map.getOrDefault(num, 0)+1);
        }

        for(int key: map.keySet()){
            if(map.get(key)== 1){
                sum += key;
            }
        }
        return sum;
    }

}
