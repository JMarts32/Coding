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

        int max = 0;
        if (word1.length > word2.length) max = word1.length;
        else max = word2.length;

        for (int i = 0; i < max)
        {
        }
    }
}
