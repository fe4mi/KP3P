package pętle;

import java.util.Scanner;

public class zad7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int liczbaPieter;
        do {
            System.out.println("Podaj liczbę pięter (więcej niż 0): ");
            liczbaPieter = scanner.nextInt();
        } while (liczbaPieter < 1);

        int lacznaLiczbaPokojow = 0;
        int lacznaLiczbaZajetychPokojow = 0;
        for (int i = 1; i <= liczbaPieter; i++) {
            int liczbaPokojow;
            do {
                System.out.println("Podaj liczbę pokojów na piętrze " + i + " (więcej niż 10): ");
                liczbaPokojow = scanner.nextInt();
            } while (liczbaPokojow < 10);

            System.out.println("Podaj liczbę zajętych pokojów na piętrze " + i + ": ");
            int liczbaZajetychPokojow = scanner.nextInt();

            lacznaLiczbaPokojow += liczbaPokojow;
            lacznaLiczbaZajetychPokojow += liczbaZajetychPokojow;

            double poziomOblozenia = (double) liczbaZajetychPokojow / liczbaPokojow;
            System.out.println("Poziom obłożenia na piętrze " + i + ": " + poziomOblozenia);
        }

        System.out.println("Łączna liczba pokojów w hotelu: " + lacznaLiczbaPokojow);
        System.out.println("Łączna liczba zajętych pokojów: " + lacznaLiczbaZajetychPokojow);
        System.out.println("Łączna liczba pustych pokojów: " + (lacznaLiczbaPokojow - lacznaLiczbaZajetychPokojow));
        System.out.println("Łączny poziom obłożenia: " + (double) lacznaLiczbaZajetychPokojow / lacznaLiczbaPokojow);
    }
}
