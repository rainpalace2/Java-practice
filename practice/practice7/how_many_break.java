package practice7;

import java.util.Scanner;

// 何回2で割れるか

public class how_many_break {
  public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);

    int n = sc.nextInt();

    int count = 0;
    // 2で割ることができなくなるまで2で割り続ける
    while (n % 2 == 0) {
      count++;
      n /= 2;
    }
  }
}
