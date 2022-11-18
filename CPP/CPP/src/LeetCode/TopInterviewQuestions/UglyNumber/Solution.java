package LeetCode.TopInterviewQuestions.UglyNumber;

public class Solution {
    //Positive integer
    //Prime numbers 2,3, and 5

    public boolean isUgly(int n){
        // Ugly number is a positive integer
        if (n < 1) return false;
        // No prime factors, therefore all its prime factors are limited
        if (n == 1)return true;

        // Look for the prime factors, if it passes 5, then return false
        for (int i = 2; i < n; i++){
            if (i > 5) return false;

            while (n%i == 0){
                n /= i;
            }
        }

        return true;
    }
}
