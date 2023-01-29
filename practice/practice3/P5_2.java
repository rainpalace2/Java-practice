package practice3;

import java.util.Scanner;

public class P5_2 {
  public static void main(String[] args) {
    /* 標準入力から、1行目に西暦年、2行目に期間が与えられる。
       この西暦年から始まる、期間分の西暦年と昭和年の対応表 */
    Scanner sc = new Scanner(System.in);
    int seireki = sc.nextInt();
    int count = sc.nextInt();
    int shouwa;

    for (int i = 0; i < count; i++) {
      System.out.print("西暦" + seireki + "年は");
      shouwa = seireki - 1925;
      System.out.println("昭和" + shouwa + "年です");
      seireki++;
    }
  }
}
