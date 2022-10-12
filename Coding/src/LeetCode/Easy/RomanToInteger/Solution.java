package LeetCode.Easy.RomanToInteger;

import java.util.Map;
import static java.util.Map.entry;

public class Solution {

    private final Map<String,Integer> roman = Map.ofEntries(
            entry("I",1),
            entry("V",5),
            entry("X",10),
            entry("L",50),
            entry("C",100),
            entry("D",500),
            entry("M",1000)
    );

    public int romanToInt(String s) {
        int contador = 0;
        for (int i = 0; i < s.length(); i++) {
            int uno = roman.get(String.valueOf(s.charAt(i)));
            if (i<s.length()-1 && uno < roman.get(String.valueOf(s.charAt(i+1)))){
                contador -= roman.get(String.valueOf(s.charAt(i)));
                contador += roman.get(String.valueOf(s.charAt(i+1)));
                i ++;
            }else {
                contador += roman.get(String.valueOf(s.charAt(i)));
            }
        }
        return contador;
    }

    public static void main(String[] args) {
        Solution solucion = new Solution();
        solucion.romanToInt("II");
    }

}
