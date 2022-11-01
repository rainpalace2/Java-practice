package javaWcp;

public class Chapter07 {
	public static void main(String[] args) {
		int distance = 12;
		// 距離が５キロ以下
		if (distance <= 5) {
			System.out.println("とても近いです");
			// 距離が５キロより長く１０キロ以下
		} else if (distance <= 10) {
			System.out.println("近いです");
			// 距離が１０キロより長く１５キロ以下
		} else if (distance <= 15) {
			System.out.println("遠いです");
			// 距離が１５キロより長い
		} else {
			System.out.println("とても遠いです");
		}
	}
}