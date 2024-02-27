import java.util.Scanner;
import java.lang.Math;
public class zad21 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj kwote poczatkowa na koncie: ");
        Double poczatek = Double.valueOf((scanner.nextLine()));

        System.out.println("Podaj roczna stope oprocentowania: ");
        Double oprocentowanie = Double.valueOf((scanner.nextLine()));
        double proc = oprocentowanie*0.01;
        System.out.println("Ile razy odsetki sa kapitalizowane");
        Double odsetki = Double.valueOf((scanner.nextLine()));

        System.out.println("Podaj liczbe lat: ");
        Double lata = Double.valueOf((scanner.nextLine()));
    double wynik = poczatek*Math.pow(1+(proc/odsetki),(odsetki*lata));
    int wynikd = (int)wynik;
        System.out.println("Kwota ktora znajdzie sie na koncie po "+lata+" latach to: "+ wynikd+"zł");
    }
}
