package Podstawy_typy_danych;

import java.util.Scanner;

public class zad15 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj cene detaliczną: ");
        Double detal = Double.valueOf(scanner.nextLine());
        double marza = 0.4 * detal;
        double koncowa = detal + marza;
        System.out.println("Cena detaliczna: " + detal);
        System.out.println("Marza: " + marza);
        System.out.println("Cena koncowa: " + koncowa);

    }
}
