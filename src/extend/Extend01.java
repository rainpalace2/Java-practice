package extend;

public class Extend01 {
  public static void main(String[] args) {
    Human sugimoto = new Human("杉元", 16);
    System.out.println("Human クラスのメソッド : 名前は、" + sugimoto.getName());

    // Studentクラスのインスタンスを生成
    Student sato = new Student("佐藤", 17, 70);
    // サブクラスのインスタンスからスーパークラスのメソッドを呼び出し
    System.out.println("Humanクラスのメソッド : 名前は、" + sato.getName());
    System.out.println("Studentクラスのメソッド : プロフィールを紹介します。" + sato.getStudentProfile());

    // Employeeクラスのインスタンスを生成して、アップキャストでHumanクラスの変数に代入
    Human human = new Employee("田中", 28, "システム部");
    System.out.println("Humanクラスのメソッド : 名前は、" + human.getName());

    // Employeeクラスの変数にダウンキャスト
    Employee tanaka = (Employee) human;
    System.out.println("Employeeクラスのメソッド : プロフィールを紹介します。" + tanaka.getEmployeeProfile());

    Extend01.printName(sugimoto);
    Extend01.printName(sato);
    Extend01.printName(tanaka);
  }

  // 引数がHumanクラスなので、Humanクラスか、そのサブクラスなら呼び出しできる
  public static void printName(Human human) {
    System.out.println("Humanクラスのメソッド : 名前は、" + human.getName());
  }
}
