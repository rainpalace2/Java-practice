package practice8;

import java.util.Arrays;
import java.util.Scanner;

// stream.distinctを使う方法

public class Remove_Duplicates2 {
  public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);

    int[] a = { 1, 3, 5, 1, 2, 3, 6, 6, 5, 1, 4 };

    a = Arrays.stream(a).distinct().sorted().toArray();
    // Arrays.stream(a)
    // 配列aのIntStream型を返すコード
    // Stream.distinctを使うためにこれを使う

    // .distinct()
    // 重複を排除するIntStreamのメソッド
    // 前段階で生成されるIntStreamの重複を削除する

    // .sorted()
    // 昇順にソートするIntStreamのメソッド

    // .toArray()
    // int型の配列を生成するIntStreamのメソッド
    // IntStreamが保持している値に基づいてint型の配列が生成される

    for (int x : a) {
      System.out.println(x);
    }
  }
}
