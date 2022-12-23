package practice7;

import java.util.Scanner;

// 階乗の計算
// 3! => 3 * 2 * 1

public class factorial {
  public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);

    int n = sc.nextInt();

    int factorial = 1;

    for (int i = 2; i <= n; i++) {
      factorial *= i;
    }
    System.out.println(factorial);
  }
}
