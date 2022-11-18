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

        // We are putting all the numbers into a tree map to organize them
        TreeMap<Integer, String> tm = new TreeMap<>();
        Map<Integer, String> hm = new HashMap<>();

        // Result array
        int[] res = new int[2];

        // Add the elements to the hashmap
        for (int i = 0; i < nums.length; i++) {
            if (hm.containsKey(nums[i])) {
                hm.replace(nums[i], hm.get(nums[i]) + i);
            } else {
                hm.put(nums[i], String.valueOf(i));
            }
        }

        // number of total numbers in the array -> -1 is the final position in the array
        int rec = hm.keySet().size();
        int cont = 0;

        while (cont < rec) {

            // reviews the last object in the array of keys
            int last = (Integer) hm.keySet().toArray()[rec-1];

            //Reviews the first object in the array of keys
            int first = (Integer) hm.keySet().toArray()[0];

            if (last < first){
                last = (Integer) hm.keySet().toArray()[0];
                first = (Integer) hm.keySet().toArray()[rec-1];
            }

            if (hm.get(first).length() > 1 && first*2 == target){
                res[0] = Integer.parseInt(hm.get(first).split("")[0]);
                res[1] = Integer.parseInt(hm.get(first).split("")[1]);
                return res;
            }

            if (last + first <= target) {
                if (last == target && hm.containsKey(0)) {
                    res[0] = Integer.parseInt(hm.get(0).split("")[0]);
                    res[1] = Integer.parseInt(hm.get(last).split("")[0]);
                    return res;
                }


                if (hm.get(last).length() > 1 && last*2 == target){
                    res[0] = Integer.parseInt(hm.get(last).split("")[0]);
                    res[1] = Integer.parseInt(hm.get(last).split("")[1]);
                    return res;
                }

                if (last + first > target){
                    hm.remove(last);
                    hm.remove(first);
                } else {

                    if (last + first < target) hm.remove(first);

                    if (last + first == target){
                        res[0] = Integer.parseInt(hm.get(first));
                        res[1] = Integer.parseInt(hm.get(last));
                        return res;
                    }
                }

            }else {
                hm.remove(last);
            }
            rec = hm.keySet().size();
        }
        System.out.println(res);
        return res;
    }

    public static void main(String[] args) {
        Solution s = new Solution();
        int[] a = {-1,-2,-3,-4,-5};
        s.twoSum(a,-8);
    }
}
