package LeetCode.Medium.PerfectSquares;

public class Solution {
    public int numSquares(int n) {
        int[] data = new int[n+1];
        return recursion(n,data);
    }

    public int recursion(int n, int[] memo){
        if (n < 4) return n;

        if (memo[n] != 0){
            return memo[n];
        }

        int ans = n;

        for (int i = 1; i * i <= n; i++) {
            int square = i * i;
            ans = Math.min(ans, 1 + recursion(n - square, memo));
        }
        return memo[n] = ans;
    }

    public static void main(String[] args) {
        Solution sol = new Solution();

        System.out.println(sol.numSquares(5));
    }
}
