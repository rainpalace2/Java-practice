package practice6;

import java.util.Scanner;

// 5つの値から最小値を出力する

public class Min_Val {
  public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);

    // 答えを管理する変数を用意し、大きな値で初期化する
    int answer = 100;

    for (int i = 0; i < 5; i++) {
      int n = sc.nextInt();
      // 入力された値と変数の値を比較し、小さい方の値で変数を更新する
      if (n < answer) {
        answer = n;
      }
    }
    System.out.println(answer);
    sc.close();
  }
}
