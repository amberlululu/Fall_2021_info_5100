package Question3;

import java.util.*;

public class Question3 {
        public static void main(String[] args) {
            int[] nums = {1,1,1};
            int k = 2;
            System.out.println(subarraySum(nums,k));
        }

        public static int subarraySum(int[] nums, int k){
            Map<Integer, Integer> map = new HashMap<>();
            map.put(0, 1);
            int sum = 0;
            int count  = 0;

            if(nums.length == 0 || nums == null) return 0;
            for(int num : nums){
                sum += num;
                if(map.containsKey(sum-k)){
                    count +=map.get(sum-k);
                }
                map.put(sum, map.getOrDefault(sum,0)+1);
            }
            return count;
        }

}
