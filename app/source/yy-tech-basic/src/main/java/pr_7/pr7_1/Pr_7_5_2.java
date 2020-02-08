package pr_7.pr7_1;

public class Pr_7_5_2 {
	public static void main(String[] args) {
		Gakusei yamada = new Gakusei(70, 43);
		System.out.println("合計は" + yamada.sum() + "点です");
	}
}

class Gakusei {
	private int myKokugo;
	private int mySansu;

	public Gakusei(int kokugo, int sansu) {
		myKokugo = kokugo;
		mySansu = sansu;
	}

	// この下に、合計得点を戻り値として返すsumメソッドを記述する
	public int sum() {
		return myKokugo + mySansu;
	}

}
