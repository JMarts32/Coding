package LeetCode.Easy.RansomeNote;

import java.util.HashMap;
import java.util.Map;

public class Solution {

    private Map<String,Integer> compare = new HashMap<>();
    public boolean canConstruct(String ransomNote, String magazine) {

        if (ransomNote.equals("")){return false;}

        for (int i = 0; i < ransomNote.length(); i++){
            if (compare.containsKey(String.valueOf(ransomNote.charAt(i)))){
                int cambiar = compare.get(String.valueOf(ransomNote.charAt(i)));
                compare.replace(String.valueOf(ransomNote.charAt(i)),cambiar+1);
            }else {
                compare.put(String.valueOf(ransomNote.charAt(i)),1);
            }
        }

        for (int i = 0; i < magazine.length(); i++){
            if (compare.containsKey(String.valueOf(magazine.charAt(i))) && compare.get(String.valueOf(magazine.charAt(i)))>1){
                int cambiar = compare.get(String.valueOf(magazine.charAt(i)));
                compare.replace(String.valueOf(magazine.charAt(i)),cambiar-1);
            }
            else if (compare.containsKey(String.valueOf(magazine.charAt(i))) && compare.get(String.valueOf(magazine.charAt(i)))==1){
                compare.remove(String.valueOf(magazine.charAt(i)));
            }
        }

        if (compare.isEmpty()){
            System.out.println(true);
            return true;
        }
        System.out.println(false);
        return false;
    }

    public static void main(String[] args) {
        Solution solucion = new Solution();
        solucion.canConstruct("radar","radar");
    }
}
