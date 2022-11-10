package LeetCode.Easy.RemoveAllAdjacenteDuplicatesInString;

import java.util.*;

public class Solution {
    public String removeDuplicates(String s) {
        String[] sl = s.split("");
        StringBuilder sb1 = new StringBuilder();
        StringBuilder sb2 = new StringBuilder(2);
        Map<String, Integer> sm = new HashMap<>();

        for (int i = 0; i < s.length(); i++) {
            if (sl.length == 0) {
                sb1.append(sl[i]);
            } else {
                String comp = Character.toString(sb1.charAt(0));
                if (comp == sl[i]) {
                    sb1.append(sl[1]);
                } else{
                    if (sb1.length() > 1){
                        String sb1S = sb1.toString();
                        sb2.delete(sb2.indexOf(Character.toString(sb2.charAt(i-1))),i-1);
                        i = -1;
                    }else {
                        sb1.delete(i,i);
                        sb1.append(sl[i]);
                    }
                }
            }
        }

        return sb2.toString();
    }


}