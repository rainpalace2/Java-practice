package practice6;

import java.util.Scanner;

// 足したり引いたり

public class Add_or_pull {
  public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);

    int a = sc.nextInt();
    int b = sc.nextInt();
    int c = sc.nextInt();

    if (a + b + c == 0) {
      System.out.println("YES");
    } else if (a + b - c == 0) {
      System.out.println("YES");
    } else if (a - b + c == 0) {
      System.out.println("YES");
    } else if (a - b - c == 0) {
      System.out.println("YES");
    } else {
      System.out.println("NO");
    }
  }
}
