package Konstrukcja_if_switch;

import java.util.Arrays;
import java.util.Scanner;

public class zad11 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);



        System.out.println("Podaj 1 nazwisko: ");
        String nazwisko1 = scanner.nextLine();
        System.out.println("Podaj 2  nazwisko: ");
        String nazwisko2 = scanner.nextLine();
        System.out.println("Podaj 3 nazwisko: ");
        String nazwisko3 = scanner.nextLine();
        System.out.println("Podaj 1 czas : ");
        Double czas1 = Double.valueOf(scanner.nextLine());
        System.out.println("Podaj 2 czas: ");
        Double czas2 = Double.valueOf(scanner.nextLine());
        System.out.println("Podaj 3 czas: ");
        Double czas3 = Double.valueOf(scanner.nextLine());

        if(czas1 > czas2 &&czas1 > czas3 && czas2 > czas3) {
            System.out.println(nazwisko1 + czas1);
            System.out.println(nazwisko2 + czas2);
            System.out.println(nazwisko3 + czas3);
        }
        else if(czas1 > czas2 &&czas1 > czas3 && czas3 > czas2) {
            System.out.println(nazwisko1 + czas1);
            System.out.println(nazwisko2 + czas2);
            System.out.println(nazwisko3 + czas3);
        }
        else if( czas2 > czas1 && czas2 > czas3 && czas1 > czas3){
            System.out.println(nazwisko2 + czas2);
            System.out.println(nazwisko1 + czas1);
            System.out.println(nazwisko3 + czas3);

        }
        else if( czas2 > czas1 && czas2 > czas3 && czas3 > czas1){
            System.out.println(nazwisko2 + czas2);

            System.out.println(nazwisko3 + czas3);
            System.out.println(nazwisko1 + czas1);

        }else if (czas3 > czas2 && czas3 > czas1 && czas2 >czas1){
            System.out.println(nazwisko3 + czas3);
            System.out.println(nazwisko2 + czas2);
            System.out.println(nazwisko1 + czas1);


        }
        else if (czas3 > czas2 && czas3 > czas1 && czas1 >czas2){
            System.out.println(nazwisko3 + czas3);

            System.out.println(nazwisko1 + czas1);

            System.out.println(nazwisko2 + czas2);
        }
    }
}