package pr_7.pr7_1;

public class Pr_7_8_1 {
	public static void main(String[] args) {
		// この下に、合計得点を戻り値として返すsumメソッドを記述する
		// 国語 = 70点、算数 = 43点
		int total = Gakusei.sum(70, 43);
		System.out.println("合計は" + total + "点です。");
	}
}

class Gakusei {
	// この下に、合計得点を戻り値として返すsumメソッドを記述する
	public static int sum(int myKokugo, int mySansu) {
		return (int) (myKokugo + mySansu);
	}

}
