import java.util.Arrays;
import java.util.Scanner;

public class DaneObliczeniowe {

    public static void main(String[] args) {
        int [][] liczby = new int[12][12];
        Scanner sc = new Scanner(System.in);
        int licznikKosztów = 0;
        int licznikProdukcji = 1;


        int maxKoszty;
        int minKoszty;
        int maxProdukcja;
        int minProdukcja;

        String [] miesiące = {"styczeń", "luty", "marzec", "kwiecień", "maj", "czerwiec", "lipiec", "sierpień", "wrzesień", "październik", "listopad", "grudzień"};
        for (int i = 0; i < liczby.length; i++) {
            System.out.println("Podaj wielkość KOSZTÓW dla " + miesiące[i]);
            liczby [i][licznikKosztów] = sc.nextInt();
            licznikKosztów++;
        }
        for(int j = 0; j < liczby.length; j++) {
            System.out.println("Wprowadź wielkość PRODUKCJI dla " + miesiące[j]);
            liczby[licznikProdukcji][j] = sc.nextInt();
            licznikProdukcji++;
        }
        System.out.println(Arrays.deepToString(liczby));
    }

}
