package practice8;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class array_reverse {
  public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);

    int n = sc.nextInt();

    ArrayList<Integer> array = new ArrayList<>();
    for (int i = 0; i < n; i++) {
      array.add(sc.nextInt());
    }

    // リストを逆順にするとき、Collections.reverse()を使う
    // Collections.reverse()は引数でリストを渡す必要がある
    Collections.reverse(array);

    for (int x : array) {
      System.out.println(x);
    }
  }
}
