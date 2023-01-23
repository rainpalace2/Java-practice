package practice2;

// 2次元配列をnewで作成

public class New_array {
  public static void main(String[] args) {
    int[][] array = new int[2][3];

    for (int[] item : array) {
      for (int num : item) {
        System.out.print(num);
      }
      System.out.println("");
    }
  }
}
