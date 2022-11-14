public class Main {
  public static void main(String[] args) {
    int price = 2000;
    System.out.println("定価は" + price + "円です。");
    int tax_price = (int) (price * 0.85);
    System.out.println("割引価格は" + tax_price + "円です。");
    int consumprion_tax_price = (int) (tax_price * 1.08);
    System.out.println("税込価格は" + consumprion_tax_price + "円です。");
    int person = Math.random() * 5 + 2;
    System.out.println("人数が" + person + "人の場合、");
    int amountPerson = consumprion_tax_price / person;
    int remainder = consumprion_tax_price % person;
    System.out.println("一人当たり" + amountPerson + "円、余り" + remainder + "円です。");
  }
}