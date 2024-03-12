package petle_wstep;

import java.util.Scanner;

public class zad2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj litere T, t, N lub n: ");
        String litera = scanner.next();

        while (litera.equals("n") || litera.equals("N")|| litera.equals("t")||litera.equals("T")) {
            System.out.println("Dobra litera");
            litera = scanner.next();
        }
        System.out.println("Zła litera ");
    }
}
