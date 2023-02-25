package practice5;

import java.util.Scanner;

// 文字列とN個の整数の出力

public class String_Num {
  public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);

    int n = sc.nextInt();
    int a = sc.nextInt();
    int b = sc.nextInt();

    for (int i = 0; i < n; i++) {
      // %のある箇所に値が置換される
      // 値の型は整数型で10真数なのでdを使う
      System.out.printf("(%d, %d)", a, b);
      if (i < n - 1) {
        System.out.print(" ");
      } else {
        System.out.println();
      }
    }
  }
}
