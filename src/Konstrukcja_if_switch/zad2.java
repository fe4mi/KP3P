package Konstrukcja_if_switch;

import java.util.Scanner;

public class zad2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj dzień: ");
        int dzien = Integer.parseInt((scanner.nextLine()));


        System.out.println("Podaj miesiąc: ");
        int miesiac = Integer.parseInt((scanner.nextLine()));

        System.out.println("Podaj dwie ostatnie cyfry roku: ");
        int rok = Integer.parseInt((scanner.nextLine()));

        if(dzien * miesiac == rok){
            System.out.println("Data jest magiczna");
        }else{
            System.out.println("Data nie jest magiczna");
        }
    }
}
