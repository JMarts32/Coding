package LeetCode.Easy.CountAndSay;

import java.net.Inet4Address;
import java.util.*;

/*
Non recursive solution to the problem
 */
public class Solution {
    public String countAndSay(int n) {
        // Always might be grater than 1, and 1 is the base case
        String s = "1";
        // It iterate from the bottom to the n wanted
        for (int i = 2; i<= n; i++){
            s = countIndex(s);
        }
        return s;
    }

    public String countIndex(String s){
        // Here it builds the String
        StringBuilder sb = new StringBuilder();
        // Takes the first character to verify if it repeats along the String
        char c = s.charAt(0);
        // Initialize in 1 because the character exists
        int count = 1;
        // Goes through the String array
        for (int i = 1; i<s.length(); i++){
            // If the character repeats we add 1 to the count
            if (s.charAt(i) == c){
                count ++;
            }else { // Means there are no more repetitions of the String. Stops the count
                sb.append(count);
                sb.append(c);
                // It is like a re-initialization but in the nex character non repetition verification
                c = s.charAt(i);
                // We restart the count
                count = 1;
            }
        }
        sb.append(count);
        sb.append(c);
        System.out.println(sb.toString());
        return sb.toString();
    }
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        Solution solucion = new Solution();
        solucion.countAndSay(n);
    }
}
