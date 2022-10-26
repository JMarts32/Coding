package LeetCode.Medium.ContinuosSubArraySum;

/*
Given an integer array nums and an integer k,
return true if nums has a continuous subarray of size at least
two whose elements sum up to a multiple of k, or false otherwise.

An integer x is a multiple of k if there exists an integer n such
that x = n * k. 0 is always a multiple of k.
 */
public class Solution {
    public boolean checkSubarraySum(int[] nums, int k) {

        for (int j = 1; j < nums.length; j++){
            if (nums[j] == 0 && nums[j-1] == 0) return true;
        }

        // Go throught the nums array to find the SubArray
        for (int i = 1; i<nums.length; i++){
            nums[i] += nums[i-1];
            if (nums[i]%k == 0 ) return true;
            int x = i;
            while (x > 1 && nums[i] > k){
                if((nums[i] - nums[x-2])%k == 0) return true;
                x--;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        Solution s = new Solution();
        int[] a = {0,0};
        System.out.println(s.checkSubarraySum(a,1));
    }
}
