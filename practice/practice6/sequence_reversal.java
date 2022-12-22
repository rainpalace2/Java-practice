package practice6;

import java.util.Scanner;

// 数列の反転

public class sequence_reversal {
  public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);

    int n = sc.nextInt();
    int[] a = new int[n];

    for (int i = 0; i < n; i++) {
      a[i] = sc.nextInt();
    }

    // ループ変数雨の初期値と条件を、数列を後ろから見るように設定
    for (int i = n - 1; i >= 0; i--) {
      System.out.println(a[i]);
    }
  }
}
