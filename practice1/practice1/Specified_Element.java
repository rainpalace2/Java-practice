package practice1;

import java.util.Scanner;

// 指定した要素があるかの判定

public class Specified_Element {
  public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);

    int n = sc.nextInt();
    int m = sc.nextInt();
    int[] a = new int[n];

    for (int i = 0; i < n; i++) {
      a[i] = sc.nextInt();
    }

    // 要素が存在するかを論理型の変数で管理
    boolean bool = false;
    for (int x : a) {
      if (x == m) {
        bool = true;
      }
    }

    if (bool) {
      System.out.println("Yes");
    } else {
      System.out.println("No");
    }
  }
}
