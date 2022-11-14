package to_practice;

import extend_phone.MobilePhone;
import extend_phone.Phone;

public class Chapter13 {
  public static void main(String[] args) {
    MobilePhone mobilePhone = new MobilePhone("000-1111-2222");
    mobilePhone.takePicture();
    Chapter13.staticCall(mobilePhone, "99-8888-7777");
    mobilePhone.powerOff();

    // flyingPhoneインスタンスを生成
    FlyingPhone flyingphone = new FlyingPhone(5);
    flyingphone.fly();
    Chapter13.staticCall(flyingphone, "000-1111-2222");
    flyingphone.powerOff();
  }

  public static void staticCall(Phone phone, String number) {
    phone.call(number);
  }
}