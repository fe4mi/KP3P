package pętle;
import java.util.Scanner;
import java.util.Random;

public class zad19 {
    public static void main(String[] args) {
        String[] kolory = {"Czerwony", "Zielony", "Niebieski", "Pomarańczowy", "Żółty"};
        Random random = new Random();
        Scanner scanner = new Scanner(System.in);
        int poprawneWskazania = 0;

        for (int i = 0; i < 10; i++) {
            int wybranyKolor = random.nextInt(kolory.length);
            System.out.println("Podaj kolor wybrany przez komputer:");
            String odpowiedzUzytkownika = scanner.nextLine();

            if (odpowiedzUzytkownika.equalsIgnoreCase(kolory[wybranyKolor])) {
                poprawneWskazania++;
            }

            System.out.println("Komputer wybrał: " + kolory[wybranyKolor]);
        }

        System.out.println("Liczba poprawnych wskazań użytkownika: " + poprawneWskazania);
    }
}
