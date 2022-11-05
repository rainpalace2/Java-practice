package extend;

public class Employee extends Human {
  private String department;

  public Employee(String name, int age, String department) {
    super(name, age);
    this.department = department;
  }

  public String getEmployeeProfile() {
    String profile = "年齢は" + this.age + "です。";
    // 親インスタンスのフィールドをthis変数で参照
    profile += "サラリーマンで、部署は" + this.department + "です。";
    return profile;
  }
}