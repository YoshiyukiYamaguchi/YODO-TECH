package pr_2.pr2_1;

public class Pr_2_2_1 {
	public static void main(String[] args) {
		int number = (int) (Math.random() * 5 + 1);
		System.out.println("あなたの順位は" + number + "位です");
		// ここにif文を追加する
		if (number == 1) {
			System.out.println("おめでとう！");
		} else if (number == 2) {
			System.out.println("あと少し！");
		} else {
			System.out.println("よくがんばったね");
		}
	}

}
