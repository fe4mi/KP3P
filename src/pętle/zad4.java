package pętle;


import java.util.Scanner;

public class zad4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int dni;
        do {
            System.out.println("Podaj liczbę przepracowanych dni (więcej niż 0): ");
            dni = scanner.nextInt();
        } while (dni < 1);

        long grosze = 1;
        long suma = 0;
        for (int i = 1; i <= dni; i++) {
            System.out.println("Dzień " + i + ": " + grosze / 100.0 + " zł");
            suma += grosze;
            grosze *= 2;
        }
        System.out.println("Sumaryczna zapłata za cały okres: " + suma / 100.0 + " zł");
    }
}
