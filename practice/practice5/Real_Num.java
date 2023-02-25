package practice5;

// 1つの実数を出力
import java.util.Scanner;

public class Real_Num {
  public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);

    Double d = sc.nextDouble();

    // printf：書式付き出力メソッド
    // %：書式の開始を表す記号
    // .3f：少数第3位までを出力する
    // \n：改行を表す。printfメソッドは末尾で改行を入れない
    System.out.printf("%.3f\n", d);
  }
}
