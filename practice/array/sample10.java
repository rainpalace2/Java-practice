package array;

public class sample10 {
  public static void main(String[] args) {
    /* 配列を別の配列に代入した場合、同じ配列本体への参照がコピーされ
       要素の値を変更してもどちらの配列も同じ値を取得する */
    int[] src = { 12, 24, 18 };
    int[] dst = src;

    System.out.println("src[0] = " + src[0]); // 12
    System.out.println("dst[0] = " + dst[0]); // 12

    /* 配列本体は同じのため、要素の値を変更してどちらの配列を参照しても
    変更した値が取得される　*/
    src[0] = 42;

    System.out.println("src[0] = " + src[0]); // 42
    System.out.println("dst[0] = " + dst[0]); // 42

    // 要素の値を一つ一つコピーする
    int[] src1 = { 12, 24, 18 };
    int[] dst1 = new int[3];

    // コピー元の要素の値を一つ一つ取り出し、コピー先の要素に代入
    for (int i = 0; i < src1.length; i++) {
      dst1[i] = src1[i];
    }

    System.out.println("src1[0] = " + src1[0]); // 12
    System.out.println("dst1[0] = " + dst1[0]); // 12

    /*　配列本体は別となっているため、コピー元の配列の要素の値を変更しても
    コピー先の配列の要素には影響がない */
    src1[0] = 42;

    System.out.println("src1[0] = " + src1[0]); // 42
    System.out.println("dst1[0] = " + dst1[0]); // 12

  }
}