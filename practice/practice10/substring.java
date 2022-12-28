package practice10;

import java.util.Scanner;

// 指定範囲の部分文字列の取得

public class substring {
  public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);

    String s = sc.next();
    int a = sc.nextInt();
    int b = sc.nextInt();

    /* substring(int, int)のメソッド定義
       String substring(int beginIndex, int endIndex)
       beginIndex：開始のインデックス（この値を含む）
       endIndex：終了のインデックス（この値を含まない） */

    // str.substring(0, 2) 
    // インデックス0（１文字目）から、インデックス2の前（２文字目）まで切り出す

    System.out.println(s.substring(a - 1, b));

    // 指定インデックスから後ろの部分文字列の取得
    String str = "あいうえお";

    // インデックス2（３文字目）から最後まで切り出す
    String str1 = str.substring(2);
    System.out.println(str1);
  }
}
