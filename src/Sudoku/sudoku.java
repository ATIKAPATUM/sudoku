package sudoku;

import java.util.Random;
import java.util.Scanner;

public class Sudoku {
    public static void main(String[] args) throws Exception {
        Scanner in = new Scanner(System.in);
        Random gen = new Random();

        int[] colonna0 = new int[9];
        int[] colonna1 = new int[9];
        int[] colonna2 = new int[9];
        int[] colonna3 = new int[9];
        int[] colonna4 = new int[9];
        int[] colonna5 = new int[9];
        int[] colonna6 = new int[9];
        int[] colonna7 = new int[9];
        int[] colonna8 = new int[9];

        // rimepi gli arrey con i numeri da 1 a 9
        for (int i = 0; i < 9; i++) {
            colonna0[i] = gen.nextInt(1, 10);
            colonna1[i] = gen.nextInt(1, 10);
            colonna2[i] = gen.nextInt(1, 10);
            colonna3[i] = gen.nextInt(1, 10);
            colonna4[i] = gen.nextInt(1, 10);
            colonna5[i] = gen.nextInt(1, 10);
            colonna6[i] = gen.nextInt(1, 10);
            colonna7[i] = gen.nextInt(1, 10);
            colonna8[i] = gen.nextInt(1, 10);
        }

        // stampa il puzzle
        for (int i = 0; i < 9; i++) {
            if (i % 3 == 0) {
                System.out.println("-------------------------");
            }
            System.out.print("| " + colonna0[i] + " " + colonna1[i] + " " + colonna2[i] + " | " + colonna3[i] + " "
                    + colonna4[i] + " "
                    + colonna5[i] + " | " + colonna6[i] + " " + colonna7[i] + " " + colonna8[i] + " |");
            System.out.println();
        }

    }
}