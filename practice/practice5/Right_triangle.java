package practice5;

import java.util.Scanner;

// 直角三角形の出力
// 1 行目の出力する個数は 1 つ、2 行目の出力する個数は 2 つ。i 行目の出力する個数は i 個。

public class Right_triangle {
  public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);

    int n = sc.nextInt();

    // 外側のforは行を、内側のforは列をを表すと考える
    // i 行で出力する値は 1 ~ i までの整数なので、内側のfor文は j=1から j=iまでの繰り返し
    for (int i = 1; i <= n; i++) {
      for (int j = 1; j <= i; j++) {
        System.out.println(j);
        if (j == i) {
          System.out.println();
        } else {
          System.out.print(" ");
        }
      }
    }
  }
}
