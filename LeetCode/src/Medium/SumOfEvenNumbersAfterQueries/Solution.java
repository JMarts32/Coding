package Medium.SumOfEvenNumbersAfterQueries;

/*
Lo primero que se hace para evitar la complejidad cuadraticas es:
Se hace la suma de todos los numeros pares y se tienen en una variable S,
Si se encuentra que el numero dentro de nums que se va a modificar con la query
ya era par, simplemente se le resta el valor a la suma S y se modifica el valor con
el numero del query. Despues, vuelve a preguntar si el que esta en la posicion es par
para modificar el valor S y agregarlo a la lista de numeros finales.
 */
public class Solution {
    public int[] sumEvenAfterQueries(int[] nums, int[][] queries) {

        int S = 0;
        for (int x: nums)
            if (x%2 == 0)
                S += x;

        int[] finalNums = new int[queries.length];

        for (int i = 0; i < queries.length ; i++){
            if (nums[queries[i][1]]%2 == 0) S -= nums[queries[i][1]];
            nums[queries[i][1]] += queries[i][0];
            if (nums[queries[i][0]]%2 == 0) S += nums[queries[i][0]];
            finalNums[i] = S;
        }
        return finalNums;
    }
}
