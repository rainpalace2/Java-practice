package exception;

public class Exception03 {
	public static void main(String[] args) {
		try {
			// divisionメソッドを呼び出し
			Exception03.division(100, 0);
			// ArithmeticExceptionクラスの例外が発生した場合の例外処理
		} catch (ArithmeticException e) {
			System.out.println("ArithmeticException例外が発生");
			// illegalArgumentExceptionクラスの例外が発生した場合の例外処理
		} catch (IllegalArgumentException e) {
			System.out.println("IllegalSrgumentException例外が発生");
			// キャッチした例外インスタンスをスロー
			throw e;
		}
		System.out.println("プログラム終了");
	}

	public static void division(int a, int b) {
		System.out.println(a + " / " + b + "は？");
		if (b == 0) {
			throw new IllegalArgumentException("引数が不正です");
		}
		int result = a / b;
		System.out.println("計算結果" + result);
	}
}