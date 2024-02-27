import java.util.Scanner;

public class zad23 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Dlugosc rzedu w metrach: ");
        Double dlugosc = Double.valueOf((scanner.nextLine()));

        System.out.println("Ilosc metrow w metrach: ");
        Double ilosc = Double.valueOf((scanner.nextLine()));

        System.out.println("Odleglosc miedzy sadzonkami w metrach: ");
        Double odleglosc = Double.valueOf((scanner.nextLine()));

       double wynik = (dlugosc-2*ilosc)/odleglosc;
        System.out.println("Zmiesci sie: "+wynik +"sadzonek");

    }
}
