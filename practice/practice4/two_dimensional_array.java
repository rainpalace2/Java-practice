package practice4;

import java.util.Scanner;

public class two_dimensional_array {
  public static void main(String[] args) {

    // 標準入力からデータを読み込み、2次元配列に格納する
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int m = sc.nextInt();
    System.out.println(n + " " + m);

    int[][] table = new int[n][m];
    for (int i = 0; i < n; i++) {
      for (int j = 0; j < m; j++) {
        table[i][j] = sc.nextInt();
        System.out.println(table[i][j]);
      }
    }
  }
}
