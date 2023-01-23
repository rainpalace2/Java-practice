package practice2;

// ループで2次元配列を出力する

public class Two_dimensional_array {
  public static void main(String[] args) {
    String[][] array = { { "勇者", "忍者" }, { "武士", "戦士" }, { "僧侶", "魔法使い" } };

    for (int i = 0; i < array.length; i++) {
      for (int j = 0; j < array[i].length; j++) {
        System.out.println(array[i][j]);
      }
    }
  }
}
