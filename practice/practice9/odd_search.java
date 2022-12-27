package practice9;

import java.util.Scanner;

// 奇数の探索
// 数列を先頭から順に見たときに、最後に現れる奇数が何番目にあるか

public class odd_search {
  public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);

    int n = sc.nextInt();
    int[] a = new int[n];

    for (int i = 0; i < n; i++) {
      a[i] = sc.nextInt();
    }

    // 数列を先頭から順に見たときに最後に現れる奇数」 = 「数列を後ろから見たときに最初に現れる奇数」である
    int count = 0;
    for (int i = n - 1; i >= 0; i--) {
      if (a[i] % 2 == 1) {
        count = i + 1;
        break;
      }
    }
    System.out.println(count);
  }
}
