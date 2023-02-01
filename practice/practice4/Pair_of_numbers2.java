package practice4;

// (A, B)の出力

public class Pair_of_numbers2 {
  public static void main(String[] args) {

    int n = 2;
    int m = 3;
    int a = 7;
    int b = 8;

    for (int i = 0; i < n; i++) {
      for (int j = 0; j < m; j++) {
        // 出力する値の桁を9桁にする
        System.out.printf("(%9d, %9d)", a, b);
        if (j < m - 1) {
          System.out.print(" | ");
        } else {
          System.out.println();
        }
      }

      if (i != n - 1) {
        // 「＝」の数：(9 * m * 2) + (4 * m) + (3 * (m - 1))
        // 9文字を1行でm回、2種類出力する
        // (A, B)のAとBを除く(,)の4文字をm回出力
        // | 半角スペースを含む3文字を(m - 1)回出力
        for (int j = 0; j < 22 * m + 3 * (m - 1); j++) {
          System.out.print("=");
        }
        System.out.println();
      }
    }
  }
}
