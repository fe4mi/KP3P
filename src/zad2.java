import java.util.Scanner;
public class zad2 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj imie i nazwisko");
        String imie = scanner.nextLine();

        System.out.println("Podaj ulice, nr domu, miasto, kod pocztowy: ");
        String adres = scanner.nextLine();

        System.out.println("Podaj telefon: ");
        String telefon = scanner.nextLine();

        System.out.println(imie + "\n"+ adres +"\n" +telefon );

    }
}
