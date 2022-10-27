package LeetCode.TopInterviewQuestions.TwoSum;

import java.util.TreeMap;

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
        // We are putting all the numbers into a tree map
        TreeMap<Integer,String> tm = new TreeMap<>();

        int[] res = new int[2];

        // Add the elements to the tree
        for (int i = 0; i < nums.length; i++){
            if (tm.containsKey(nums[i])){
                tm.replace(nums[i], tm.get(nums[i]).toString() + String.valueOf(i));
            } else {
                tm.put(nums[i],String.valueOf(i));
            }
        }

        int rec = tm.keySet().size();
        int cont = 0;

        while (cont < rec){

            if (!(tm.lastKey() > target)){
                if (tm.lastKey() == target && tm.get(tm.lastKey()).length() == 1 && tm.keySet().contains(0)){
                    res[0] = Integer.parseInt(tm.get(0));
                    res[1] = Integer.parseInt(tm.get(tm.lastKey()));
                    return res;
                }


                if (tm.get(tm.lastKey()).length() > 1 && tm.lastKey()*2 == target){
                    res[0] = Integer.parseInt(tm.get(tm.lastKey()).split("")[0]);
                    res[1] = Integer.parseInt(tm.get(tm.lastKey()).split("")[1]);
                    return res;
                }

                if (tm.get(tm.firstKey()).length() > 1 && tm.firstKey()*2 == target){
                    res[0] = Integer.parseInt(tm.get(tm.firstKey()).split("")[0]);
                    res[1] = Integer.parseInt(tm.get(tm.firstKey()).split("")[1]);
                    return res;
                }

                if (tm.lastKey() + tm.firstKey() == target){
                    res[0] = Integer.parseInt(tm.get(tm.firstKey()));
                    res[1] = Integer.parseInt(tm.get(tm.lastKey()));
                    return res;
                } else {
                    tm.remove(tm.firstKey());
                    tm.remove(tm.firstKey());
                    cont++;
                }
            } else {
                tm.remove(tm.lastKey());
            }
        }
        return res;
    }

    public static void main(String[] args) {
        Solution s = new Solution();
        int[] a = {0,4,3,0};
        System.out.println(s.twoSum(a,0));
    }
}
