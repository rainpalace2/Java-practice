package practice9;

import java.util.Scanner;

// 指定された行数の数字の出力 
// 整数 N が与えられるので,"1 2 3 4 5" を N 行出力
// 二重ループでは、内側のループ内の処理ほど繰り返し実行される

public class double_loop {
  public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);

    int n = sc.nextInt();

    // 外側のループで内側のループを繰り返す回数分ループさせる
    //「内側のループの処理を N 回繰り返す」
    for (int i = 0; i < n; i++) {
      // 内側のループで繰り返す処理を記述する
      // 「数を 1 から 1 ずつ増やしながら 5 回出力する」
      for (int j = 1; j <= 5; j++) {
        System.out.println(j);
        if (j != 5) {
          System.out.println(" ");
        } else {
          System.out.println();
        }
      }
    }
  }
}
