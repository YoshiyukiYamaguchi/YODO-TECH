package pr_1.pr1_1;

public class Pr_1_8_1 {
	public static void main(String[] args) {
		int number = (int) (Math.random() * 10 + 1); // 匹数 1 ～ 10
		System.out.println("体重100キロのスライムが、" + number + "匹あらわれた。");
		// 合計体重 =匹数 × 100
		int y = number * 100;
		System.out.println("スライムの合計体重は、" + y + "キロです。");
	}

}
