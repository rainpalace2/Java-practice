package practice2;

import java.util.Scanner;

// 標準入力から複数行データの読み込み

public class Multiple_lines {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    // hasNextLineメソッドで入力する行がまだあるかを確認する
    // 入力行があればnextLineメソッドで出力し、なければループを終了する
    while (sc.hasNextLine()) {
      String line = sc.nextLine();
      System.out.println(line + "が現れた");
    }
  }
}
