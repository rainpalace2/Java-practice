package array;

public class Sample1 {
  public static void main(String[] args) {
    // int型の配列を宣言し、3つの要素を持つ配列を作成
    int[] result = new int[3];

    // 配列のそれぞれの要素に数値を代入
    result[0] = 75;
    result[1] = 88;
    result[2] = 82;

    // for文で順番に取り出す
    for (int i = 0; i < 3; i++) {
      System.out.println(result[i]);
    }
  }
}