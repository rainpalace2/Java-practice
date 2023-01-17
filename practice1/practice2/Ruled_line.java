package practice2;

// 罫線入りの九九表

public class Ruled_line {
  public static void main(String[] args) {

    for (int i = 1; i <= 9; i++) {
      for (int j = 1; j <= 9; j++) {
        // %2dで２桁でないときは半角スペースで埋める
        System.out.printf("%2d", i * j);
        if (j < 9) {
          System.out.print(" | ");
        } else {
          System.out.println();
        }
      }
      // 罫線の数は上の行の文字数と同じ数
      if (i != 9) {
        for (int j = 0; j < 2 * 9 + 3 * 8; j++) {
          System.out.print("=");
        }
        System.out.println();
      }
    }
  }
}
