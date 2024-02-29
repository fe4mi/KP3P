package Konstrukcja_if_switch;
import java.util.Objects;
import java.util.Scanner;
public class zad18 {
    public static void main(String[] args) {
        Scanner klawisz = new Scanner(System.in);

        boolean vegetarian = false;
        boolean vegan = false;
        boolean gluten = false;

        System.out.println("Czy któraś z tych osob jest na dziecie wegetariańskeij? ");
        if(Objects.equals(klawisz.nextLine(),"tak")){
        vegetarian = true;

        }
        System.out.println("Czy któraś z osóbn jest na diecei wegańskiej?");
        if(Objects.equals(klawisz.nextLine(),"tak")){

        vegan = true;
        }
        System.out.println("Czy któraś z osóbn jest na diecei bezglutenowej?");
        if(Objects.equals(klawisz.nextLine(),"tak")){

            gluten = true;
        }
        System.out.println("Możecie się wybrac do nastepujących resturacji");

if(!vegetarian){
    if(!vegan){
        if(!gluten){
            System.out.println("Luksusowe Burgery U Jarka");
            System.out.println("Pizzeria przy dworcowej");
            System.out.println("Kawiarnia na rogu");
            System.out.println("Włoskie specjały");
            System.out.println("Kuchnia szefa");
        }
    }
    else{
        if(!vegan){
            if(!gluten){
                System.out.println("Pizzeria przy dworcowej");
                System.out.println("Kawiarnia na rogu");
                System.out.println("Włoskie specjały");
                System.out.println("Kuchnia szefa");
            }else{
                System.out.println("Pizzeria przy dworcowej");
                System.out.println("Kawiarnia na rogu");
                System.out.println("Kuchnia szefa");
            }
        }else {
            if(gluten){
                System.out.println("Kawiarnia na rogu");
                System.out.println("Kuchnia szefa");
            }
        }
    }
}



}}
