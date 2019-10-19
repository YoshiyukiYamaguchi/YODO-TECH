package pr_2.pr2_1;

public class Pr_2_1_3 {
	public static void main(String[] args) {
		int number = ((int) (Math.random() * 3 + 1)) * 100;
		System.out.println("あなたの得点は" + number + "ポイントです");
		// ここにif文を追加する
		if (number == 300) {
			System.out.println("おめでとう！");
		}
	}

}
