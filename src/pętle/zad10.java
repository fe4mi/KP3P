package pętle;

import java.util.Scanner;

public class zad10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int number;
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;

        do {
            System.out.println("Podaj liczbę całkowitą (wpisz -99, aby zakończyć):");
            number = scanner.nextInt();

            if (number != -99) {
                if (number < min) {
                    min = number;
                }
                if (number > max) {
                    max = number;
                }
            }
        } while (number != -99);

        System.out.println("Najmniejsza wprowadzona wartość: " + min);
        System.out.println("Największa wprowadzona wartość: " + max);
    }
}
