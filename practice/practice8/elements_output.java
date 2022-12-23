package practice8;

import java.util.Scanner;

// 要素数の出力
// 行数 * 列数で求めることができる

public class elements_output {
  public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);

    int[][] a = { { 1, 2, 3, 4, 5, 6, }, { 8, 1, 3, 3, 1, 8 } };

    // 2次元配列aが持っている要素の数（行の数を表す）
    int row = a.length;
    // 2次元配列のインデックス0に格納されている配列の要素数を取得する（列の数を表す）
    int col = a[0].length;
    System.out.println(row * col);
  }
}
