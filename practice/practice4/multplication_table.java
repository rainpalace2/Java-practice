package practice4;

/* 九九表を罫線入りで出力
   数値を出力する際は2桁になるように半角スペースで埋める
 　 = を出力する際はその上の行の文字数と等しくなるようにする */

public class multplication_table {
  public static void main(String[] args) {

    // 2重ループでは外側のループが縦、内側のループが横と考える
    for (int i = 1; i < 10; i++) {
      for (int j = 1; j < 10; j++) {
        // 2桁となるようにprintfメソッドを使用
        System.out.printf("%2d", i * j);
        if (j < 9) {
          System.out.print(" | ");
        } else {
          System.out.println();
        }
      }

      // 行間で = を出力
      if (i != 9) {
        // 各行で2桁の数値を9個、3文字を8個出力する
        for (int j = 0; j < 2 * 9 + 3 * 8; j++) {
          System.out.print("=");
        }
        System.out.println();
      }
    }
  }
}
