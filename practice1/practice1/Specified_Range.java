package practice1;

import java.util.Scanner;

// 指定範囲だけ大文字に変換

public class Specified_Range {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    int n = sc.nextInt();
    int m = sc.nextInt();
    sc.nextLine();
    String s = sc.nextLine();

    System.out.println(s.substring(0, n - 1) + s.substring(n - 1, m).toUpperCase() + s.substring(m));
  }
}
