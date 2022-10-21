package LeetCode.Medium.IntegerToRoman;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Solution {
    public String intToRoman(int num) {

        // Here we copy the num of the input to compute it as a double
        double cont = num;

        // The String builder of the roman number
        StringBuilder sb = new StringBuilder();
        // Thousands
        if (cont/1000 >= 0.9){
            int tho = (int) Math.floor(cont/1000);
            cont -= 1000*tho;
            // Add to the Final string the times 1000 is repeated
            for (int i = 0; i < tho; i++) sb.append("M");
            // If the division is 0.9 means it is 900 so the String is CM
            if (0.9 <= cont/1000 && cont/1000 < 1){
                sb.append("CM");
                cont -= 900;
            }
        }

        // 500 hundreds
        if (cont/500 >= 0.8){
            int tho = (int) Math.floor(cont/500);
            cont -= 500*tho;
            // Add to the Final string the times 500 is repeated
            for (int i = 0; i < tho; i++) sb.append("D");
            // If the division is 0.8 means it is 400 so the String is CD
            if (0.8 <= cont/500 && cont/500 < 1){
                sb.append("CD");
                cont -= 400;
            }
        }

        // one hundreds
        if (cont/100 >= 0.9){
            int tho = (int) Math.floor(cont/100);
            cont -= 100*tho;
            // Add to the Final string the times 100 is repeated
            for (int i = 0; i < tho; i++) sb.append("C");
            // If the division is 0.9 means it is 90 so the String is XM
            if (0.9 <= cont/100 && cont/100 < 1){
                sb.append("XC");
                cont -= 90;
            }
        }

        // fifties
        if (cont/50 >= 0.8){
            int tho = (int) Math.floor(cont/50);
            cont -= 50*tho;
            // Add to the Final string the times 50 is repeated
            for (int i = 0; i < tho; i++) sb.append("L");
            // If the division is 0.8 means it is 40 so the String is XL
            if (0.8 <= cont/50 && cont/50 < 1){
                sb.append("XL");
                cont -= 40;
            }
        }

        // tens
        if (cont/10 >= 0.9){
            int tho = (int) Math.floor(cont/10);
            cont -= 10*tho;
            // Add to the Final string the times 10 is repeated
            for (int i = 0; i < tho; i++) sb.append("X");
            // If the division is 0.9 means it is 9 so the String is IX
            if (0.9 <= cont/10 && cont/10 < 1){
                sb.append("IX");
                cont -= 9;
            }
        }

        // Fives
        if (cont/5 >= 0.8){
            int tho = (int) Math.floor(cont/5);
            cont -= 5*tho;
            // Add to the Final string the times 5 is repeated
            for (int i = 0; i < tho; i++) sb.append("V");
            // If the division is 0.8 means it is 4 so the String is IV
            if (0.8 <= cont/5 && cont/5 < 1){
                sb.append("IV");
                cont -= 4;
            }
        }

        // Ones
        if (cont/1 >= 0.9){
            int tho = (int) Math.floor(cont/1);
            cont -= 1*tho;
            // Add to the Final string the times 1000 is repeated
            for (int i = 0; i < tho; i++) sb.append("I");
        }

        System.out.println(sb.toString());
        return sb.toString();
    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int input = s.nextInt();
        Solution solucion = new Solution();

        solucion.intToRoman(input);
    }

}
