package practice1;

import java.util.Scanner;

// nextLine()の動作

public class String_Output {
  public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);

    // sc.nextで一番最初のトークンが返される
    int n = sc.nextInt();
    // 行送り
    // sc.nextLineで改行コードが読み込まれる
    sc.nextLine();

    for (int i = 0; i < n; i++) {
      System.out.println(sc.nextLine());
    }
  }
}
