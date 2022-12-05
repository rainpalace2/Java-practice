package practice3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class p3_2 {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    // 2つの整数値を入力し、平均値を求める
    int x = Integer.parseInt(br.readLine());
    int y = Integer.parseInt(br.readLine());

    System.out.println((x + y) / 2);

    int age = Integer.parseInt(br.readLine());
    System.out.println("年齢は" + age);
    System.out.println("生まれてから現在までの、おおよその日数は" + age * 365 + "日です。");
  }

}
