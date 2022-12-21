package practice6;

import java.util.Scanner;

// 0~9までのカウンタ
// 9までいくと0に戻る

public class counter {
  public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);

    int n = sc.nextInt();

    for (int i = 0; i < 10; i++) {
      System.out.println(n);
      // カウンタの値が9のとき、次の値が0になるように条件分岐
      if (n == 9) {
        n = 0;
      } else {
        n++;
      }
    }
    sc.close();
  }
}
