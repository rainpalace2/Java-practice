package practice9;

import java.util.Scanner;

// 文字の検索

public class Search_For_Char {
  public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);

    String s = sc.next();
    String c = sc.next();

    // indexOf()は対象の文字列から、引数で指定した文字列を検索する
    // 位置は0から開始され、もし見つからなかった場合は-1を返す
    System.out.println(s.indexOf(c) + 1);
  }
}
