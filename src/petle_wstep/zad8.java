package petle_wstep;

public class zad8 {
    public static void main(String[] args){
double liczba = 0;
        for(int i = 1; i<=30; i++) {

            for (int j = 30; j >= 1; j--)

            liczba += (i/j);
        }
        System.out.println("wynik: "+liczba);
    }

}
