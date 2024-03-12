package pętle;

import java.util.Scanner;

public class zad9 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Podaj początkową liczbę organizmów:");
        int startPopulation = scanner.nextInt();
        while (startPopulation < 2) {
            System.out.println("Początkowa liczba organizmów nie może być mniejsza niż 2. Podaj liczbę ponownie:");
            startPopulation = scanner.nextInt();
        }

        System.out.println("Podaj średni dzienny przyrost populacji (w procentach):");
        double dailyIncrease = scanner.nextDouble();
        while (dailyIncrease < 0) {
            System.out.println("Średni dzienny przyrost populacji nie może być ujemny. Podaj wartość ponownie:");
            dailyIncrease = scanner.nextDouble();
        }

        System.out.println("Podaj liczbę dni, przez jakie organizmy się rozmnażają:");
        int days = scanner.nextInt();
        while (days < 1) {
            System.out.println("Liczba dni rozmnażania nie może być mniejsza niż 1. Podaj liczbę dni ponownie:");
            days = scanner.nextInt();
        }

        double population = startPopulation;
        for (int i = 1; i <= days; i++) {
            population += population * (dailyIncrease / 100);
            System.out.println("Dzień " + i + ": populacja wynosi " + population);
        }
    }
}
