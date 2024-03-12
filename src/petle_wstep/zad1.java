package petle_wstep;

import java.util.Scanner;

public class zad1 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj liczbe z przedzialu od 10 do 24: ");
        int num = scanner.nextInt();

        while(num >= 10 && num <= 24){
            System.out.println("Dobra liczba");
            num = scanner.nextInt();
        }
        System.out.println("Zła liczba ");

    }
}
