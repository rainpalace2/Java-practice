package practice10;

import java.util.Scanner;

// 文字列を数値に変換する
// ラッパークラスのparseIntメソッドを使う方法

public class String_To_Num {
  public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);

    String s = sc.next();

    /* int型のラッパークラスであるIntegerクラスでは文字列を数値に変換する
       メソッドとしてparseIntメソッドが用意されている */

    // 引数に指定した文字列をint型の値に変換し戻り値として返す
    int n = Integer.parseInt(s);

    System.out.println(n);
  }
}
