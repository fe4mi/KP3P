package Podstawy_typy_danych;

import java.util.Scanner;

public class zad14 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj 1 ocene: ");
        Double jeden = Double.valueOf(scanner.nextLine());
        System.out.println("Podaj 2 ocene: ");
        Double dwa = Double.valueOf(scanner.nextLine());
        System.out.println("Podaj 3 ocene: ");
        Double trzy = Double.valueOf(scanner.nextLine());

        double srednia = (jeden + dwa + trzy)/2;
        System.out.println("Ocena pierwsza: "+jeden);
        System.out.println("Ocena druga: "+dwa);
        System.out.println("Ocena trzecia: "+trzy);
        System.out.println("Srednia: "+srednia);

    }
}
