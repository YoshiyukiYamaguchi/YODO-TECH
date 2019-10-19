package pr_4.pr4_1;

import java.util.ArrayList;

public class Pr_4_6_1 {
	public static void main(String[] args) {
		ArrayList<String> weapon = new ArrayList<String>();
		// ここに、要素を追加するコードを記述する
		weapon.add("木の棒");
		weapon.add("鉄の剣");
		weapon.add("石斧");
		for (String item : weapon) {
			System.out.println(item);
		}
	}

}
