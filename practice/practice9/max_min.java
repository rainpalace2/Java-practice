package practice9;

import java.util.Arrays;
import java.util.Scanner;

// 2変数の最大最小

public class max_min {
  public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);

    int n = sc.nextInt();
    int m = sc.nextInt();

    // Mathクラスのmaxメソッドに2つの値を渡すと、そのうちの大きい方の値を得ることができる
    // Mathクラスのminメソッドに2つの値を渡すと、そのうちの小さい方の値を得ることができる
    System.out.println(Math.max(n, m) + " " + Math.min(n, m));

    // ソートを用いた解
    int a = 2;
    int[] array = new int[n];
    for (int i = 0; i < n; i++) {
      array[i] = sc.nextInt();
    }
    /* java.util.Arrays クラスの sort メソッドを使うことで、
    引数として渡した配列を昇順にソートすることができる */
    Arrays.sort(array);
    System.out.println(array[n - 1] + " " + array[0]);
  }
}
