package Konstrukcja_if_switch;import java.util.Scanner;
import java.util.Arrays;

public class zad7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] names = new String[3];

        System.out.println("Wprowadź trzy imiona:");
        for (int i = 0; i < 3; i++) {
            names[i] = scanner.nextLine();
        }

        Arrays.sort(names);
        System.out.println("Imiona w porządku rosnącym to:");
        for (String name : names) {
            System.out.println(name);
        }
    }
}
