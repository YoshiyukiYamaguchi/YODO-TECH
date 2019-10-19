package pr_2.pr2_1;

public class Pr_2_4_1 {
	public static void main(String[] args) {
		int omikuji = (int) (Math.random() * 100 + 1); // randomメソッドについては次のチャプターで説明します
		if (omikuji > 30) {
			System.out.println("omikujiの中身は" + omikuji + "なので大吉");
		} else {
			System.out.println("omikujiの中身は" + omikuji + "なので大凶");
		}
	}

}
