package LeetCode.Easy.ContainsDuplicateII;

import java.util.HashMap;
import java.util.Map;

public class Solution {
    public boolean containsNearbyDuplicate(int[] nums, int k) {
        // There are no substractions that its result is 0.
        if (k == 0) return false;

        // Using a map we are going to know the indices of those who are repeate
        Map<Integer,Integer> reps = new HashMap<>();
        for (int i = 0; i < nums.length; i++){
            // If the value is already in the map it might substract the indices
            if (reps.containsKey(nums[i]) && Math.abs(reps.get(nums[i])-i) <= k){
                // If the substraction is in the specified range (<=k) adds to cont that 1 pair
                // The numbers repeated fulfill the restricctions
                return true;
            }else { // Is added to the map each one of the numbers
                reps.put(nums[i],i);
            }
        }
        return false;
    }

    public static void main(String[] args) {
        Solution sol = new Solution();
        int[] o = {1,2,3,1};
        System.out.println(sol.containsNearbyDuplicate(o,3));
    }
}
