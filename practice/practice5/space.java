package practice5;

// 自然数を3桁になるよう、半角スペースで出力する

import java.util.Scanner;

public class space {
  public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);

    int n = sc.nextInt();

    // 3d：出力する値の最小の幅を3にする
    // d：出力する値の型が整数であることを意味する
    System.out.printf("%3d\n", n); //  12

    /* 半角スペースではなく0で埋める場合、
       桁数の指定の前に0を置く */
    System.out.printf("%03d\n", n); // 012
  }
}
