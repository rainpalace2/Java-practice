package array2;

public class element {
  public static void main(String[] args) {
    // 配列の作成
    String[] team = { "A", "B" };

    // 配列の名前を宣言
    String[] team0;
    // 長さ2の配列を作成してteam0に代入
    team0 = new String[2];
    // 一つずつ値を代入
    team0[0] = "ai";
    team0[1] = "AI";

    // 配列の要素を変数で取り出す
    int num = 0;
    String[] team1 = { "戦士", "忍者" };
    System.out.println(team1[num]);
    System.out.println(team1[num + 1]);

    // 配列の範囲外を参照するとエラーになる
    System.out.println(team1[10]);
  }

}
