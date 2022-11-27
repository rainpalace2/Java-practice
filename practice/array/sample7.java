package array;

public class sample7 {
  public static void main(String[] args) {
    // 配列の要素を初期化
    int[][] num = { { 87, 54, 67 }, { 76, 92, 48 } };

    for (int i = 0; i < 2; i++) {
      for (int j = 0; j < 3; j++) {
        System.out.println("num[" + i + "][" + j + "] = " + num[i][j]);
      }
    }
  }
}