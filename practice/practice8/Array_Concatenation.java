package practice8;

import java.util.ArrayList;
import java.util.Scanner;

// 配列の連結

public class Array_Concatenation {
  public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);

    int a = sc.nextInt();
    int b = sc.nextInt();

    ArrayList<Integer> array = new ArrayList<>();
    for (int i = 0; i < a; i++) {
      array.add(sc.nextInt());
    }

    ArrayList<Integer> array1 = new ArrayList<>();
    for (int i = 0; i < b; i++) {
      array1.add(sc.nextInt());
    }

    // addAllメソッドはリストに他のリストの前要素を追加するメソッド
    // a.addAll(b)として使うことで、リストaの末尾にリストbの前要素を追加できる
    array.addAll(array1);

    for (int x : array) {
      System.out.println(x);
    }
  }
}
