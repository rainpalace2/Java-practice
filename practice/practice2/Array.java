package practice2;

public class Array {
  public static void main(String[] args) {
    String player1 = "勇者";
    String player2 = "騎士";
    String player3 = "戦士";

    System.out.println(player1);
    System.out.println(player2);

    // 配列の要素を変数で指定
    // 文字列の配列に数値は入れられない　100× "100"○
    String[] team = { "勇者", "騎士", player3 };
    System.out.println(team[0]);
    System.out.println(team[1]);
    System.out.println(team[2]);
  }
}