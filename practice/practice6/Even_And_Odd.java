package practice6;

import java.util.Scanner;

// 偶数、奇数の個数判定

public class Even_And_Odd {
  public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);

    int n = sc.nextInt();
    int[] num = new int[n];

    for (int i = 0; i < n; i++) {
      num[i] = sc.nextInt();
    }

    // 偶数の個数を判定する変数を用意
    int even = 0;
    for (int x : num) {
      if (x % 2 == 0) {
        even++;
      }
    }
    System.out.println(even + " " + (n - even));
  }
}
