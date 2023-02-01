package practice4;

// 累乗計算（for文）
// aのn乗において、aは底、nは指数
// aのn上を行う場合、aをかけるという処理をn回繰り返す

public class xponentiation1 {
  public static void main(String[] args) {

    // 底
    int a = (202 + 134) * 107;

    // 指数
    int b = 2;

    // 累乗計算の解
    int result = 1;

    for (int i = 0; i < b; i++) {
      result *= a;
    }
    System.out.println(result);
  }
}
