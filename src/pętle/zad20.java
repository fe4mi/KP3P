package pętle;

import java.util.Scanner;

public class zad20 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Podaj liczbe: ");
        Integer liczba = scanner.nextInt();

        for(int i = 0;i< liczba;i++){
            for(int j = 0; j<liczba; j++){
                System.out.print("X");

            }
            System.out.println();
        }
    }
}
