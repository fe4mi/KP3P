package pętle;

import java.util.Random;
import java.util.Scanner;

public class zad17 {
    public static void main(String[] args) {
        Random rand = new Random();
        int numberToGuess = rand.nextInt(100);
        int numberOfTries = 0;
        Scanner input = new Scanner(System.in);
        int guess;
        boolean win = false;

        while (win == false) {
            System.out.println("Zgadnij liczbę od 1 do 100:");
            guess = input.nextInt();
            numberOfTries++;

            if (guess == numberToGuess) {
                win = true;
            } else if (guess < numberToGuess) {
                System.out.println("Za mała liczba, spróbuj ponownie");
            } else if (guess > numberToGuess) {
                System.out.println("Za duża liczba, spróbuj ponownie");
            }
        }

        System.out.println("Gratulacje wygrałeś! Liczba to " + numberToGuess);

    }
}
