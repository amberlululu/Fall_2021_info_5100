package Assignment1;
import java.util.*;
//Question 3:
//        Find first non repeated integer in an array.
//        Example: int[] arr = {2,3,4,2,2,3,5,7}
//        Output : 4

public class Question3 {
    public static void main(String[] args) {
        int[] arr = {2,3,4,2,2,3,5,7};
        System.out.println(nonRepeatInt(arr));
        System.out.println(nonRepeatInt2(arr));

    }

    // Time Complexity O(n)
    // Space Complexity O(n)
    // HashMap
    public static int nonRepeatInt(int[] nums){
        HashMap<Integer, Integer> map = new HashMap<>();
        int res = 0;
        for(int num: nums){
            map.put(num, map.getOrDefault(num, 0)+1);
        }
        for(int key: map.keySet()){
            if(map.get(key) == 1){
                res = key;
                break;
            }
        }

        return res;

    }

    // Time Complexity
    // Space Complexity
    // Xor

    public static int nonRepeatInt2(int[] nums){
        int res = 0;
        for(int num : nums){
            res^=num;
        }
        return res;

    }
}
