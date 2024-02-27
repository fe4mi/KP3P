import java.util.Scanner;

public class zad17 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj wartosc rachunku: ");
        Double wartosc = Double.valueOf((scanner.nextLine()));

        double podatek = wartosc * 0.0675;
        double napiek = (wartosc + podatek) *0.2;
        double calosc = napiek + wartosc + podatek;

        System.out.println("Cena: " +wartosc);
        System.out.println("Podatek" +podatek);
        System.out.println("Napiwel" + napiek);
        System.out.println("Łącznie"+calosc);

    }
}
