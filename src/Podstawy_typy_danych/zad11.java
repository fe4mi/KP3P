package Podstawy_typy_danych;

import java.util.Scanner;

public class zad11 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj wartosc produktu: ");
        double wartosc = Double.parseDouble(scanner.nextLine());

        double stanowy = wartosc * 0.04;
        double lokalny = wartosc * 0.02;

        double brutto = wartosc + stanowy + lokalny;
        System.out.println("Wartosc produktu: " + wartosc);
        System.out.println("Podatek stanowy: " + stanowy);
        System.out.println("Podatek lokalny: "+ lokalny);
        System.out.println("Łączna wartość: " + brutto);
    }
}
