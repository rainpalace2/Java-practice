package practice2;

// 標準入力とループ処理
import java.util.Scanner;

public class Input {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int number = sc.nextInt();

    String player;
    for (int i = 1; i <= number; i++) {
      player = sc.next();
      System.out.println(player);
    }
  }
}