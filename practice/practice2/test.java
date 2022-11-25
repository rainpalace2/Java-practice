package practice2;

public class test {
  public static void main(String[] args) {

    // 1~10までの偶数を表示させる
    int i = 2;
    while (i <= 10) {
      System.out.println(i);
      i += 2;
    }

    // 偶数の総和
    int total = 0;
    for (int k = 2; k <= 10; k += 2) {
      total = total + k;
    }
    System.out.println(total);

    // 1~10までの整数をカンマ区切りで横並びに表示する
    // 10の横にもカンマが付く
    //    for (int j = 1; j <= 10; j++) {
    //      System.out.print(j + ",");
    //    }

    // 1~10までの整数をカンマ区切りで横並びに表示させる
    String str = "1,2,3,4,5,6,7,8,9,10";
    System.out.print(str);
  }
}
