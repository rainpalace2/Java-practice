package practice7;

import java.util.Scanner;

// 各桁の和を求める
// 12345 => 15

public class Sum_Of_Digits {
  public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);

    int n = sc.nextInt();

    // 各桁の和を保持する変数を宣言する
    int sum = 0;
    while (n > 0) {
      // nを10で割った余を表し、nの一の位を求めることができる
      int t = n % 10;
      sum += t;
      // nを10で割り、nの全体の桁を一つ下げる
      // n = 12345のとき、n /= 10をすると1234.5の.5は切り捨てられ、nは1234となる
      n /= 10;
    }
  }
}
