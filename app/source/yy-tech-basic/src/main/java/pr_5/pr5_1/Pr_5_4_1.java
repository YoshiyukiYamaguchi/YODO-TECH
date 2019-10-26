package pr_5.pr5_1;

public class Pr_5_4_1 {
	public static void main(String[] args) {
		String[][] array = { { "勇者", "忍者" }, { "武士", "戦士" }, { "僧侶", "魔法使い" } };

		// この下で、forループで、arrayを出力してみよう
		for (int i = 0; i < array.length; i++) {
			for (int j = 0; j < array[i].length; j++) {
				System.out.print(array[i][j]);
				System.out.println();

			}
		}
	}
}
