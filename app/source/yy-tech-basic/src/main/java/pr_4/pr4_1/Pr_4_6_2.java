package pr_4.pr4_1;

import java.util.ArrayList;

public class Pr_4_6_2 {
	public static void main(String[] args) {
		ArrayList<String> weapon = new ArrayList<String>();
		weapon.add("木の棒");
		weapon.add("鉄の剣");
		weapon.add("サビた剣");
		// ここに、要素を上書きするコードを記述する
		weapon.set(2, "石斧");
		for (String item : weapon) {
			System.out.println(item);
		}
	}

}
