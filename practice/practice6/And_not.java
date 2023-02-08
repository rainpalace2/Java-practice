package practice6;

import java.util.Scanner;

// Aが10以上、かつ、Bが10以上でない

public class And_not {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    int a = sc.nextInt();
    int b = sc.nextInt();

    // 「Bが10以上でない」というのは「Bが10以上」と「〜ではない』に分解できる
    // Bが10以上は「b >= 10」,xではないというのは「!x」で表す
    if (a >= 10 && !(b >= 10)) {
      System.out.println("YES");
    } else {
      System.out.println("NO");
    }
    sc.close();

  }
}
