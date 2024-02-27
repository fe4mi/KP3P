import java.util.Scanner;

public class zad20 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ile ciasteczek: ");
        Double ciastka = Double.valueOf((scanner.nextLine()));

        double cukier = 1.5/48;
        double maslo = 1/48;
        double maka = 2.75/48;

        double pcukier = ciastka * cukier;
        double pmaslo = ciastka * maslo;
        double pmaka = ciastka * maka;

        System.out.println(" By upiec "+ciastka+" ciastek potrzeba:");
        System.out.println(pcukier + " szklanki cukru");
        System.out.println(pmaslo + " szklanki masla");
        System.out.println(pmaka + " szklanki mąki");
    }
}
