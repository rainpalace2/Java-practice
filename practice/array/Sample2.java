package array;

public class Sample2 {
  public static void main(String[] args) {
    int[] num = new int[4];

    num[0] = 10;
    num[1] = 8;
    num[2] = 16;
    num[3] = 5;

    for (int i = 0; i < 4; i++) {
      System.out.println("num[" + i + "] = " + num[i]);
    }
  }
}