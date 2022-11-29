package array2;

public class sample1 {
  public static void main(String[] args) {
    // 配列の宣言
    // 配列型[] 配列名

    int[] intArray; // int型の配列intArrayを宣言
    String[] stringArray; // String型の配列stringArrayを宣言

    // 配列の生成
    // 配列名 = new 配列型[サイズ];
    // 配列型[] 配列名 = new 配列型[サイズ]; ※宣言と生成を同時に実施

    // 10個のint型のデータを持つ配列intArrayを生成
    intArray = new int[10];

    // 配列の宣言と生成を同時に実施
    double[] doubleArray0 = new double[10];

    // 初期化
    // 配列型[] 配列名 = {データ, データ...};

    // double型の配列doubleArrayを宣言・生成
    double[] doubleArray1 = { 1.05d, 1.06d, 1.07d };

    // String型の配列stringArrayを宣言・生成
    String[] stringArray0 = { "Sunday", "Monday", "Tuesday" };

    // 参照型配列の生成
    // stringArray[0]のインスタンスを生成していないため、例外が返る
    String[] stringArray2 = new String[10];
    System.out.println(stringArray2[0].length());

    // 初期値Sundayを持つ、Stringクラスのインスタンスを生成
    String[] stringArray3 = new String[10];
    stringArray3[0] = new String("Sunday");
    System.out.println(stringArray3[0].length());

    // インスタンスの生成も同時に行われる
    String[] stringArray4 = { "Sunday", "Monday", "Tuesday" };
    System.out.println(stringArray4[0]);
  }
}