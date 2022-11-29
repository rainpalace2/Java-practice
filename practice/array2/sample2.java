package array2;

import java.util.Arrays; // java.util.Arraysのインポートが必要

public class sample2 {
  public static void main(String[] args) {
    int[] src = { 12, 24, 18 };
    // 第1引数にコピーする対象の配列を指定する
    // 第2引数にコピーする配列の長さを指定する
    // すべての要素をコピーするには配列の要素数を指定する
    int[] dst = Arrays.copyOf(src, 3);

    System.out.println("src[0] = " + src[0]); // 12
    System.out.println("dst[0] = " + dst[0]); // 12

    /* コピー元とコピー先の配列本体は別、コピー元の要素を変更しても
    コピー先の要素には影響がない */
    src[0] = 42;

    System.out.println("src[0] = " + src[0]); // 42
    System.out.println("dst[0] = " + dst[0]); // 12

    // System.arraycopy?メソッドを使うには、あらかじめコピー先の配列を作成しておく必要がある
    int[] src1 = { 12, 24, 18 };
    int[] dst1 = new int[3];

    // 第1引数にコピー元の配列を指定し、第3引数にコピー先の配列を指定する。
    /* コピー元の第2引数で指定した位置から、コピー先の第4引数で指定した位置に、
    第5引数で指定した数だけコピーを行う */
    System.arraycopy(src1, 0, dst1, 0, 3);

    System.out.println("src1[0] = " + src1[0]);
    System.out.println("dst1[0] = " + dst1[0]);

    /* コピー元とコピー先の配列本体は別、コピー元の要素を変更しても
    コピー先の要素には影響がない */
    src1[0] = 42;

    System.out.println("src1[0] = " + src1[0]);
    System.out.println("dst1[0] = " + dst1[0]);
  }
}
