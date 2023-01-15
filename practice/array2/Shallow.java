package array2;

public class Shallow {
  public static void main(String[] args) {

    // MyTestクラスを定義した後、配列の要素にMyTestクラスのインスタンスを格納する
    MyTest[] src = { new MyTest(28), new MyTest(12) };
    MyTest[] dst = new MyTest[2];

    for (int i = 0; i < src.length; i++) {
      dst[i] = src[i];
    }

    /* クラスのインスタンスなどの参照型の値が格納されていた場合、コピー先の要素に
    コピー元の要素の値を代入したときに、要素に格納されていたクラスのインスタンスへの参照がコピーされる。 
    その為、配列本体は分かれているが、要素が参照しているクラスのインスタンスは同じものを参照している。*/
    System.out.println("src[0] = " + src[0].num); // 28
    System.out.println("dst[0] = " + dst[0].num); // 28

    /* 
    コピー元の配列の要素に格納されているインスタンスへの参照を使って
    インスタンスの値を変更すると、コピー先の要素に格納されているインスタンスも
    同じように変更される　
    */
    src[0].num = 41;

    System.out.println("src[0] = " + src[0].num); // 41
    System.out.println("dst[0] = " + dst[0].num); // 41
  }
}

class MyTest {
  public int num;

  public MyTest(int n) {
    num = n;
  }
}