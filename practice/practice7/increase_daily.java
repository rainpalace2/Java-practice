package practice7;

import java.util.Scanner;

// 毎日増加するお金
// AをAの10%ずつ増加させ、回数を数える

public class increase_daily {
  public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);

    int a = sc.nextInt();
    int b = sc.nextInt();

    int count = 0;

    // 条件を A <= B とすることで、AがB以下の間繰り返すことができる
    while (a <= b) {
      a += a / 10;
      count++;
    }
    System.out.println(count);
  }
}
