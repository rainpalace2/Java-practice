package practice3;

public class P5 {
  public static void main(String[] args) {
    // ループの外でも変数を使用する場合
    int i;
    for (i = 0; i <= 4; i++) {
      System.out.println("Hello World");
    }
    System.out.println(i);
  }
}
