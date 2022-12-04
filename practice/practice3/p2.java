package practice3;

public class p2 {
  public static void main(String[] args) {
    // int型の変数xに11を代入して"x=11"のように表示
    int x = 11;
    System.out.println("x = " + x);

    // x=13,y=17のように表示
    x = 13;
    int y = 17;
    System.out.println("x = " + x + ", " + "y = " + y);

    // 変数に13と17の和を代入して表示
    x = 13 + 17;
    System.out.println("x = " + x);

    // 変数を使用しないで13と17の積を表示
    System.out.println(13 * 17);

    // int型の変数xに任意の値を代入し、xより小さい任意の値で割った商と余りを表示する
    x = 15;
    System.out.println("商は" + x / 5);
    System.out.println("余りは" + x % 8);

    // インクリメント、デクリメント演算子を適用した結果を表示
    x = 10;
    x++;
    System.out.println(x);

    x--;
    x--;
    System.out.println(x);
  }
}
