package practice8;

import java.util.Scanner;

// ある数以上以下の要素の出力

public class Above_And_Below {
  public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);

    int n = sc.nextInt();
    int[] a = new int[n];

    for (int i = 0; i < n; i++) {
      a[i] = sc.nextInt();
    }

    // 配列の前要素の合計を求める
    int sum = 0;
    for (int x : a) {
      sum += x; // 15
    }

    // 配列の長さ（要素数）で割って平均を求める
    /* 計算結果が平均のような実数になる場合は、数そのものを実数にする（小数点を付ける）か、
       または変数の型変換を行う((double)sum)のようにする
       avg = sum / nのようにすると、小数点が切り捨てられ、平均が整数になる */
    double avg = (double) sum / n; // 3.0

    for (int x : a) {
      if (x >= avg) {
        System.out.println(x);
      }
    }
  }
}
