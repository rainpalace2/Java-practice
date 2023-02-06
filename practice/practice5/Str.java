package practice5;

// 2つの文字列の半角スペース区切りでの分割

public class Str {
  public static void main(String[] args) {
    String s = "Hello World";
    /* splitメソッドの引数に半角スペースを指定して
       半角スペース区切りで分割して配列に代入 */
    String[] str = s.split(" ");

    System.out.println(str[0]);
    System.out.println(str[1]);

    // 3つの文字列の半角スペース区切りでの分割
    String w = "He likes world";
    String[] world = w.split(" ");

    for (int i = 0; i < 3; i++) {
      System.out.println(world[i]);
    }

    // 5つの文字列の半角スペース区切りでの分割
    String n = "one two three four five";
    String[] num = n.split(" ");

    for (int i = 0; i < num.length; i++) {
      System.out.println(num[i]);
    }
  }
}
