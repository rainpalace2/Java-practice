package practice9;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

// 動的配列

public class Dynamic_Array {
  public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);

    int n = sc.nextInt();
    int q = sc.nextInt();

    List<Integer> a = new ArrayList<>();
    for (int i = 0; i < n; i++) {
      a.add(sc.nextInt());
    }

    for (int i = 0; i < q; i++) {
      int query = sc.nextInt();
      // queryが0のとき、addメソッドでリストの末尾に要素を追加する
      if (query == 0) {
        int x = sc.nextInt();
        a.add(x);
        // queryが1のとき、removeメソッドでリストの一番後ろの要素を削除する
        // a.remove(a.size() - 1)のようにするとリストの一番後ろの要素を削除できる
      } else if (query == 1) {
        a.remove(a.size() - 1);
      } else {
        for (int j = 0; j < a.size(); j++) {
          System.out.println(j);
          if (j < a.size() - 1) {
            System.out.print(" ");
          } else {
            System.out.println();
          }
        }
      }
    }
  }
}
