package pętle;

import java.util.Scanner;

public class zad5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Podaj łańcuch znaków: ");
        String lancuch = scanner.nextLine();

        System.out.println("Podaj znak, który chcesz zliczyć: ");
        char znak = scanner.next().charAt(0);

        int licznik = 0;
        for (int i = 0; i < lancuch.length(); i++) {
            if (lancuch.charAt(i) == znak) {
                licznik++;
            }
        }

        System.out.println("Znak '" + znak + "' występuje " + licznik + " razy w łańcuchu.");
    }
}
