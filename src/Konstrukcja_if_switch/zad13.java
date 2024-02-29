package Konstrukcja_if_switch;

import java.util.Scanner;

public class zad13 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Wybierz pakiet (A, B, C): ");
        String pakiet= scanner.nextLine();


        System.out.println("Podaj minuty ");
        double minuty = Double.parseDouble(scanner.nextLine());
        double pakieta = 0;
        double min = 0;
        switch (pakiet){
            case "A":
                pakieta = 39.99;
                min = 0.45;
                if(minuty <450){
                    System.out.println("Łączene opłaty: "+ pakieta);
                }
                else {
                    double platne = minuty - 450;
                    double dod = min * platne;
                    double wynik = dod+pakieta;
                    System.out.println("Łączne opłaty: "+wynik);
                }
                break;

        case "B":
           pakieta = 59.99;
            min = 0.4;
            if(minuty <900){
                System.out.println("Łączene opłaty: "+ pakieta);
            }
            else {
                double platne = minuty - 900;
                double dod = min * platne;
                double wynik = dod+pakieta;
                System.out.println("Łączne opłaty: "+wynik);
            }
            break;
        case "C":
            pakieta = 69.99;

            System.out.println("Łączne opłaty: "+ pakieta);
            break;
        default:

            System.out.println("Zły wybór");
            break;

    }
}}
