package practice4;

// HashMapをループで処理する

import java.util.HashMap;
import java.util.Map.Entry;

public class Hashmap {
  public static void main(String[] args) {
    /* HashMapの作成　
     キーのデータ型と値のデータ型を指定する */
    HashMap<String, String> e = new HashMap<String, String>();
    // HashMapに要素を格納
    e.put("ザコ", "スライム");
    e.put("中ボス", "ドラゴン");
    e.put("ラスボス", "魔王");

    /* キーと値のデータ型がStringのentry変数を用意して
       entrySetメソッドでMapのEntryを全て取得する */
    for (Entry<String, String> entry : e.entrySet()) {
      // getKeyメソッドでキーを取得する
      System.out.print(entry.getKey() + ", ");
      // getValueメソッドで値を取得する
      System.out.println(entry.getValue());
    }
  }
}
