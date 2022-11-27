package array;

public class sample6 {
  public static void main(String[] args) {
    // int型の値を要素に格納する配列を、要素に格納する配列で、要素数が2の配列を作成
    int[][] num = new int[2][];

    // 「int型の値を要素に格納する配列」を格納する要素に格納する配列を作成
    // { {1,2,3},{4,5,6} } 
    num[0] = new int[3]; // {1,2,3}の部分
    num[0][0] = 78;
    num[0][1] = 64;
    num[0][2] = 59;

    num[1] = new int[3]; // {4,5,6}の部分
    num[1][0] = 58;
    num[1][1] = 92;
    num[1][2] = 82;

    for (int i = 0; i < 2; i++) {
      for (int j = 0; j < 3; j++) {
        System.out.println("num[" + i + "][" + j + "] = " + num[i][j]);
      }
    }
  }
}