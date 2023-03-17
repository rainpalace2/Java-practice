package practice1;

import java.util.Scanner;

// 足すか掛けるか
/* 2つの整数の組が与えられるので、各組の計算結果を足し合わせたものを出力する
   ただし、２つの整数が同じ値だった場合は、掛け合わせたもの */

public class Add_Or_Multiply {
  public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);

    int n = sc.nextInt();
    int[] a = new int[2];
    int sum = 0;

    for (int i = 0; i < n; i++) {
      // 二次元配列でいうところの列を取得
      a[0] = sc.nextInt();
      a[1] = sc.nextInt();

      if (a[0] != a[1]) {
        sum += a[0] + a[1];
      } else {
        sum += a[0] * a[1];
      }
    }
    System.out.println(sum);
  }
}
