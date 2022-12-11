package practice2;

// 2次元配列を拡張for文で出力

public class two_dimensional_array2 {
  public static void main(String[] args) {
    String[][] array = { { "勇者", "忍者" }, { "武士", "戦士" }, { "僧侶", "魔法使い" } };

    for (String[] team : array) {
      for (String player : team) {
        System.out.println(player);
      }
    }
  }
}
