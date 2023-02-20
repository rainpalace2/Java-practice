package practice10;

import java.util.Scanner;

// ゼロで埋める
/* nが３桁の場合、nをそのまま出力
   nが２桁の場合、先頭に０を一つ加える
   nが１桁の場合、先頭に０を二つ加える */

public class Zero_Padding {
  public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);

    int n = sc.nextInt();

    if (n > 10) {
      // Stringクラスのformatメソッド
      // 数値のnを３桁になるまで左側にゼロで埋める
      System.out.println(String.format("%03d", n));
    } else if (n >= 10 && n < 100) {
      System.out.println(String.format("%03d", n));
    } else {
      System.out.println(n);
    }

    // sの文字列としての長さに応じて、必要なだけ０をsの先頭に加える
    String s = sc.next();

    while (s.length() < 3) {
      s = "0" + s;
    }
    System.out.println(s);
  }
}
