package practice3;

// ArrayListを作成するための記述
import java.util.ArrayList;

public class AL {
  public static void main(String[] args) {
    // ArrayListの作成
    ArrayList<String> weapon = new ArrayList<String>();

    // ArrayListの要素を追加する
    weapon.add("剣");
    weapon.add("槍");
    weapon.add("斧");

    // ArrayListの要素を出力する
    System.out.println(weapon.get(0));

    // ArrayListの要素をループで出力する
    for (String item : weapon) {
      System.out.println(item);
    }

    // ArrayListのサイズ（長さ）を出力する
    System.out.println(weapon.size());

    // ArrayListの要素を更新する
    weapon.set(0, "ソード");

    // ArrayListの要素を削除する
    weapon.remove(2);

    for (String item : weapon) {
      System.out.println(item);
    }
  }
}
