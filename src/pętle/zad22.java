package pętle;

import java.util.Random;
import java.util.Scanner;
import java.util.ArrayList;
public class zad22 {
    public static void main(String[] args) {


        Scanner scanner = new Scanner(System.in);
        String continueInput="";
        do {
        System.out.println("Podaj kwote: ");
        Integer liczba = scanner.nextInt();


        Random losowanie = new Random();
        int wylosowanaLiczba = losowanie.nextInt(6);
        int wylosowanaLiczbad = losowanie.nextInt(6);
        int wylosowanaLiczbat = losowanie.nextInt(6);

        ArrayList<String> cars = new ArrayList<String>();
        cars.add("Wiśnie");
        cars.add("Pomarańcze");
        cars.add("Śliwki");
        cars.add("Dzwonki");
        cars.add("Melony");
        cars.add("Bary");

        System.out.println(cars.get(wylosowanaLiczba));
        System.out.println(cars.get(wylosowanaLiczbad));
        System.out.println(cars.get(wylosowanaLiczbat));

        if(wylosowanaLiczba==wylosowanaLiczbat&& wylosowanaLiczba==wylosowanaLiczbad){
            System.out.println("Wygrano trzykrotność wpłaconej kwoty: " + (liczba*3));
        } else if (wylosowanaLiczba==wylosowanaLiczbat|| wylosowanaLiczba==wylosowanaLiczbad) {
            System.out.println("Wygrano dwukrotność wpłaconej kwoty: " + (liczba*2));
        }
        else {
            System.out.println("Straciłes pieniadze");
        }

        System.out.println("Czy chcesz zagrać ponownie? (tak/nie)");
            continueInput = scanner.next();
        } while (continueInput.equalsIgnoreCase("tak"));

    }

}

