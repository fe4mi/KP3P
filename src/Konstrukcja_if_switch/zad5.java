package Konstrukcja_if_switch;

import java.util.Scanner;

public class zad5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj mase obiektu w kg: ");
        double masa = Double.parseDouble((scanner.nextLine()));


        double ciezar = masa *9.8;

        if(ciezar > 1000){
            System.out.println("Obiekt jest zbyt ciężki");
        } else if (ciezar<10) {
            System.out.println("Obiekt jest za lekki");
        }else {
            System.out.println("Ciężar podanego obiektu to: "+ciezar);
        }
    }
}
