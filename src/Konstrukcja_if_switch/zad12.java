package Konstrukcja_if_switch;

import java.util.Scanner;

public class zad12 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Wybierz:\n powietrze \n woda \n stal: ");
        String slowo = scanner.nextLine();

        System.out.println("Podaj odległość: ");
        double odleglosc = Double.parseDouble(scanner.nextLine());
        double czas = 0;
        switch (slowo){
            case "powietrze":
                 czas = odleglosc/343;
                System.out.println(czas);
                break;
            case "woda":
                 czas = odleglosc/1490;
                System.out.println(czas);
                break;

            case "stal":
                 czas = odleglosc/5100;
                System.out.println(czas);
        }
    }
}
