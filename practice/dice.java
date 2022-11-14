public class Main {
  public static void main(String[] args) {
    // * 100 => 何個の数から1つを選ぶのかを指定、+ 1 => いくつから始まるのかを指定
    double rand = Math.random() * 100 + 1;
    
    // 5,6,7(3個)の数からランダムに一つ選ぶ　
    // double rand = Math.random() * 3 + 5;
    
    System.out.println(rand);
    // 型変換（キャスト） double型のrand変数の値をint型に変換してnumber変数に代入
    int number = (int)rand;
    System.out.println(number);
    System.out.println("スライムが" + number + "匹あらわれた");
  }
}