package practice1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

// Listを使ってHashMapを並べ替える

public class map_sort {
  public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);

    int n = sc.nextInt();

    Map<String, Integer> sa = new HashMap<>();
    for (int i = 0; i < n; i++) {
      String s = sc.next();

      sa.put(s, 0);
    }

    int m = sc.nextInt();

    for (int i = 0; i < m; i++) {
      String t = sc.next();
      int a = sc.nextInt();

      sa.put(t, sa.get(t) + a);
    }

    // Listを用意してMapに格納されているすべてのkeyを取得
    ArrayList<String> keyList = new ArrayList<>(sa.keySet());
    // Listは順序付きのデータ構造であるためソートできる
    Collections.sort(keyList);

    // for文で変数keyListに格納されているキーを変数xに一つずつ代入する
    for (String x : keyList) {
      // getでキーを取得して値を表示する
      System.out.println(sa.get(x));
    }
  }
}
