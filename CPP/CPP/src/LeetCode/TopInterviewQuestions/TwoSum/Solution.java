package LeetCode.TopInterviewQuestions.TwoSum;

import java.util.*;

/*
Given an array of integers nums and an integer target, return indices of the two numbers such that they add up to target.

You may assume that each input would have exactly one solution, and you may not use the same element twice.

You can return the answer in any order.



Example 1:

Input: nums = [2,7,11,15], target = 9
Output: [0,1]
Explanation: Because nums[0] + nums[1] == 9, we return [0, 1].
Example 2:

Input: nums = [3,2,4], target = 6
Output: [1,2]
Example 3:

Input: nums = [3,3], target = 6
Output: [0,1]
 */
public class Solution {
    public int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> hm = new HashMap<>();

        // Result array
        int[] res = new int[2];

        int numsl = nums.length;

        for (int i = 0; i<numsl;i++ ){
            if (hm.containsKey(target-nums[i])){
                res[1] = i;
                res[0] = hm.get(target-nums[i]);
            }
            hm.put(nums[i],i);
        }
        return res;
    }

    public static void main(String[] args) {
        Solution s = new Solution();
        int[] a = {-1,-2,-3,-4,-5};
        s.twoSum(a,-8);
    }
}
