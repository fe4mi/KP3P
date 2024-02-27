public class zad18 {
    public static void main(String[] args) {
        double akcje = 600;
        double cena = 21.77;
        double caleakcje = akcje * cena;
        double prowizja = caleakcje * 0.02;
        System.out.println("Cena akcji: " +caleakcje);
        System.out.println("Prowizja: " + prowizja);
        System.out.println("Łącznie: "+ (prowizja+caleakcje));
    }
}
