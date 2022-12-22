package practice6;

import java.util.Scanner;

// 数列のA番目からB番目までの和

public class sequence {
  public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);

    int n = sc.nextInt();
    int a = sc.nextInt();
    int b = sc.nextInt();

    int[] num = new int[n];

    for (int i = 0; i < n; i++) {
      num[i] = sc.nextInt();
    }

    int sum = 0;
    // ループ変数をA-1からB-1まで遷移させる
    for (int i = a - 1; i < b; i++) {
      sum += num[i];
    }
    System.out.println(sum);
  }
}
