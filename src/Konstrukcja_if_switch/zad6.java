
package Konstrukcja_if_switch;
import java.util.Scanner;

public class zad6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj liczbę sekund:");
        int seconds = scanner.nextInt();

        int days = seconds / (24 * 3600);
        seconds %= (24 * 3600);
        int hours = seconds / 3600;
        seconds %= 3600;
        int minutes = seconds / 60;
        seconds %= 60;


        System.out.println("Dni: " + days);
        System.out.println("Godziny: " + hours);
        System.out.println("Minuty: " + minutes);
        System.out.println("Sekundy: " + seconds);
    }
}
