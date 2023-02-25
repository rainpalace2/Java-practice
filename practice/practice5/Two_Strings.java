package practice5;

import java.util.Scanner;

// 2つの文字列を出力

public class Two_Strings {
  public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);

    String s = sc.next();
    String t = sc.next();

    // 文字列を置換したい箇所に％sを置く（文字列に対してはsという記号を使う）
    // 引数の値が置換される
    System.out.printf("%s + %s = %s\n", s, t, s + t);
  }
}
