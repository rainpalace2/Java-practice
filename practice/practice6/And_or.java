package practice6;

import java.util.Scanner;

// aが10以上かつbが10以上の場合にYESを出力する
// cが10以上の時はa,bの値に関わらずYESを出力する

public class And_or {
  public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);

    int a = sc.nextInt();
    int b = sc.nextInt();
    int c = sc.nextInt();

    // cが10以上であればa,bの値に関わらずYESを出力するので、まずはcを条件分岐に通す
    if (c >= 10) {
      System.out.println("YES");
      // cが10以上でなかった場合、aとbの値で出力結果を判定する
    } else {
      if (a >= 10 && b >= 10) {
        System.out.println("YES");
      } else {
        System.out.println("NO");
      }
    }
    sc.close();

    // 「cが10以上またはaが10以上かつbが10以上」でも可能
    // if(c >= 10 || a >= 10 && b >= 10)
  }
}
