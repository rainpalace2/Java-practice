package practice8;

import java.util.ArrayList;
import java.util.Scanner;

// 部分配列
// 配列のa番目からb番目を改行区切りで出力する

public class SubArray {
  public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);

    int a = sc.nextInt();
    int b = sc.nextInt();
    int n = sc.nextInt();

    // 空のArrayListを用意
    ArrayList<Integer> array = new ArrayList<>();
    // for文で入力値を変数arrayに追加していく
    for (int i = 0; i < n; i++) {
      // 要素eを追加するにはadd(e)を使う
      array.add(sc.nextInt());
    }

    for (int i = a - 1; i < b; i++) {
      // インデックスiの要素の取得はget(i)を使う
      System.out.println(array.get(i));
    }
  }
}
