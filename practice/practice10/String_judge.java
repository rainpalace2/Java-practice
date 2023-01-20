package practice10;

import java.util.Scanner;

// 文字列が含まれているかの判定

public class String_judge {
  public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);

    String s = sc.next();
    String t = sc.next();

    // containsメソッドで、文字列の中に、引数として渡した文字列が含まれているかどうかを判定する
    // 引数にはString型を使用戻り値はboolean型
    if (s.contains(t)) {
      System.out.println("YES");
    } else {
      System.out.println("NO");
    }
  }
}
