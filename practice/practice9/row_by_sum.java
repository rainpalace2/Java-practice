package practice9;

import java.util.Scanner;

// 2次元配列の行ごとの和

public class row_by_sum {
  public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);

    int n = sc.nextInt();
    int k = sc.nextInt();
    int[][] a = new int[n][k];

    for (int i = 0; i < n; i++) {
      for (int j = 0; j < k; j++) {
        a[i][j] = sc.nextInt();
      }
    }

    // ある行のみについて値を用いる場合
    // 行についてのループ
    for (int i = 0; i < n; i++) {
      // 行ごとの和を保持する変数を宣言
      int sum = 0;
      // 列についてのループ
      for (int j = 0; j < k; j++) {
        // 行ごとの和に各要素を足す
        sum += a[i][j];
      }
      // 行ごとの和を出力
      System.out.println(sum);
    }
  }
}
