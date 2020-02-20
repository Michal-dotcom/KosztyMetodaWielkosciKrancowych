import java.util.Arrays;
import java.util.Scanner;

public class Obliczenia {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String[] miesiące = {"styczeń", "luty", "marzec", "kwiecień", "maj", "czerwiec", "lipiec", "sierpień", "wrzesień", "październik", "listopad", "grudzień"};

        int[] koszty = new int[12];
        int[] produkcja = new int[12];

        int maxKoszty;
        int minKoszty;
        int maxProdukcja;
        int minProdukcja;

        int odchylenieKrancoweKosztów;
        int odchylenieKrańcoweProdukcji;

        int kosztJednostkowyZmienny;

        int kosztyStałe;
        int kosztyCałkowite;
        int kosztyZmienne;

        for (int i = 0; i < miesiące.length; i++) {
            System.out.println("Podaj wielkość KOSZTÓW dla " + miesiące[i]);
            koszty[i] = sc.nextInt();
        }

        for (int i = 0; i < miesiące.length; i++) {
            System.out.println("Wprowadź wielkość PRODUKCJI dla " + miesiące[i]);
            produkcja[i] = sc.nextInt();
        }

        Arrays.sort(koszty);
        Arrays.sort(produkcja);

        maxKoszty = koszty[11];
        minKoszty = koszty[0];
        maxProdukcja = produkcja[11];
        minProdukcja = produkcja[0];

        odchylenieKrancoweKosztów = maxKoszty - minKoszty;
        odchylenieKrańcoweProdukcji = maxProdukcja - minProdukcja;

        kosztJednostkowyZmienny = odchylenieKrancoweKosztów / odchylenieKrańcoweProdukcji;

        kosztyZmienne = kosztJednostkowyZmienny * maxProdukcja;
        kosztyStałe = maxKoszty - kosztyZmienne;
        kosztyCałkowite = kosztyStałe + kosztyZmienne;
        System.out.println("Koszty stałe wyniosły: " + kosztyStałe + "\nKoszty zmiennie wyniosły " + kosztyZmienne + "\nKoszty całkowite wyniosły: " + kosztyCałkowite);
    }
}
