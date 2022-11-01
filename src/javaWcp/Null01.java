package javaWcp;

public class Null01 {
	public static void main(String[] args) {
		String string1;
		// あいうの文字数を出力
		string1 = "あいう";
		System.out.println(string1 + "の文字数 : " + string1.length());
		// ""(空文字）の文字数を出力
		string1 = "";
		System.out.println(string1 + "の文字数 : " + string1.length());
		// nullの変数を参照するとNullPointerExceptionのエラー
		string1 = null;
		System.out.println(string1 + "の文字数 : " + string1.length());
	}
}

 Integer integer1 = 5; // オートボクシング
 Integer integer2 = Integer.valueOf(5); // 明示的なボクシング
 int int1 = integer1; // アンボクシング
 int int2 = integer2.intValue(); // 明示的なアンボクシング
 
 int[] array1 = new int[3]; // 配列の宣言と生成
 array[0] = 60; // インデックス番号「０」を指定して１番目の要素にデータを代入
 array[2] = 20; // ２番目の要素より先に３番目の要素にデータを代入
 array[1] = 20; // ３番目と同じ値を２番目の要素に代入
 int int2 = array1[2]; // インデックス番号「２」を指定して３番目の要素を取得
 
 int array2[] = null; // []は変数名の後ろでも可
 
 // 宣言と同時に初期化する形式２つ
 int[] array3 = new int[] { 10, 20, 50 };
 int[] array4 = { 10, 20, 50 };