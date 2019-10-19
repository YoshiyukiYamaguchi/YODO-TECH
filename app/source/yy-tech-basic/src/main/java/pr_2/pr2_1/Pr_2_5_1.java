package pr_2.pr2_1;

public class Pr_2_5_1 {
	public static void main(String[] args) {
		int hit = (int) (Math.random() * 10 + 1);
		if (hit < 6) {
			System.out.println("スライムに" + hit + "のダメージを与えた");
		} else {
			System.out.println("クリティカルヒット!スライムに、100のダメージを与えた!!");
		}

		int add = (int) (Math.random() * 2 + 1); // この行を修正して1から2のサイコロになるようにする
		System.out.println("追加のサイコロは、" + add);
		if (add == 1) { // この行の条件式を修正
			System.out.println("追加攻撃!スライムに、10のダメージを与えた!!!");
		} else {
			System.out.println("追加攻撃に失敗!");
		}
	}

}
