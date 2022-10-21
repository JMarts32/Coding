package LeetCode.Easy.RomanToInteger;

import java.util.HashMap;
import java.util.Map;

public class AlternativeSolution {

    private static final int[] values = {1000,900,500,400,100,90,50,40,10,9,5,4,1};
    private static final String[] rom = {"M","CM","D","CD","C","XC","L","XL","X","IX","V","IV","I"};

    public String intToRoman(int num) {

        // The String is going to be built here
        StringBuilder sb = new StringBuilder();
        // foreach one of the values
        for (int i = 0; i < values.length ; i++){
            // if the num is greater it is substracted until we get 0 and the final string
            while (num >= values[i]){
                num -= values[i];
                sb.append(values[i]);
            }
        }
        return sb.toString();
    }

}
