package practice;

import java.util.Scanner;

//複数のデータを受け取る

public class fors {
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    // 繰り返し回数を受け取る
    int count = scan.nextInt();
    System.out.println(count);

    // 指定回数だけ処理を繰り返す
    for (int i = 0; i < count; i++) {
      // 文字列を受け取る
      // 繰り返し処理の中に複数行がある場合、繰り返し実行される
      String name = scan.next();
      System.out.println("Hello " + name);
    }
  }
}