package Podstawy_typy_danych;

import java.util.Scanner;

public class zad10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj imie: ");
        String firstName = scanner.nextLine();
        System.out.println("Podaj drugie imie: ");
        String middleName = scanner.nextLine();
        System.out.println("Podaj nazwisko: ");
        String lastName = scanner.nextLine();

        char firstInitial = firstName.charAt(0);
        char middleInitial = middleName.charAt(0);
        char lastInitial = lastName.charAt(0);

        System.out.println("Imie: " + firstName);
        System.out.println("Drugie imie: " + firstName);
        System.out.println("Nazwisko: " + middleName);

        System.out.println("Inicjały: "+"\n" + firstInitial +"\n"+middleInitial+"\n"+lastInitial);

    }
}
