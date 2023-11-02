import java.util.Scanner;

public class Sternenausgabe {
    public static void main(String[] args) {
        Scanner eingabe = new Scanner(System.in);
        System.out.print("Anzahl der Zeilen: ");
        int anzahlDerZeilen = eingabe.nextInt();

        for (int zeile=1; zeile <= anzahlDerZeilen; zeile++) {
            for (int i=0; i < anzahlDerZeilen-zeile; i++)
                System.out.print(" ");
            for (int spalte=1; spalte <= zeile; spalte++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
