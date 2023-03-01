package practice7;

import java.util.Scanner;

// 数列の最大値

public class Max_Val {
  public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);

    int n = sc.nextInt();

    int[] a = new int[n];

    int max = 0;
    for (int i = 0; i < n; i++) {
      a[i] = sc.nextInt();
      // 数列の要素と現在の最大値を比較する
      if (a[i] > max) {
        max = a[i];
      }
    }
    System.out.println(max);
  }
}
