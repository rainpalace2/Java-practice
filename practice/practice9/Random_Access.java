package practice9;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

// 数列のM番目の値を出力する

public class Random_Access {
  public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);

    int n = sc.nextInt();
    int m = sc.nextInt();

    List<Integer> a = new ArrayList<>();
    for (int i = 0; i < n; i++) {
      a.add(sc.nextInt());
    }

    System.out.println(a.get(m - 1));
  }
}
