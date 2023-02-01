package practice4;

import java.util.Scanner;

// 0が含まれているか判定
// 0が含まれている場合はNOと出力

public class Included {
  public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int[] a = new int[n];

    for (int i = 0; i < n; i++) {
      a[i] = sc.nextInt();
    }

    // Javaの関数の処理はreturnが実行された時点で終了する
    for (int x : a) {
      if (x == 0) {
        System.out.println("NO");
        sc.close();
        return;
      }
    }

    System.out.println("YES");
    sc.close();
  }
}
