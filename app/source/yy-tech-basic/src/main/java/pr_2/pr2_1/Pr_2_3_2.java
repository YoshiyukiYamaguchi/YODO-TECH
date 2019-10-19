package pr_2.pr2_1;

public class Pr_2_3_2 {
	public static void main(String[] args) {
		int place = (int) (Math.random() * 12 + 1);
		System.out.print(place + "位");
		// ここにif文を追加する
		if (place < 7) {
			System.out.println("入賞");
		} else {
			System.out.println("入賞圏外");
		}
	}

}
