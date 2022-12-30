package practice1;

import java.util.HashMap;
import java.util.Scanner;

// Map
// １つの変数で複数のキーと値を保持できる

public class map {
  public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);

    int n = sc.nextInt();

    // <キーの型, 値の型>
    HashMap<String, Integer> sa = new HashMap<>();
    for (int i = 0; i < n; i++) {
      String s = sc.next();
      int a = sc.nextInt();

      // putはキーと値を追加する
      // 第１引数に「キー」、第２引数に「値」を指定する
      sa.put(s, a);
    }

    // getはキーを指定して値を取得する
    System.out.println(sa.get(sc.next()));
  }
}
