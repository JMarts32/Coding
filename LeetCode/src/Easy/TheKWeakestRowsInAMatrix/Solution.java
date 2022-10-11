package Easy.TheKWeakestRowsInAMatrix;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class Solution {
    public int[] kWeakestRows(int[][] mat, int k) {
        Map<Integer,Integer> veerify = new HashMap<>();
        int[] result = new int[k];
        for (int i = 0; i < mat.length ; i ++){
            int soldierCount = 0;
            int soldierCount2 = 0;
            for (int j = 0; j < mat[i].length ; j ++){
                if (mat[i][j] == 1){
                    soldierCount ++;
                }
                if (mat[i+1][j] == 1){
                    soldierCount2 ++;
                }
            }
            if (soldierCount < soldierCount2){
                veerify.put(i,soldierCount);
            }
        }
        int menor = mat.length;
        for (int x: veerify.keySet()){
            if (veerify.get(x) < menor)
                menor = veerify.get(x);
        }
        return result;
    }
}
