package sudoku;

import java.util.Random;
import java.util.Scanner;

public class Sudoku {
    public static void main(String[] args) throws Exception {
        Scanner in = new Scanner(System.in);
        System.out.println("Giochiamo a Sudoku!");
        System.out.println("Invierò una griglia con alcuni numeri già impostati");
        System.out.println("Inserirai i numeri mancanti uno alla volta, un programma controllerà che questi siano corretti");
        System.out.println("Se viene rilevato un errore, il programma chiede di inserire un numero diverso");

        // rimepi gli array con i numeri da 1 a 9

        int[] colonna0 = {5, 6, 0, 8, 4, 7, 0, 0, 0};
        int[] colonna1 = {3, 0, 9, 0, 0, 0, 6, 0, 0};
        int[] colonna2 = {0, 0, 8, 0, 0, 0, 0, 0, 0};
        int[] colonna3 = {0, 1, 0, 0, 8, 0, 0, 4, 0};
        int[] colonna4 = {7, 9, 0, 6, 0, 2, 0, 1, 8};
        int[] colonna5 = {0, 5, 0, 0, 3, 0, 0, 9, 0};
        int[] colonna6 = {0, 0, 0, 0, 0, 0, 2, 0, 0};
        int[] colonna7 = {0, 0, 6, 0, 0, 0, 8, 0, 7};
        int[] colonna8 = {0, 0, 0, 3, 1, 6, 0, 5, 9};


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

        in.close();
    }
}