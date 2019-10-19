package pr_2.pr2_1;

public class Pr_2_7_1 {
	public static void main(String[] args) {
		double rand = (Math.random() * 10) + 1;
		int number = (int) rand;
		System.out.println("あなたの順位は" + number + "位です");

		//　ここにifを追加する
		if (number > 1 && number < 6) {
			System.out.println("あと少し");
		} else {
		}

	}

}
