import java.util.Scanner;

public class zad16 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj ulubione miasto: ");
        String miasto = (scanner.nextLine());


         int dlugosc;
        dlugosc = miasto.length();
        System.out.println("Dlugosc: " +dlugosc);

        char inicjal = miasto.charAt(0);
        System.out.println("Pierwsza litera: " + inicjal);
        String duze, male;

        duze = miasto.toUpperCase();
        System.out.println("Duże: " +duze);
        male = miasto.toLowerCase();
        System.out.println("Małe: "+male);


    }
}
