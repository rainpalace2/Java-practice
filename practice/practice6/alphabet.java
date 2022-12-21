package practice6;

import java.util.Scanner;

// a~zまでを表示
// 文字コード a = 97からzまで連続した文字コードが割り当てられている

public class alphabet {
  public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);

    //　カウント変数で'a'を保持し、それを1ずつ増やすことで、'z'まで遷移させることができる
    for (char c = 'a'; c <= 'z'; c++) {
      System.out.println(c);
    }
  }
}
