package pr_2.pr2_1;

public class Pr_2_9_1 {
	public static void main(String[] args) {
		double rand = (Math.random() * 10) + 1;
		int number = (int) rand;
		System.out.println("あなたの順位は" + number + "位です");

		boolean flag = number <= 3;
		//　ここにifを追加する
		if (flag) {
			System.out.println("入賞おめでとう");
		}

	}

}
