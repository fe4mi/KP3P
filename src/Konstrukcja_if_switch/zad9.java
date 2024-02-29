package Konstrukcja_if_switch;

import java.math.BigDecimal;
import java.util.Scanner;

public class zad9 {
    public static void main(String[] args) {


        double cenaZa500km = 1.1;
        double waga = 0.0;
        int odleglosc = 0;

        Scanner key = new Scanner(System.in);

        System.out.println("Podaj wage przesylki: ");
        waga = key.nextDouble();

        System.out.println("Podaj odleglosc: ");
        odleglosc = key.nextInt();

        if(waga > 1 && waga <=3){
            cenaZa500km = 2.2;
        }else if (waga>3 && waga <=5){
            cenaZa500km =3.7;
        }
        else if(waga>5){
            cenaZa500km = 3.8;
        }
        int jednaTrasa = 500;

        double cena = 0;

        if(odleglosc %jednaTrasa !=0){
            cena = (Math.ceil(odleglosc/jednaTrasa)+1)* cenaZa500km;
        }else {
            cena = (odleglosc/jednaTrasa) *cenaZa500km;
        }
        BigDecimal numberBigDecimal = new BigDecimal(cena);
        numberBigDecimal = numberBigDecimal.setScale(2, BigDecimal.ROUND_HALF_UP);
        cena = numberBigDecimal.doubleValue();
        System.out.println("Cena za przesyłkę: "+numberBigDecimal);

    }
}
