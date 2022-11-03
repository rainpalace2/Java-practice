package exception;

import java.io.FileNotFoundException;
import java.io.FileReader;

public class Exception04 {
	public static void main(String[] args) {
		try {
			// raadFileメソッドを呼び出し
			Exception04.readFile("exception.txt");
			// 呼び出し元も例外処理を記述しないとコンパイルエラーになる
		} catch (FileNotFoundException e) {
			System.out.println("FileNotFoundException例外が発生");
		}
		System.out.println("プログラム終了");
	}

	// 検査例外のFileNotFoundException例外をスロー
	public static void readFile(String fileName) throws FileNotFoundException {
		System.out.println("ファイルの読み込み開始");
		FileReader fr = new FileReader(fileName);
		System.out.println(fileName + "の読み込み完了");
	}
}