package practice5;

import java.util.Scanner;

// 入力として受け取った実数を、小数点以下の出力する桁数を指定して出力する

public class Real_num1 {
  public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);

    Double d = sc.nextDouble();
    int n = sc.nextInt();

    System.out.printf("%." + n + "fn", d);
  }
}
