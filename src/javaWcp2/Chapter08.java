package javaWcp2;

public class Chapter08 {
	public static void main(String[] args) {
		// while文で1以上5未満の数の2乗を出力
		int number = 1;
		while (number < 5) {
			System.out.println(number * number);
			number++;
		}

		// for文
		int array[] = { 1, 5, 10, 15 };
		for (int i = 0; i < array.length; i++) {
			System.out.println(array[i]);
		}

		// 拡張「for」文で要素の値が偶数の時は、continueでスキップ、奇数の時は出力
		// 変数「array」の要素分ループを行う
		for (int num : array) {
			if (num % 2 == 0) {
				continue;
			}
			System.out.println(num);
		}
	}
}