package pr_4.pr4_1;

import java.util.ArrayList;

public class Pr_4_6_3 {
	public static void main(String[] args) {
		ArrayList<String> weapon = new ArrayList<String>();
		weapon.add("木の棒");
		weapon.add("鉄の棒");
		weapon.add("鉄の剣");
		weapon.add("銅の剣");
		// ここに、要素を削除するコードを記述する
		for (String item : weapon) {
			System.out.println(item);
		}
	}

}
