package CodeForces.Round827;

import java.util.Scanner;

/*
SUM
 */
public class A {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        try {
            Thread.sleep(50);
        }catch (InterruptedException e){}

        int testcases = Integer.parseInt(s.nextLine());

        for (int i = 0; i < testcases; i++){

            String n = s.nextLine();
            String[] nl = n.split(" ");

            if (Integer.parseInt(nl[0]) + Integer.parseInt(nl[1]) == Integer.parseInt(nl[2])){
                System.out.println("YES");
            } else if (Integer.parseInt(nl[0]) + Integer.parseInt(nl[2]) == Integer.parseInt(nl[1])) {
                System.out.println("YES");
            } else if (Integer.parseInt(nl[1])+ Integer.parseInt(nl[2]) == Integer.parseInt(nl[0])) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
        }
    }
}
