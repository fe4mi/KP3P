package Konstrukcja_if_switch;

import java.util.Scanner;

public class zad10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj liczbe kalorii: ");
        double kcal = Double.parseDouble(scanner.nextLine());
        System.out.println("Podaj liczbe gramów tłuszczu: ");
        double gramy = Double.parseDouble(scanner.nextLine());

        double kcalztl = gramy*9;
        double procent = kcalztl/kcal;
        if(kcalztl > kcal){
            System.out.println("dane wejsciowe nie prawidłowe");
        }
        else if(procent < 30){
            System.out.println("Produkt nisko tłuszczowy");
        }
        else{
            System.out.println("Produkt wysoko tłuszowy");
        }
    }
}
