package Konstrukcja_if_switch;

import java.sql.SQLOutput;
import java.util.Scanner;

public class zad14 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);



        System.out.println("Wybierz pakiet (A, B, C): ");
        String pakiet= scanner.nextLine();

        System.out.println("Podaj minuty: ");
        int czas = scanner.nextInt();

        final double pakietACena, pakietBCena, pakietCCena;
        pakietACena=39.99;
        pakietBCena=59.99;
        pakietCCena=69.99;

        final double doplataA, doplataB;
        doplataA = 0.45;
        doplataB = 0.4;

        final double iloscMinutA, iloscMinutB;
        iloscMinutA = 450;
        iloscMinutB = 900;

        double zaoczedziniB = 0;
        double zaoszczedzonoC=0;

        double cena = 0;
        switch (pakiet){
            case "A":
                double nadwyzkaA = (czas > iloscMinutA ? (czas - iloscMinutA) * doplataA : 0);
                double nadwyzkaB = (czas > iloscMinutB ? (czas - iloscMinutB) * doplataB : 0);

                cena = pakietACena + nadwyzkaA;
                zaoczedziniB = cena - (pakietBCena+nadwyzkaB);
                zaoszczedzonoC = cena - pakietCCena;
                break;

            case "B":
                cena = pakietBCena + (czas > iloscMinutB ? (czas - iloscMinutB)*doplataB : 0);
                zaoszczedzonoC = cena - pakietCCena;
                break;
            case "C":
                cena = pakietCCena;
                break;
            default:
                System.out.println("Niezanay pakiet");


        }
        System.out.println("Łączna cena: " +cena);
        if(pakiet.equals("A")){
            System.out.println("Zaoszczedzilbys: " + (int)zaoczedziniB+" wybieraja pakiet B");
            System.out.println("Zaoszczedzilbys: " + (int)zaoszczedzonoC+" wybieraja pakiet C");
        }else if(pakiet.equals("B")){
            System.out.println("Zaoszczedzilbys: " + (int)zaoszczedzonoC+" wybieraja pakiet C");

        }
    }








}
