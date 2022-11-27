package array;

public class sample8 {
  public static void main(String[] args) {

    // 配列変数名.lengthは一番外側の配列の要素数を返す
    int[][] num1 = new int[2][3];
    System.out.println(num1.length); // 2

    // 要素に格納されている配列の要素数を取得する
    int[][] num2 = new int[2][3];
    System.out.println(num2.length); // 2
    System.out.println(num2[0].length); // 3
    System.out.println(num2[1].length); // 3

    // 要素に格納されている配列の要素数が異なる場合も同じ
    int[][] num3 = new int[2][];
    num3[0] = new int[3];
    num3[1] = new int[4];

    System.out.println(num3.length); // 2
    System.out.println(num3[0].length); // 3
    System.out.println(num3[1].length); // 4

    int[][] num = { { 87, 54 }, { 76, 92, 48, 58, 84 } };

    for (int i = 0; i < num.length; i++) {
      for (int j = 0; j < num[i].length; j++) {
        System.out.println("num[" + i + "][" + j + "] = " + num[i][j]);
      }
    }
  }
}