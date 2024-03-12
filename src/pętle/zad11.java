package pętle;

public class zad11{
    public static void main(String[] args) {
        System.out.println("Celsius  |  Fahrenheit");
        for (int celsius = 0; celsius <= 20; celsius++) {
            double fahrenheit = 9.0 / 5.0 * celsius + 32;
            System.out.printf("%7d  |  %10.2f\n", celsius, fahrenheit);
        }
    }
}
