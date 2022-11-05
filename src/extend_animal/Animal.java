package extend_animal;

// abstractで、抽象クラスとして宣言
public abstract class Animal {
  protected String name;

  public void eat() {
    System.out.println(name + "が食事をしました！");
  }

  // サブクラスごとに違う処理は、抽象メソッドにしてサブクラスで実装
  public abstract void cry();
}