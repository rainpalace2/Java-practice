package practice10;

import java.util.Scanner;

// 文字の書き換え
/* StringBuilderクラスのreplaceメソッドで指定した範囲にある部分文字列を
   別の文字列に置換できる */

public class char_rewriting {
  public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);

    String s = sc.next();
    StringBuilder sb = new StringBuilder(s);

    int n = sc.nextInt();
    String t = sc.next();

    /* １番目の引数で指定した位置にある文字から、２番目の引数で指定した位置の一つ前の
       文字までの部分文字列を、３番目の引数で指定した文字列で置換する */
    sb.replace(n - 1, n, t);

    System.out.println(sb.toString());

  }
}
