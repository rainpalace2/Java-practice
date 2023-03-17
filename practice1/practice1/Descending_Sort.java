package practice1;

import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

// 降順ソート

public class Descending_Sort {
  public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);

    int n = sc.nextInt();

    // オートボクシングでint型をInteger型に変換
    Integer[] a = new Integer[n];

    for (int i = 0; i < n; i++) {
      a[i] = sc.nextInt();
    }

    // 降順にソート
    // Arrays.sort(配列, Collections.reverseOrder())
    /* Arrays.sortメソッドの引数に配列とCollectionsクラスのreverseOrderメソッドを
     * 設定することで光順に並び替えることができる */
    Arrays.sort(a, Collections.reverseOrder());

    for (int i = 0; i < n; i++) {
      System.out.println(a[i]);
    }
  }
}
