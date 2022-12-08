package practice3;

public class p4 {
  public static void main(String[] args) {
    // 数値を20から10までの奇数を表示する
    int i = 20;
    while (i >= 10) {
      if (i % 2 == 1) {
        System.out.println(i);
      }
      i--;
    }

    int j = 19;
    while (j >= 10) {
      System.out.println(j);
      j -= 2;
    }
  }
}