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

        // Concatenate each of the Strings int he array word1 to compare it
        for (int i = 0; i < word1.length; i ++) {
            sb1.append(word1[i]);
        }

        // Concatenate each of the Strings int he array word2 to compare it
        for (int i = 0; i < word2.length; i ++) {
            sb2.append(word2[i]);
        }

        // Compare the String, if they are the same it returns true
        if (sb2.toString().equals(sb1.toString())) return true;
        else return false;
    }
}
