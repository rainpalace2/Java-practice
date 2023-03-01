package practice7;

import java.util.Scanner;

// 数列の最小値

public class Min_Val {
  public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);

    int n = sc.nextInt();
    int[] a = new int[n];

    int min = 101;
    for (int i = 0; i < n; i++) {
      a[i] = sc.nextInt();
      if (a[i] < min) {
        min = a[i];
      }
    }
    System.out.println(min);
  }
}
