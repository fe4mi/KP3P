package pętle;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class zad15 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Podaj nazwę pliku do odczytu:");
        String inputFile = scanner.nextLine();

        System.out.println("Podaj nazwę pliku do zapisu:");
        String outputFile = scanner.nextLine();

        try (BufferedReader reader = new BufferedReader(new FileReader(inputFile));
             FileWriter writer = new FileWriter(outputFile)) {

            String line;
            while ((line = reader.readLine()) != null) {
                writer.write(line.toUpperCase() + "\n");
            }
        } catch (IOException e) {
            System.out.println("Wystąpił błąd podczas przetwarzania plików: " + e.getMessage());
        }

        System.out.println("Zawartość pliku " + inputFile + " została przekształcona na wielkie litery i zapisana w pliku " + outputFile + ".");
    }
}
