package array;

public class sample5 {
  public static void main(String[] args) {
    // double型の配列の宣言・初期化
    double[] num = { 1.11, 2.22, 3.33 };

    // 条件式でlengthを使用して配列の要素数だけ繰り返し処理を行う
    for (int i = 0; i < num.length; i++) {
      System.out.println("num[" + i + "] = " + num[i]);
    }
  }
}