package pętle;

import java.util.Scanner;

public class zad8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj liczbę lat:");
        int years = scanner.nextInt();
        while (years < 1) {
            System.out.println("Liczba lat nie może być mniejsza niż 1. Podaj liczbę lat ponownie:");
            years = scanner.nextInt();
        }

        double totalRainfall = 0;
        for (int i = 1; i <= years; i++) {
            for (int j = 1; j <= 12; j++) {
                System.out.println("Podaj liczbę centymetrów opadów w " + j + " miesiącu " + i + " roku:");
                double rainfall = scanner.nextDouble();
                while (rainfall < 0) {
                    System.out.println("Miesięczne opady nie mogą być ujemne. Podaj liczbę centymetrów opadów ponownie:");
                    rainfall = scanner.nextDouble();
                }
                totalRainfall += rainfall;
            }
        }

        double averageRainfall = totalRainfall / (years * 12);
        System.out.println("Liczba miesięcy: " + (years * 12));
        System.out.println("Łączna liczba centymetrów opadów: " + totalRainfall);
        System.out.println("Średni poziom opadów w danym miesiącu z całego okresu: " + averageRainfall);
    }
}
