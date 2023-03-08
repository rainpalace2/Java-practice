package practice8;

import java.util.Scanner;

// 配列に6が含まれているか

public class Include {
  public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);

    int[] a = { 10, 13, 21, 1, 6, 51, 10, 8, 15, 6 };

    for (int x : a) {
      // 6が見つかったらYesを出力してreturnでmainメソッドの処理を終了する
      if (x == 6) {
        System.out.println("Yes");
        return;
      }
    }
    /* 6が配列の要素に合ったときreturnでmainメソッドの処理が終了するので、
      Noの出力はfor文の処理の後ろに書く */
    System.out.println("No");
  }
}
