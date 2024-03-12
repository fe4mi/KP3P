package pętle;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;
public class zad23 {
    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Podaj imie: ");
        String imie = scanner.nextLine();

        System.out.println("Opisz siebie: ");
        String opis = scanner.nextLine();

        System.out.println("Podaj nazwę pliku");

        String nazwaPliku = scanner.nextLine();


        FileWriter fw = new FileWriter(nazwaPliku,true);

        PrintWriter pw = new PrintWriter(fw);

        pw.println("<!DOCTYPE HTML>");
        pw.println("<head>");
        pw.println("<title>Strona</title>");
        pw.println("</head>");
        pw.println("<body>");
        pw.println("<center>");
        pw.println("<h1>"+imie+"</h1>");
        pw.println("</center>");
        pw.println("<hr>");
        pw.println(opis);
        pw.println("</hr>");
        pw.println("</body>");
        pw.println("</html>");

        pw.close();

    }
}
