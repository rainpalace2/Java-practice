package array;

// java.util.Arraysのインポートが必要
import java.util.Arrays;

public class Sample9 {
  public static void main(String[] args) {
    int[] num = new int[3];
    // 1番目の引数に指定した配列のすべての要素に2番目の引数で指定した値を格納する
    Arrays.fill(num, 10);

    System.out.println(num[0]); // 10
    System.out.println(num[1]); // 10
    System.out.println(num[2]); // 10
  }
}