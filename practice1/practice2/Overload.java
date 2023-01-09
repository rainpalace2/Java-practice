package practice2;

// オーバーロード
// 引数のが異なる場合

public class Overload {
  public static void main(String[] args) {

    System.out.println(add(10, 20));

    System.out.println(add(3.5, 2.7));

    System.out.println(add("Hello", "World"));
  }

  // 仮引数の型が異なれば同じ名前のメソッドを複数定義できる

  // １つ目のaddメソッド
  public static int add(int x, int y) {
    return x + y;
  }

  // ２つ目のaddメソッド
  public static double add(double x, double y) {
    return x + y;
  }

  // ３つ目のaddメソッド
  public static String add(String x, String y) {
    return x + y;
  }

}
