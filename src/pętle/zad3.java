
import java.io.PrintWriter;
import java.io.IOException;
import java.util.Scanner;

public class zad3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Podaj prędkość pojazdu (w km/h):");
        int speed = scanner.nextInt();
        while (speed < 0) {
            System.out.println("Prędkość nie może być ujemna. Podaj prędkość pojazdu (w km/h):");
            speed = scanner.nextInt();
        }

        System.out.println("Podaj liczbę godzin podróży:");
        int hours = scanner.nextInt();
        while (hours < 1) {
            System.out.println("Czas podróży musi być większy niż 1. Podaj liczbę godzin podróży:");
            hours = scanner.nextInt();
        }

        try (PrintWriter writer = new PrintWriter("output.txt")) {
            writer.println("Godzina Przebyta odległość");
            writer.println("-----------------------------");
            for (int i = 1; i <= hours; i++) {
                writer.println(i + " " + (speed * i));
            }
        } catch (IOException e) {
            System.out.println("Wystąpił błąd podczas zapisywania do pliku: " + e.getMessage());
        }

        System.out.println("Dane zostały zapisane w pliku output.txt.");
    }
}
