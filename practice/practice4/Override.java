package practice4;

// オーバーライド

public class Override {
  public static void main(String[] args) {
    Box box = new Box("鋼鉄の剣");
    box.open();

    MagicBox magicBox = new MagicBox("モンスター");
    magicBox.open();
  }
}

class Box {
  public String myItem;

  public Box(String item) {
    myItem = item;
  }

  public void open() {
    System.out.println("宝箱を開いた。" + myItem + "を手に入れた");
  }
}

class MagicBox extends Box {
  public MagicBox(String item) {
    super(item);
  }

  @Override
  public void open() {
    System.out.println("宝箱を開いた。" + myItem + "が襲ってきた！");
  }
}
