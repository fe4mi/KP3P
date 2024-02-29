package Podstawy_typy_danych;

public class zad5 {
    public static void main(String[] args) {
        double pom1szer = 3;
        double pom1dl =4;

        double pom2szer = 3;
        double pom2dl =4;

        double pom3szer = 2;
        double pom3dl =2;

        double pom4szer = 3;
        double pom4dl =2;

        double powierzchnia1 = pom1szer * pom1dl;
        double powierzchnia2 = pom2szer * pom2dl;
        double powierzchnia3= pom3szer * pom3dl;
        double powierzchnia4 = pom4szer * pom4dl;

        double powcalkowita = powierzchnia1 + powierzchnia2
 + powierzchnia3 + powierzchnia4;
        System.out.println("Pomieszenie 1 ma wymiar: " + powierzchnia1 +"m2");
        System.out.println("Pomieszenie 2 ma wymiar: " + powierzchnia2+"m2");
        System.out.println("Pomieszenie 3 ma wymiar: " + powierzchnia3+"m2");
        System.out.println("Pomieszenie 4 ma wymiar: " + powierzchnia4+"m2");

        System.out.println("Mieszkanie ma " + powcalkowita + "m2");


    }
}
