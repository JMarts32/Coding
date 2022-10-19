package LeetCode.Medium.DecodeString;

public class Solution {
    public String decodeString(String s) {
        String sr = "";
        for (int i = 1; i<= s.length(); i++){
            sr = getString(sr);
        }
        return sr;
    }

    public String getString(String sr){
        StringBuilder s = new StringBuilder();
        char c = s.charAt(0);
        for (int i = 1; i <= sr.length(); i ++){
            if (!Character.isAlphabetic(c)){
                int reps = Character.getNumericValue(c);
            }
        }

        return "Hola";
    }
    public static void main(String[] args) {

    }
}
