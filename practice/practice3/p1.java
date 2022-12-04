package practice3;

public class p1 {
  public static void main(String[] args) {
    // Hellot worldを表示
    System.out.println("Hello World");

    // int型の変数xに7を代入
    // 変数xの値を3倍して表示
    int x = 7;
    x *= 3;
    System.out.println("x = " + x);

    // 変数xの値を半分にする
    // 変数xの値を表示
    x /= 2;
    System.out.println("x = " + x);

    // int型の変数x,yに任意の数値を代入し、xの値をyに、yの値をxに入れ替えて表示
    x = 3;
    int y = 7;

    int t = x;
    x = y;
    y = t;

    System.out.println("x = " + x + ", y = " + y);

    // int型の変数x,yに19,23を代入し、その席を変数zに代入して表示
    x = 19;
    y = 23;
    int z = x * y;
    System.out.println("z = " + z);

    // int型の変数xに任意の値を代入し、xを2倍、3倍、4倍した結果を表示
    x = 5;
    System.out.println(x * 2);
    System.out.println(x * 3);
    System.out.println(x * 4);

    // int型の変数xに任意の値を代入し、xを1乗、2乗、3乗した結果を表示
    x = 4;
    System.out.println(x);
    System.out.println(x * x);
    System.out.println(x * x * x);
  }
}
