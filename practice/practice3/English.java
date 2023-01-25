package practice3;

// 文字列を、splitメソッドを使って、スペースのところで分割して、単語の数を出力する。

public class English {
  public static void main(String[] args) {
    String str = "One cold rainy day when my father was a little boy he met an old alley cat on his street";
    // 文字列を.split(" ")で分割し、要素数をlengthメソッドで出力する
    int count = str.split(" ").length;
    System.out.println(count);
  }
}
