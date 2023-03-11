package practice9;

import java.util.Scanner;

// 行列の転置

public class Matrix_Transpose {
  public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);

    int n = sc.nextInt();
    int k = sc.nextInt();
    int[][] a = new int[n][k];

    // N行K列の入力を二次元配列に格納
    for (int i = 0; i < n; i++) {
      for (int j = 0; j < k; j++) {
        a[i][j] = sc.nextInt();
      }
    }

    // 転置後の行列はK行N列となるため、ループの回数も逆転する
    for (int i = 0; i < k; i++) {
      for (int j = 0; j < n; j++) {
        System.out.println(a[j][i]);
        if (j != n - 1) {
          System.out.print(" ");
        } else {
          System.out.println();
        }
      }
    }
  }
}
