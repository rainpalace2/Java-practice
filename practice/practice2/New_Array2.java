package practice2;

// 2次元配列の初期値を指定する

public class New_Array2 {
  public static void main(String[] args) {
    int[][] array = new int[2][3];

    for (int i = 0; i < array.length; i++) {
      for (int j = 0; j < array[i].length; j++) {
        // ループの中で、arrayに1を代入する
        array[i][j] = 1;
        System.out.print(array[i][j]);
      }
      System.out.println("");
    }
  }
}
