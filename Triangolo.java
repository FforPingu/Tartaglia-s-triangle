/*Ottenendo il numero di righe dall'utente, stampare in console il triangolo di Tartaglia visualizzato in figura.
Utilizza la corretta struttura dati per memorizzare gli interi necessari.*/
import java.util.Scanner;

public class Triangolo {

  private static int size;

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    System.out.print("inserisci la dimensione del triangolo: ");
    size = scanner.nextInt();
    scanner.close();

    printTriangle();
  }

  public static void printTriangle() {
    
    int[][] Tartaglia = new int[size][];
    for (int i = 0; i < size; i++) {
      Tartaglia[i] = new int[i + 1];
    }

    for (int i = 0; i < size; i++) {
      Tartaglia[i][0] = 1;
      for (int j = 1; j < i; j++) {
        Tartaglia[i][j] = Tartaglia[i - 1][j - 1] + Tartaglia[i - 1][j];
      }
      Tartaglia[i][i] = 1;
    }

    for (int i = 0; i < size; i++) {
      for (int j = 0; j <= i; j++) {
        System.out.print(Tartaglia[i][j] + " ");
      }
      System.out.println();
    }
  }
}
