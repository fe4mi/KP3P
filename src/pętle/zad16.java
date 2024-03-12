package pętle;

import java.util.Scanner;

public class zad16 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Podaj miesięczny budżet:");
        double budget = scanner.nextDouble();

        double totalExpenses = 0;
        String continueInput;
        do {
            System.out.println("Podaj wydatek:");
            double expense = scanner.nextDouble();
            totalExpenses += expense;

            System.out.println("Czy chcesz dodać kolejny wydatek? (tak/nie)");
            continueInput = scanner.next();
        } while (continueInput.equalsIgnoreCase("tak"));

        double difference = budget - totalExpenses;

        if (difference < 0) {
            System.out.println("Przekroczyłeś budżet o " + Math.abs(difference) + " zł.");
        } else if (difference > 0) {
            System.out.println("Pozostało Ci " + difference + " zł z budżetu.");
        } else {
            System.out.println("Wykorzystałeś cały budżet.");
        }
    }
}
