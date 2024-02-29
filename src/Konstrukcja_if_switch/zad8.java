package Konstrukcja_if_switch;

import java.util.Scanner;

public class zad8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj liczbe kupionych pakietów: ");
        double pakiet = Double.parseDouble(scanner.nextLine());
        double cena = pakiet *99;
        if(pakiet >= 10 && pakiet <= 19){
            System.out.println("Przyznany rabat: 20%");
            double wynik = cena*0.8;
            System.out.println("Cena po rabacie: " + wynik + "zł");
        }
        else if(pakiet >= 20 && pakiet <= 49){
            System.out.println("Przyznany rabat: 30%");
            double wynik = cena*0.7;
            System.out.println("Cena po rabacie: " + wynik + "zł");
        }
        else if(pakiet >= 50 && pakiet <= 99){
            System.out.println("Przyznany rabat: 40%");
            double wynik = cena*0.6;
            System.out.println("Cena po rabacie: " + wynik + "zł");
        }
        else if(pakiet >= 100 ){
            System.out.println("Przyznany rabat: 50%");
            double wynik = cena*0.5;
            System.out.println("Cena po rabacie: " + wynik + "zł");
        }else{
            System.out.println("Brak rabatu");
        }

    }
}
