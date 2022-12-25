package practice9;

import java.util.Scanner;

// 2点間の距離

public class two_points_distance {
  public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);

    int n = sc.nextInt();

    int[] x = new int[n];
    int[] y = new int[n];

    int x1 = 2;
    int y1 = 3;

    for (int i = 0; i < n; i++) {
      x[i] = sc.nextInt();
      y[i] = sc.nextInt();
    }

    for (int i = 0; i < n; i++) {
      // 絶対値を扱いたいとき、Math.abs()を使う
      System.out.println(Math.abs(x1 - x[i]) + Math.abs(y1 - y[i]));
    }
  }
}
