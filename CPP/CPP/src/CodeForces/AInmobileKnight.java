package CodeForces;

import java.util.Scanner;

public class AInmobileKnight {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        try{
            // It migth sleep to avoid the combining processes while reading
            Thread.sleep(50);
        }catch (InterruptedException e){}
        int testcase = Integer.parseInt(s.nextLine());
        // Review each one of the cases
        for (int i = 0; i < testcase; i ++){
            String[] numbers = s.nextLine().split(" ");
            int rows = Integer.parseInt(numbers[0]);
            int columns = Integer.parseInt(numbers[1]);

            // Cases when all the cells are isolated
            if (rows == 1 || columns == 1 || (rows == 2 && columns == 2)){
                System.out.println(rows + " " + columns);
            } else {
                // Conditions for the while's to still running
                boolean rown1 = true;
                boolean rown2 = true;
                // If the program hasn't print anything (Means that there are no isolated cells), it will print te position rows columns
                boolean complete = false;

                // To run throught the rows
                int j = 1;
                // It might go by every position on the board
                while (rown1 && j <= rows){
                    // To run throught the columns
                    int x = 1;
                    while (rown2 && x <= columns) {
                        // if can't go in any direction (based on the knight movement) it means is an isolated cell and is a correct answer
                        if (!(j + 1 <= rows && x + 2 <= columns) &&
                                !(j+1 <= rows && 1 <= x-2) &&
                                !(j + 2 <= rows && x + 1 <= columns) &&
                                !(j + 2 <= rows && 1 <= x - 1) &&
                                !(1 <= j - 1 && x + 2 <= columns) &&
                                !(1 <= j - 1 && 1 <= x - 2) &&
                                !(1 <= j - 2 && 1 <= x - 1) &&
                                !(1 <= j - 2 && x + 1 <= columns)) {
                            rown1 = false;
                            rown2 = false;
                            // It is true bacause it prints one isolated cell
                            complete = true;
                            System.out.println(j + " " + x);
                        }
                        x++;
                    }
                    j++;
                }

                if (!complete){
                    System.out.println(rows + " " + columns);
                }
            }
        }
    }
}
