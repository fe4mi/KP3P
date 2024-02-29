package Podstawy_typy_danych;

public class zad22 {
    public static void main(String[] args) {
        double zakup = 1000*32.87;
        double prowizja = zakup * 0.02;
        double sprzedaz = 1000*33.92;
        double prowizjadwa = sprzedaz*0.02;
        if(sprzedaz>zakup){
            double zysk = sprzedaz-zakup;
            System.out.println("Zysk wynosi: "+zysk);
        }else{
            double strata = zakup-sprzedaz;
            System.out.println("Strata wynosi: " +strata);
        }

    }
}
