import java.util.*;

public class Main {
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    String name = scan.next();
    System.out.println("Hello " + name);
    
    // 文字列が一致しているか判定する（equalsメソッド)
    if (name.equals("Java")) {
      System.out.println("Welcome");
    } else if (name.equals("JAVA")) {
      System.out.println("We are");
    } else {
      System.out.println("Goodbye");
    }
  }
}