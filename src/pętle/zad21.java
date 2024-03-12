package pętle;
import java.util.Random;
import java.util.Scanner;
public class zad21 {
    public static void main(String[] args) {
        System.out.println("GRA W RZUT KOSTKAMI");
        int rzutKomputera;
        int rzutGracza;
        int punktyKomp = 0;
        int punktyGracza=0;

        Random losowanie = new Random();
        for(int i = 0; i<10;i++){
            rzutKomputera = losowanie.nextInt(6)+1;

            System.out.println ("Rzut komputera: " + rzutKomputera );

            rzutGracza = losowanie.nextInt(6)+1;

            System.out.println ("Rzut gracza: " + rzutGracza );

            if(rzutKomputera > rzutGracza){
                System.out.println("Runde wygrał komputer");
                punktyKomp+=1;
            } else if (rzutKomputera==rzutGracza) {
                System.out.println("Runda remisowa");

            }else {
                System.out.println("Runde wygrał Gracz");
                punktyGracza+=1;
            }
            System.out.println("\n");

        if(punktyGracza>punktyKomp){
            System.out.println("Grę wygrał Gracz z ilością punktów: "+punktyGracza);
        } else if (punktyGracza<punktyKomp) {
            System.out.println("Grę wygrał Gracz z ilością punktów: "+punktyKomp);
        }else {
            System.out.println("Gra remiosowa z punktami: "+punktyGracza);
        }
        }


    }
}
