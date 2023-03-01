package practice6;

import java.util.Scanner;

// 終了判定
// 最も左にある奇数の要素の手前までの和を求める

public class End_Judgment {
  public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);

    int n = sc.nextInt();
    int[] a = new int[n];

    for (int i = 0; i < n; i++) {
      a[i] = sc.nextInt();
    }

    int count = 0;
    for (int x : a) {
      // 奇数かどうか判定する
      // 奇数だった場合break文で終了
      if (x % 2 == 1) {
        break;
      }
      count += x;
    }
    System.out.println(count);
  }
}
