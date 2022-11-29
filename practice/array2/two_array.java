package array2;

public class two_array {
  public static void main(String[] args) {
    // int型の2次元配列int2Arrayを宣言・生成
    //　上位配列(1次元配列）,下位配列（1次元配列の中の配列）
    // 上位配列のサイズは10,下位配列のサイズは5
    int[][] int2Array = new int[10][5];

    // 初期値を代入して2次元配列を宣言・生成できる
    String[][] string2Array = { { "Sunday", "Monday" }, { "Monday", "Tuesday" } };

    // double型の2次元配列double2Arrayを宣言し、上位配列のみを生成
    double[][] double2Array = new double[5][];

    // 下位配列のみを生成
    double2Array[0] = new double[10];
    double2Array[0] = new double[9];
    double2Array[0] = new double[8];
    double2Array[0] = new double[7];
    double2Array[0] = new double[6];
  }
}