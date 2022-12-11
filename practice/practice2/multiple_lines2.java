package practice2;

import java.util.ArrayList;
import java.util.Scanner;

// 標準入力から読み込んだ複数行データを配列に格納する

public class multiple_lines2 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    ArrayList<String> array = new ArrayList<String>();

    while (sc.hasNextLine()) {
      String data = sc.nextLine();
      array.add(data);
    }

    for (String str : array) {
      System.out.println(str);
    }
  }
}
