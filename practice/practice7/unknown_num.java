package practice7;

import java.util.Scanner;

// 未知数個の数の受け取り

public class unknown_num {
  public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);

    int n = 0;
    // -1が入力されるまでループする
    // nが-1でないときループし、nが-1になるとループを抜ける
    while (n != -1) {
      n = sc.nextInt();
      System.out.println(n);
    }
  }
}
