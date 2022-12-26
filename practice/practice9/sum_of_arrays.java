package practice9;

import java.util.Scanner;

// 様々な長さの配列の和

public class sum_of_arrays {
  public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);

    int n = sc.nextInt();

    for (int i = 0; i < n; i++) {
      int sum = 0;
      int k = sc.nextInt();
      int[] array = new int[k];
      for (int j = 0; j < k; j++) {
        array[j] = sc.nextInt();
        sum += array[j];
      }
      System.out.println(sum);
    }
  }
}
