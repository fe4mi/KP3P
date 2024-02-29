package Podstawy_typy_danych;

import java.util.Scanner;

public class zad12 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj liczbe kilometrów: ");
        Double km = Double.valueOf(scanner.nextLine());
        System.out.println("Podaj liczbe litrów: ");
        double litry = Double.parseDouble(scanner.nextLine());

        double kmnalitr = km / litry;
        System.out.println("Spalanie: " + kmnalitr + "km/l");

    }
}
