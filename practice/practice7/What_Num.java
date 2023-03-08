package practice7;

import java.util.Scanner;

// 数列の何番目にあるか

public class What_Num {
  public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);

    int n = sc.nextInt();
    int[] a = new int[n];

    for (int i = 0; i < n; i++) {
      a[i] = sc.nextInt();
      // 数列の要素が1のとき、そこが何番目かを出力する
      if (a[i] == 1) {
        System.out.println(i + 1);
      }
    }
  }
}
