package practice10;

import java.util.Scanner;

// 数値から文字列への変換
/* 基本データ型をラッパークラスのオブジェクトに変換した後で各ラッパークラスで用意されている
   toStringメソッドを使って文字列に変換する */

public class Num_to_string {
  public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);

    int x = sc.nextInt();
    int y = sc.nextInt();
    int n = sc.nextInt();

    // int型の値からIntegerクラスのインスタンスを作成
    Integer i = Integer.valueOf(x + y);

    // toStringメソッドで文字列に変換
    String s = i.toString();

    System.out.println(s.charAt(n - 1));
  }
}
