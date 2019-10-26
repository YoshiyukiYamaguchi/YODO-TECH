package pr_5.pr5_1;

public class Pr_5_4_2 {
	public static void main(String[] args) {
		String[][] array = { { "勇者", "忍者" }, { "武士", "戦士" }, { "僧侶", "魔法使い" } };

		for (String[] team : array) {
			for (String player : team) {
				// この下で、arrayの要素を出力してみよう
				System.out.println(player);
			}
		}
	}

}
