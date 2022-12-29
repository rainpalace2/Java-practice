package practice10;

import java.util.Scanner;

// 与えられた時刻の30分後を出力する

public class string_manipulation {
  public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);

    String s = sc.next();

    // substringで指定の範囲を抜き出し、 String型をint型に変換
    int h = Integer.parseInt(s.substring(0, 2));
    int m = Integer.parseInt(s.substring(3, 5));

    if (m + 30 >= 60) {
      h += 1;
      m = m + 30 - 60;
    } else {
      m = m + 30;
    }

    // int型をString型に変換
    String st = Integer.toString(h);
    String t = Integer.toString(m);

    // 文字列の長さを比較
    if (st.length() == 1) {
      st = "0" + st;
    }

    if (t.length() == 1) {
      t = "0" + t;
    }

    System.out.println(st + ":" + t);
  }
}
