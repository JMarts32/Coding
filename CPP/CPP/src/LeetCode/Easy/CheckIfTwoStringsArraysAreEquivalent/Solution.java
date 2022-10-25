package LeetCode.Easy.CheckIfTwoStringsArraysAreEquivalent;

/*

 */
public class Solution {
    public boolean arrayStringsAreEqual(String[] word1, String[] word2) {

        // We are creating two Strings to compare them
        StringBuilder sb1 = new StringBuilder();
        StringBuilder sb2 = new StringBuilder();

        // When the Arrays only contain 1 element
        if (word1.length == 1 && word2.length ==1 ){
            if (word1[0].equals(word2[0])) return true;
            else return false;
        }

        for (int i = 0; i < word1.length; i ++) {
            sb1.append(word1[i]);
        }

        for (int i = 0; i < word2.length; i ++) {
            sb2.append(word2[i]);
        }

        if (sb2.toString().equals(sb1.toString())) return true;
        else return false;
    }
}
