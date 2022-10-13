package CodeForces.Round827;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/*
INCREASING
 */
public class B {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        try {
            Thread.sleep(50);
        }catch (InterruptedException e){}

        int testcases = Integer.parseInt(s.nextLine());

        for (int i=0; i <testcases; i++){
            int nia = Integer.parseInt(s.nextLine());
            String[] nl = s.nextLine().split(" ");

            if (nia == 1){
                System.out.println("YES");
            }else {
                boolean equal = true;
                Map<Integer,Integer> hola = new HashMap<>();
                int j = 0;
                while (j< nl.length && equal) {
                    if (hola.containsKey(Integer.parseInt(nl[j])))
                    {
                        equal = false;
                    } else {
                        hola.put(Integer.parseInt(nl[j]),1);
                        j++;
                    }
                }
                if (!equal){
                    System.out.println("NO");
                } else {
                    System.out.println("YES");
                }
            }

        }
    }
}
