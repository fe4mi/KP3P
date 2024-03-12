package pętle;

import java.util.Scanner;

public class zad2 {
    public static void main(String[] args)  {
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

        System.out.println("Godzina Przebyta odległość");
        System.out.println("-----------------------------");
        for (int i = 1; i <= hours; i++) {
            System.out.println(i + " " + (speed * i));
        }


    }
}
