package petle_wstep;

import java.util.Scanner;

public class zad3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Tak lub nie");
        String litera = scanner.next();

        litera.toLowerCase();

        while (litera.equals("tak") || litera.equals("nie")) {
            System.out.println("Dobrze");
            litera = scanner.next();
        }
        System.out.println("Bład");
    }
}
