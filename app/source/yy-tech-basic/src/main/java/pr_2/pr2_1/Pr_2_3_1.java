package pr_2.pr2_1;

public class Pr_2_3_1 {
	public static void main(String[] args) {
		int age = (int) (Math.random() * 5 + 18);
		System.out.print(age + "才は");
		// ここにif文を追加する
		if (age < 20) {
			System.out.println("飲酒不可");
		} else {
			System.out.println("飲酒可能");
		}

	}

}
