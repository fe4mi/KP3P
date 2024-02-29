package Konstrukcja_if_switch;

import java.util.Scanner;

public class zad4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj wynik 1 testu (%): ");
        double pierwsza = Double.parseDouble((scanner.nextLine()));
        System.out.println("Podaj wynik 2 testu (%): ");
        double druga = Double.parseDouble((scanner.nextLine()));
        System.out.println("Podaj wynik 3 testu (%): ");
        double trzecia = Double.parseDouble((scanner.nextLine()));

        double srednia = (pierwsza+druga+trzecia)/3;
        System.out.println("Twoja srednia: "+srednia);
        if(srednia <= 100 && srednia >=90){
            System.out.println("Twoja ocena to: 5");
        }
        else if(srednia <= 89 && srednia >80){
            System.out.println("Twoja ocena to: 4");
        }
        else if(srednia <= 79 && srednia >70){
            System.out.println("Twoja ocena to: 3");
        }
        else if(srednia <= 69 && srednia >=60){
            System.out.println("Twoja ocena to: 2");
        }
        else if(srednia < 60 ){
            System.out.println("Twoja ocena to: 1");
        }
        else {
            System.out.println("Podano zle wyniki");
        }
    }
}
