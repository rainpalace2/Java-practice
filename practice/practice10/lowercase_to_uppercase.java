package practice10;

import java.util.Scanner;

// 大文字から小文字への変換
// 小文字から大文字への変換

public class lowercase_to_uppercase {
  public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);

    String s = sc.next();

    // 大文字から小文字
    System.out.println(s.toLowerCase());

    String t = sc.next();

    // 小文字から大文字
    System.out.println(s.toUpperCase());
  }
}
