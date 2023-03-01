package practice7;

import java.util.Scanner;

// 未知数個の文字列の受け取り

public class Nuknown_Str {
  public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);
    String s = sc.next();
    System.out.println(s);

    // while文はその条件が真になるまでループする
    // 変数sが文字列 ”EOF" と等しくないときにループする
    while (!(s.equals("EOF"))) {
      s = sc.next();
      System.out.println(s);
    }
  }
}
