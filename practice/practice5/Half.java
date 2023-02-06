package practice5;

import java.util.Scanner;

// n個の文字を半分ずつ出力

public class Half {
  public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);
    int s = sc.nextInt();

    for (int i = 1; i <= s; i++) {
      System.out.println(i);
      // 1行目には1以上n/2以下の数を、2行目にはn/2+1以上n以下の数を出力する
      if (i == s / 2 || i == s) {
        System.out.println();
      } else {
        System.out.println(" ");
      }
    }
  }
}
