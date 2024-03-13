// import static org.junit.jupiter.api.Assertions.assertEquals;

// import org.junit.jupiter.api.Test;
import java.util.Scanner;
import java.util.ArrayList;

public class Main {
  public static void main(String[] args) {
    Scanner myObj = new Scanner(System.in);
    int zmienna = 0;

    int[] liczby = new int[3];
    System.out.println("Podaj liczby");
    for (int i = 0; i < 3; i++) {
      liczby[i] = myObj.nextInt();
    }
    for (int j = 0; j < 3; j++) {
      for (int i = 0; i < 3; i++) {
        if (liczby[i] > zmienna) {
          zmienna = liczby[i];
        }
      }
    }
    System.out.println("Wartosc maksymalna to: ".concat(Integer.toString(zmienna, -1)));
  }

  // @Test
  // void addition() {
  // assertEquals(2, 1 + 1);
  // }
}