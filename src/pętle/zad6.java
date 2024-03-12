package pętle;

import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;

public class zad6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Podaj nazwę pliku: ");
        String nazwaPliku = scanner.nextLine();

        System.out.println("Podaj znak, który chcesz zliczyć: ");
        char znak = scanner.next().charAt(0);

        try {
            File plik = new File(nazwaPliku);
            Scanner czytacz = new Scanner(plik);

            int licznik = 0;
            while (czytacz.hasNextLine()) {
                String linia = czytacz.nextLine();
                for (int i = 0; i < linia.length(); i++) {
                    if (linia.charAt(i) == znak) {
                        licznik++;
                    }
                }
            }

            System.out.println("Znak '" + znak + "' występuje " + licznik + " razy w pliku.");
            czytacz.close();
        } catch (FileNotFoundException e) {
            System.out.println("Nie można znaleźć pliku " + nazwaPliku);
        }
    }
}
