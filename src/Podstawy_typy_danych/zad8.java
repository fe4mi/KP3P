package Podstawy_typy_danych;

import java.util.Scanner;
public class zad8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Podaj dlugosc pomieszenia 1");
        Double pom1dl = Double.valueOf(scanner.nextLine());
        System.out.println("Podaj szerokosc pomieszenia 1");
        Double pom1szer = Double.valueOf(scanner.nextLine());
        System.out.println("Podaj dlugosc pomieszenia 2");
        Double pom2dl = Double.valueOf(scanner.nextLine());
        System.out.println("Podaj szerokosc pomieszenia 2");
        Double pom2szer = Double.valueOf(scanner.nextLine());
        System.out.println("Podaj dlugosc pomieszenia 3");
        Double pom3dl = Double.valueOf(scanner.nextLine());
        System.out.println("Podaj szerokosc pomieszenia 3");
        Double pom3szer = Double.valueOf(scanner.nextLine());
        System.out.println("Podaj dlugosc pomieszenia 4");
        Double pom4dl = Double.valueOf(scanner.nextLine());
        System.out.println("Podaj szerokosc pomieszenia 4");
        Double pom4szer = Double.valueOf(scanner.nextLine());




        double powierzchnia1 = pom1szer * pom1dl;
        double powierzchnia2 = pom2szer * pom2dl;
        double powierzchnia3 = pom3szer * pom3dl;
        double powierzchnia4 = pom4szer * pom4dl;

        double powcalkowita = powierzchnia1 + powierzchnia2
                + powierzchnia3 + powierzchnia4;
        System.out.println("Pomieszenie 1 ma wymiar: " + powierzchnia1 +"m2");
        System.out.println("Pomieszenie 2 ma wymiar: " + powierzchnia2+"m2");
        System.out.println("Pomieszenie 3 ma wymiar: " + powierzchnia3+"m2");
        System.out.println("Pomieszenie 4 ma wymiar: " + powierzchnia4+"m2");

        System.out.println("Mieszkanie ma " + powcalkowita + "m2");

        double pownaosobe = powcalkowita/4;
        System.out.println("Powierzchnia przypadajaca na osobę to: " + pownaosobe + "m2");
    }
}




