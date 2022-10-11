package LeetCode.Easy.FizzBuzz;

import java.util.ArrayList;
import java.util.List;

public class Solution {
    private List<String> solution = new ArrayList<>();
    public List<String> fizzBuzz(int n) {
        for (int i = 1; i <= n; i ++){
            if (i%3 == 0){
                if (i%5 == 0){
                    solution.add("FizzBuzz");
                }else{
                    solution.add("Fizz");
                }
            }
            else if (i%5 == 0){
                solution.add("Buzz");
            }else {
                solution.add(Integer.toString(i));
            }
        }
        System.out.println(solution);
        return solution;
    }

    public static void main(String[] args) {
        Solution solucion = new Solution();
        solucion.fizzBuzz(15);
    }
}
