package practice4;

// 累乗（powメソッド）

public class exponentiation2 {
  public static void main(String[] args) {

    int a = 10;
    int b = 2;
    int result = 0;

    result = (int) Math.pow(a, b);
    System.out.println(result);

    // 累乗の結果 = Math.pow(基数, 指数);
    // powメソッドは、第一引数に「基数」を指定し、第二引数に「指数」を指定する

    // 基数：冪乗の対象となる値
    // 指数：何乗するのかの値
    // 10の2乗の場合、基数が10,指数が2

    /* powメソッドの引数と戻り値はdouble型となるため、上記では引数については
    intからdoubleへの暗黙的なキャスト、戻り値についてはdoubleからintへの明示的な
    キャストを行っている */
  }
}
