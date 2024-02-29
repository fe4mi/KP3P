package Konstrukcja_if_switch;

import java.util.Scanner;

public class zad15 {
    public static void main(String[] args) {
        int oplataPodstawowa = 10;
        Scanner key = new Scanner(System.in);
        System.out.println("Podaj ilosc czeków");
        int iloscCzekow = key.nextInt();

        if(iloscCzekow<20){
            System.out.println("Opłata za czeki: "+(oplataPodstawowa+(iloscCzekow*0.1)));
        } else if (iloscCzekow>=20&&iloscCzekow<30) {
            System.out.println("Opłata za czeki: " +(oplataPodstawowa+(iloscCzekow*0.08)));

        }
        else if (iloscCzekow>=40&&iloscCzekow<60) {
            System.out.println("Opłata za czeki: " +(oplataPodstawowa+(iloscCzekow*0.06)));

        }
        else if (iloscCzekow>=60) {
            System.out.println("Opłata za czeki: " +(oplataPodstawowa+(iloscCzekow*0.04)));

        }
    }
}
