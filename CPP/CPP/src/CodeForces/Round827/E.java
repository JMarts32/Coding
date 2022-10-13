package CodeForces.Round827;

import java.util.Scanner;

/*
SCUZA
 */
public class E {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        try {
            Thread.sleep(50);
        }catch (InterruptedException e){}

        int testcases = Integer.parseInt(s.nextLine());

        for (int i = 0; i < testcases; i++){
            String[] nq = s.nextLine().split(" ");
            String[] n = s.nextLine().split(" ");
            String[] q = s.nextLine().split(" ");

            long[] sums = new long[q.length];

            int steps = 0;
            for (int j = 0; j < Integer.parseInt(nq[1]); j++){
                long h = 0;
                boolean conti = true;
                while (conti){
                    if (Integer.parseInt(q[j]) >= Integer.parseInt(n[steps])){
                        h += Integer.parseInt(n[steps]);
                        steps += 1;
                    }else {
                        conti = false;
                    }
                }
                if (j == 0){
                    sums[j] = h;
                    System.out.print(h + " ");
                }else {
                    System.out.print((sums[j-1] + h) + " ");
                    sums[j] = sums[j-1] + h;
                }

            }
            System.out.print("\n");
         }
    }
}
