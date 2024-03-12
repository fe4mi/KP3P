package pętle;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class zad13 {
    public static void main(String[] args) {
        System.out.println("Podaj nazwę pliku:");
        Scanner scanner = new Scanner(System.in);
        String fileName = scanner.nextLine();

        try (BufferedReader reader = new BufferedReader(new FileReader(fileName))) {
            for (int i = 0; i < 5; i++) {
                String line = reader.readLine();
                if (line != null) {
                    System.out.println(line);
                } else {
                    break;
                }
            }
        } catch (IOException e) {
            System.out.println("Wystąpił błąd podczas czytania pliku: " + e.getMessage());
        }
    }
}
