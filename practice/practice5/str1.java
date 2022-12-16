package practice5;

import java.util.Scanner;

// 半角スペース区切りの2つの入力

public class str1 {
  public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);
    String s = sc.next();
    String[] str = s.split(" ");

    for (int i = 0; i < str.length; i++) {
      System.out.println(str[i]);
    }

    // 半角スペース区切りの1000個の入力
    for (int i = 0; i < 1000; i++) {
      String st = sc.next();
      System.out.println(st);
    }
  }
}
