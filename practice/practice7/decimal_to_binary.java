package practice7;

import java.util.Scanner;

// 10進数から2進数への変換

/* 2進数は2の0乗の位、2の1乗の位、2の2乗の位と、2の累乗ごとに桁が上がっていく　
 * 2 で割った余りを求めて 2^0 の位の数字を抽出する 
 * → 2 で割って 2^1 の位を 2^0 の位に下げるという動きを繰り返す */

public class decimal_to_binary {
  public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);

    int n = sc.nextInt();

    int binary = 0;
    int base = 1;

    while (n > 0) {
      int count = n % 2;
      binary += count * base;
      n /= 2;
      base *= 10;
    }
    System.out.println(binary);
  }
}
