package practice5;

import java.util.Scanner;

// 10行の入力

public class ten_lines {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    for (int i = 0; i < 10; i++) {
      String s = sc.next();

      System.out.println(s);
    }

    // 1000行の入力

    for (int i = 0; i < 1000; i++) {
      String s = sc.next();

      System.out.println(s);
    }
  }
}
