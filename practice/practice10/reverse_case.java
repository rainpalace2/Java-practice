package practice10;

import java.util.Scanner;

// 大文字小文字の反転

public class reverse_case {
  public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);

    String s = sc.next();
    // String型の文字列をcharの配列へ変換するtoCharArrayメソッド
    char[] c = s.toCharArray();

    for (int i = 0; i < c.length; i++) {
      // isUpperCaseメソッドは、指定されt文字が大文字であるかを判定する
      if (Character.isUpperCase(c[i])) {
        // toLowerCaseメソッドは文字列に含まれる大文字を小文字に変換する
        c[i] = Character.toLowerCase(c[i]);
      } else {
        // toUpperCaseメソッドは文字列に含まれる小文字を大文字に変換する
        c[i] = Character.toUpperCase(c[i]);
      }

      StringBuilder sb = new StringBuilder(new String(c));

      System.out.println(sb.toString());
    }
  }
}
