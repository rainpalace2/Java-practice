package practice1;

//条件の評価結果

public class Bool {
public static void main(String[] args) {
 int number = 1;
 boolean flag = number == 1; // number変数が1のときtrue
 if (flag) {
   System.out.println("true"); // 条件が成立したときの処理
 } else {
   System.out.println("false"); // 条件が成立しなかったときの処理
 }
}

  // キャスト
  // 実数から数値
  double number = 3.14;System.out.println((int)number);

  // 数値から実数
  int number = 3;System.out.print((double)number);

  // 文字列から数値
  String text = "1234";System.out.println(Integer.parseInt(text));

  // 文字列から実数
  String test = "3.14";System.out.println(Double.parseDouble(test));
}