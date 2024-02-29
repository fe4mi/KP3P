package Konstrukcja_if_switch;

import java.util.Scanner;

public class zad16 {
    public static void main(String[] args) {
        int punkty = 0;
        Scanner key = new Scanner(System.in);
        System.out.println("Podaj ilosc zakupionych ksiązek");
        int iloscKsiazek = key.nextInt();

        if (iloscKsiazek == 1){
            punkty = 5;
        } else if (iloscKsiazek==2) {
            punkty=15;

        } else if (iloscKsiazek==3) {
            punkty=30;

        } else if (iloscKsiazek==4) {
            punkty = 40;

        }
        System.out.println("Ilosc punktów " + punkty);
    }
}
