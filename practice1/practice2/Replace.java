package practice2;

import java.util.Scanner;

// 文字列から文字を削除する
// replaceメソッドを使う方法

public class Replace {
  public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);

    String s = sc.next();
    String[] a = { "a", "e", "i", "o", "u" };
    String[] b = { "A", "E", "I", "O", "U" };

    for (int i = 0; i < a.length; i++) {
      /*　replaceメソッドの第一引数に消したい文字列、第二引数に空文字を渡すことで実現できる */
      s = s.replace(a[i], "");
    }

    for (int i = 0; i < b.length; i++) {
      s = s.replace(b[i], "");
    }
    System.out.println(s);
  }
}
