package practice8;

import java.util.ArrayList;
import java.util.Scanner;

// 配列の要素の入れ替え

public class Swap_Elements {
  public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);

    int a = sc.nextInt();
    int b = sc.nextInt();
    int n = sc.nextInt();

    ArrayList<Integer> array = new ArrayList<>();
    for (int i = 0; i < n; i++) {
      array.add(sc.nextInt());
    }

    // 変数cにarray(a-1)の値を代入する
    int c = array.get(a - 1);
    // array(a-1)にarray(b-1)の値を代入する
    array.set(a - 1, array.get(b - 1));
    // array(b-1)に変数cの値を代入する
    array.set(b - 1, c);

    for (int x : array) {
      System.out.println(x);
    }
    sc.close();
  }
}
