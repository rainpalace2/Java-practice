package practice2;

import java.util.Scanner;

// １つの実数を出力

public class Real_number {
  public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);

    double d = sc.nextDouble();
    int n = sc.nextInt();

    // 二つの方法がある
    System.out.println(String.format("%." + n + "f", d));

    System.out.printf("%." + n + "f\n", d);
  }
}
