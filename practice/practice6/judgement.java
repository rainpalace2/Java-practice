package practice6;

import java.util.Scanner;

// 大文字が小文字を判定

public class judgement {
  public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);

    String s = sc.next();

    // charAtメソッドで文字列からn番目の文字を抜き出す
    char c = s.charAt(0);

    // Characterクラスにchar型の値が大文字かどうかを判定するisUpperCase()メソッドがある
    // char型のc変数が大文字のCのとき、YESと出力する
    if (Character.isUpperCase(c)) {
      System.out.println("YES");
    } else {
      System.out.println("NO");
    }

    sc.close();
  }
}
