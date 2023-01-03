package practice1;

import java.util.Scanner;

// 文字の重複をカウントする

public class char_duplicate_count {
  public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);

    String s = sc.next();
    // 配列に１文字ずつ格納
    String[] str = sc.next().split("");

    int count = 0;
    for (String x : str) {
      if (x.equals(s)) {
        count++;
      }
    }
    System.out.println(count);
  }
}
