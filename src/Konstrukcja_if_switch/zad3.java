package Konstrukcja_if_switch;


import java.util.Scanner;

public class zad3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj wage w kg: ");
        double waga = Double.parseDouble((scanner.nextLine()));

        System.out.println("Podaj wzrost w metrach: ");
        double wzrost = Double.parseDouble((scanner.nextLine()));

        double BMI = waga / Math.pow(wzrost, 2);

        if(BMI<18.5){
            System.out.println("Niedowaga");
        }else if(BMI >=18.5 && BMI <=25){
            System.out.println("Optymalna");
        }else{
            System.out.println("Nadwaga");
        }
    }
}
