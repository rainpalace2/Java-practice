package practice4;

// (A, B)の形で出力

public class Pair_of_numbers {
  public static void main(String[] args) {

    int n = 5;
    int m = 7;
    int a = 3;
    int b = 9;

    for (int i = 0; i < n; i++) {
      for (int j = 0; j < m; j++) {
        System.out.printf("(%d, %d)", a, b);
        if (j < m - 1) {
          System.out.print(" | ");
        } else {
          System.out.println();
        }
      }

      if (i != n - 1) {
        for (int j = 0; j < 6 * m + 3 * (m - 1); j++) {
          System.out.print("=");
        }
        System.out.println();
      }
    }
  }
}
