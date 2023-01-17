package practice1;

import java.util.Scanner;

public class For_if {
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    int count = scan.nextInt();
    System.out.println(count);

    for (int i = 0; i < count; i++) {
      int num = scan.nextInt();

      if (num == 0) {
        System.out.println(num + "は0");
      } else if (num > 0) {
        System.out.println(num + "はマイナス");
      } else {
        System.out.println(num + "はプラス");
      }
    }
  }
}