package exception;

public class Exception02 {
	public static void main(String[] args) {
		try {
			// 例外が発生する可能性がある処理を記述
			System.out.println("100 / 0は？");
			int result = 100 / 0;
			System.out.println("計算結果" + result);
			// ArithmeticExceptionクラスの例外が発生した場合の例外処理
		} catch (ArithmeticException e) {
			System.out.println("例外が発生");
		} finally {
			//外が発生しても処理を実行
			System.out.println("プログラム終了");
		}
	}
}