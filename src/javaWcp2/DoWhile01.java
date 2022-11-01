package javaWcp2;

public class DoWhile01 {
	public static void main(String[] args) {
		int number = 1;
		// do~while文
		do {
			// numberにnumber * 2 を代入して、numberを出力
			number *= 2;
			System.out.println("DoWhile01 = " + number);
			// numberが50未満の場合、ブロックの処理をループする
		} while (number < 50);
	}
}