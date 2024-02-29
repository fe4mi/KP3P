package Podstawy_typy_danych;

import java.util.Scanner;

public class zad13 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double ciastka = 40.0;
        double porcja = 10.0;

        double kalorie = 300.0;
        double kcalnaporcje = kalorie / porcja;

        System.out.println("Podaj liczbe ciasteczek: ");
        Double liczba = Double.valueOf(scanner.nextLine());

        double kcal = kcalnaporcje * liczba;
        System.out.println("Skonsumowanych: "+ kcal+" kcal");
    }
}
