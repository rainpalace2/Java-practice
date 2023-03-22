package practice1;

import java.util.Scanner;

// じゃんけんで必ず勝つ

public class R_P_S {
  public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);

    // char型を標準入力から受け取る
    char c = sc.next().charAt(0);

    // char型はプリミティブ型なので == で比較できる
    // ダブルクォーテーションではなくシングルクォーテーションであることに注意
    if (c == 'R') {
      System.out.println('P');
    } else if (c == 'P') {
      System.out.println('S');
    } else {
      System.out.println('R');
    }
  }
}
