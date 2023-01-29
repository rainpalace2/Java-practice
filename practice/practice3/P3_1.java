package practice3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class P3_1 {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    // String型の変数に文字列を代入し、その値を表示する
    String s = br.readLine(); // 1行分の文字列を入力する
    System.out.println(s);
    
    // BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    // String s = br.readLine();
    // int n = Integer.parseInt(s);  文字列から数値を得る
    

    // 1行で記述
    // int n = Integer.parseInt(br.readLine());

    // int型の変数xに数値を入力し、その値を表示する
    int x = Integer.parseInt(br.readLine());
    System.out.println(x);
    
    // int型の変数xに数値を入力し、xを1乗,2乗,3乗した結果を表示する
    int x1 = Integer.parseInt(br.readLine());
    System.out.println(x1);
    System.out.println(x1 * x1);
    System.out.println(x1 * x1 * x1);

    // xとyの和、差、積、商と余りを表示する
    int x2 = Integer.parseInt(br.readLine());
    int y = Integer.parseInt(br.readLine());
    System.out.println(x2 + y);
    System.out.println(x2 - y);
    System.out.println(x2 * y);
    System.out.println(x2 / y);
    System.out.println(x2 % y);
  }
}
