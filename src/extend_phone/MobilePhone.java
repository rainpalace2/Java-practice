package extend_phone;

// Phone, Cameraインターフェースを実装したMobilePhoneクラスの宣言
public class MobilePhone implements Phone, Camera {
  private String number;

  public MobilePhone(String number) {
    this.number = number;
  }

  @Override
  public void takePicture() {
    System.out.println("写真を撮ります。");
  }

  @Override
  public void call(String number) {
    System.out.println(this.number + "　から" + number + "　に電話をかけます。");
  }
}