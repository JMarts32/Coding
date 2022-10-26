package LeetCode.Medium.ContinuosSubArraySum;

/*

 */
public class Solution {
    public boolean checkSubarraySum(int[] nums, int k) {

        // The nums subArray might be at least 2
        if (nums.length < 2) return false;

        // Go throught the nums array to find the SubArray
        for (int i = 0; i<nums.length-1; i++){
            int sum = nums[i] + nums[i+1];

            if (sum%k == 0 ) return true;

            // If the sum is lower than the target number
            if ( i< nums.length -2){
                // Keep looking for numbers until match te target or passes the target
                for (int x = i+2; x <nums.length; x ++){
                    sum += nums[x];
                    if (sum % k == 0) return true;
                }
            }
        }
        return false;
    }

    public static void main(String[] args) {
        Solution s = new Solution();
        int[] a = {23,2,6,4,7};
        System.out.println(s.checkSubarraySum(a,6));
    }
}
