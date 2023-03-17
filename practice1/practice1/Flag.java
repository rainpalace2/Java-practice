package practice1;

import java.util.Scanner;

// フラグ管理
/* 条件を満たすものが一つでもあるかを判定するには
   変数にブール値を代入してフラグとして使う方法が有効 */

public class Flag {
  public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);

    int n = sc.nextInt();

    boolean flag = false;

    for (int i = 0; i < n; i++) {
      int a = sc.nextInt();
      if (a == 7) {
        flag = true;
      }
    }

    if (flag) {
      System.out.println("YES");
    } else {
      System.out.println("NO");
    }
  }
}
