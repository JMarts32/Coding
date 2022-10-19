package LeetCode.Medium.TopKFrequentWords;

import java.util.*;
import java.util.stream.Collectors;

public class Solution {

    public List<String> topKFrequent(String[] words, int k) {
        // The result list
        List<String> res = new ArrayList<>();

        // This map will compare the String lexigologically when they have the same repetitions
        TreeMap<String, Integer> tMapS = new TreeMap<>();
        // This map will have the order by count, reverse order to have from high to low
        TreeMap<Integer, String> tMapC = new TreeMap<>(Collections.reverseOrder());

        // Fill the Tree for the lexicological order
        for (String word: words){
            tMapS.put(word, tMapS.getOrDefault(word,0)+1);
        }

        // Fill the map of the counts, and concatenate those who are the same
        for (Map.Entry<String, Integer> entry: tMapS.entrySet()){
            tMapC.put(entry.getValue(),tMapC.getOrDefault(entry.getValue(),"")+entry.getKey()+" ");
        }

        for (Map.Entry<Integer,String> mRes : tMapC.entrySet()){
            if (k>0){
                String[] wors = mRes.getValue().split(" ");
                for (String i : wors){
                    if (k>0){
                        res.add(i);
                        k--;
                        System.out.println(res);
                    }
                }
            }
        }

        return res;
    }


    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String[] input = s.nextLine().split(" ");
        int input2 = s.nextInt();

        Solution solucion = new Solution();
        solucion.topKFrequent(input,input2);
    }
}
