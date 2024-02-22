package sudoku;

import java.util.Random;
import java.util.Scanner;

public class Sudoku {
    public static void main(String[] args) throws Exception {
        Scanner in = new Scanner(System.in);
        System.out.println("Giochiamo a Sudoku!");
        System.out.println("Invierò una griglia con alcuni numeri già impostati");
        System.out.println(
                "Inserirai i numeri mancanti uno alla volta, un programma controllerà che questi siano corretti");
        System.out.println("Se viene rilevato un errore, il programma chiede di inserire un colonna0[i] diverso");

        // rimepi gli array con i numeri da 1 a 9

        int[] colonna0 = { 5, 6, 0, 8, 4, 7, 0, 0, 0 };
        int[] colonna1 = { 3, 0, 9, 0, 0, 0, 6, 0, 0 };
        int[] colonna2 = { 0, 0, 8, 0, 0, 0, 0, 0, 0 };
        int[] colonna3 = { 0, 1, 0, 0, 8, 0, 0, 4, 0 };
        int[] colonna4 = { 7, 9, 0, 6, 0, 2, 0, 1, 8 };
        int[] colonna5 = { 0, 5, 0, 0, 3, 0, 0, 9, 0 };
        int[] colonna6 = { 0, 0, 0, 0, 0, 0, 2, 0, 0 };
        int[] colonna7 = { 0, 0, 6, 0, 0, 0, 8, 0, 7 };
        int[] colonna8 = { 0, 0, 0, 3, 1, 6, 0, 5, 9 };

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

        for (int i = 0; i < colonna0.length; i++) {
            if (colonna0[i] == 0) {
                do {
                    System.out.print("Inserisci un colonna0[i] tra 1 e 9: ");
                    colonna0[i] = in.nextInt();

                    if (colonna0[i] < 1 || colonna0[i] > 9) {
                        System.out.println("colonna0[i] non valido. Deve essere tra 1 e 9.");
                    }
                } while (colonna0[i] < 1 || colonna0[i] > 9);

                System.out.println("Hai inserito: " + colonna0[i]);

            }
            if (colonna1[i] == 0) {
                do {
                    System.out.print("Inserisci un colonna1[i] tra 1 e 9: ");
                    colonna1[i] = in.nextInt();

                    if (colonna1[i] < 1 || colonna1[i] > 9) {
                        System.out.println("colonna1[i] non valido. Deve essere tra 1 e 9.");
                    }
                } while (colonna1[i] < 1 || colonna1[i] > 9);

                System.out.println("Hai inserito: " + colonna0[i]);
            }
            if (colonna2[i] == 0) {
                do {
                    System.out.print("Inserisci un colonna2[i] tra 1 e 9: ");
                    colonna2[i] = in.nextInt();

                    if (colonna2[i] < 1 || colonna2[i] > 9) {
                        System.out.println("colonna2[i] non valido. Deve essere tra 1 e 9.");
                    }
                } while (colonna2[i] < 1 || colonna2[i] > 9);

                System.out.println("Hai inserito: " + colonna2[i]);
            }

            if (colonna3[i] == 0) {
                do {
                    System.out.print("Inserisci un colonna3[i] tra 1 e 9: ");
                    colonna3[i] = in.nextInt();

                    if (colonna3[i] < 1 || colonna3[i] > 9) {
                        System.out.println("colonna3[i] non valido. Deve essere tra 1 e 9.");
                    }
                } while (colonna3[i] < 1 || colonna3[i] > 9);

                System.out.println("Hai inserito: " + colonna3[i]);
            }
            if (colonna4[i] == 0) {
                do {
                    System.out.print("Inserisci un colonna4[i] tra 1 e 9: ");
                    colonna4[i] = in.nextInt();

                    if (colonna4[i] < 1 || colonna4[i] > 9) {
                        System.out.println("colonna0[i] non valido. Deve essere tra 1 e 9.");
                    }
                } while (colonna4[i] < 1 || colonna4[i] > 9);

                System.out.println("Hai inserito: " + colonna0[i]);
            }
            if (colonna5[i] == 0) {
                do {
                    System.out.print("Inserisci un colonna0[i] tra 1 e 9: ");
                    colonna5[i] = in.nextInt();

                    if (colonna5[i] < 1 || colonna5[i] > 9) {
                        System.out.println("colonna0[i] non valido. Deve essere tra 1 e 9.");
                    }
                } while (colonna5[i] < 1 || colonna5[i] > 9);

                System.out.println("Hai inserito: " + colonna0[i]);
            }
            if (colonna6[i] == 0) {
                do {
                    System.out.print("Inserisci un colonna0[i] tra 1 e 9: ");
                    colonna6[i] = in.nextInt();

                    if (colonna6[i] < 1 || colonna6[i] > 9) {
                        System.out.println("colonna0[i] non valido. Deve essere tra 1 e 9.");
                    }
                } while (colonna6[i] < 1 || colonna6[i] > 9);

                System.out.println("Hai inserito: " + colonna0[i]);
            }
            if (colonna7[i] == 0) {
                do {
                    System.out.print("Inserisci un colonna0[i] tra 1 e 9: ");
                    colonna7[i] = in.nextInt();

                    if (colonna7[i] < 1 || colonna7[i] > 9) {
                        System.out.println("colonna0[i] non valido. Deve essere tra 1 e 9.");
                    }
                } while (colonna7[i] < 1 || colonna7[i] > 9);

                System.out.println("Hai inserito: " + colonna7[i]);
            }
            if (colonna8[i] == 0) {
                do {
                    System.out.print("Inserisci un colonna8[i] tra 1 e 9: ");
                    colonna8[i] = in.nextInt();

                    if (colonna8[i] < 1 || colonna8[i] > 9) {
                        System.out.println("colonna8[i] non valido. Deve essere tra 1 e 9.");
                    }
                } while (colonna8[i] < 1 || colonna8[i] > 9);

                System.out.println("Hai inserito: " + colonna8[i]);
            }

        }

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