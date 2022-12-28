package practice10;

import java.util.Scanner;

// 文字列の挿入

public class insert_string {
  public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);

    /* StringBuilderクラスのinsertメソッドで指定した位置に対して
    文字列や他のデータ型の値を挿入できる */

    StringBuilder sb = new StringBuilder();
    String s = sc.next();

    sb.append(s);

    String t = sc.next();
    int n = sc.nextInt();

    // １番目の引数に挿入する位置を指定する
    // ２番目の引数にStringBuilderオブジェクトに挿入する文字列を指定する
    sb.insert(n, t);

    System.out.println(sb.toString());
  }
}
