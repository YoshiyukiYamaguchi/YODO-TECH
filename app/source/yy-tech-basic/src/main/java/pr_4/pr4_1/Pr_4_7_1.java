package pr_4.pr4_1;

public class Pr_4_7_1 {
	public static void main(String[] args) {
		String team_str = "勇者,戦士,忍者,魔法使い";
		// ここに文字列を分割するコードを記述する
		String[] team_array = team_str.split(",");
		for (String s : team_array) {
			System.out.println(s);
		}
	}

}
