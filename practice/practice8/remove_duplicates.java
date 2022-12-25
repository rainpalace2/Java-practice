package practice8;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

// 重複を排除するために、集合を使う方法

public class remove_duplicates {
  public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);

    // TreeSetのインスタンスを生成するために、リストを生成する
    List<Integer> li = Arrays.asList(1, 3, 5, 1, 2, 3, 6, 6, 5, 1, 4);
    // リストを引数で渡してTreeSetのインスタンスを生成する
    Set<Integer> a = new TreeSet<>(li);

    for (int x : a) {
      System.out.println(x);
    }
  }
}
