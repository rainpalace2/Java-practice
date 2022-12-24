package practice8;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

// 配列のソート
// n個の整数を小さい順にソート

public class array_sort {
  public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);

    int n = sc.nextInt();

    ArrayList<Integer> array = new ArrayList<>();
    for (int i = 0; i < n; i++) {
      array.add(sc.nextInt());
    }

    // Collections.sort()はソートを行うメソッド
    // 引数でリストを渡すと、要素が昇順にソートされる
    Collections.sort(array);

    for (int x : array) {
      System.out.println(x);
    }
  }
}
