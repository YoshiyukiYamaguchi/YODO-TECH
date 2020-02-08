package pr_7.pr7_1;

public class Pr_7_5_1 {
	public static void main(String[] args) {
		// この下に、インスタンスを実体化し、メソッド呼び出しを記述する
		Gakusei gakusei1 = new Gakusei(70, 43);
		System.out.println("合計は" + gakusei1.sum() + "点です");
	}
}

class Gakusei {
	private int myKokugo;
	private int mySansu;

	public Gakusei(int kokugo, int sansu) {
		myKokugo = kokugo;
		mySansu = sansu;
	}

	public int sum() {
		return myKokugo + mySansu;
	}

}
