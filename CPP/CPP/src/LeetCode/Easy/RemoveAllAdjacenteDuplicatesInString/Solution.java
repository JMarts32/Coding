package LeetCode.Easy.RemoveAllAdjacenteDuplicatesInString;

import java.util.*;

public class Solution {
    public String removeDuplicates(String s) {
        StringBuilder sb1 = new StringBuilder();
        StringBuilder sb2 = new StringBuilder(s);
        Map<String, Integer> sm = new HashMap<>();

        for (int i = 0; i < s.length(); i++) {
            if (!(i == s.length()-1)){
                String[] sl = sb2.toString().split("");
                if (sb1.isEmpty()) {
                    sb1.append(sl[i]);
                } else {
                    String comp = Character.toString(sb1.charAt(0));
                    if (comp.equals(sl[i])) {
                        sb1.append(sl[1]);
                    } else{
                        if (sb1.length() > 1){
                            String sb1S = sb1.toString();
                            sb2.delete(sb2.indexOf(Character.toString(sb2.charAt(i-1))),i);
                            i=i==0?i-1:i-2;
                            sb1.delete(0,sb1.length());
                        }else {
                            if (i!=-1){
                                sb1.delete(0,1);
                                sb1.append(sl[i]);
                            }
                        }
                    }
                }
            }
        }

        return sb2.toString();
    }

    public static void main(String[] args) {
        Solution sol = new Solution();
        System.out.println(sol.removeDuplicates("abbac"));
    }
}