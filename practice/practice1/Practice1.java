package practice1;

//データを受け取る機能をプログラムの中で扱う
import java.util.Scanner;

public class Practice1 {
  public static void main(String[] args) {
    // 変数scanにデータを受け取る機能を割り当てる
    Scanner scan = new Scanner(System.in);
    // nextメソッド（入力データを読み込む）を呼び出し
    String text = scan.next();
    // 2つ目のデータを受け取る
    String text1 = scan.next();
    System.out.println(text);
    System.out.println(text1);
    // 整数データを受け取る
    int number = scan.nextInt();
    System.out.println(number * 10);
    System.out.println("金額は" + number + "円です。");
  }
}
