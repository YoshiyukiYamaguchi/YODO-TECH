package pr_6.pr6_1;

public class Pr_6_5_1 {
	public static void main(String[] args) {
		String[] team = { "勇者", "戦士", "魔法使い" };
		int enemy_hp = 300;
		for (String person : team) {
			// 以下の行を、敵の体力を減少させるコードに書き換える
			enemy_hp -= attack(person);
			System.out.println("敵のHPは残り" + enemy_hp + "です");
		}
	}

	public static int attack(String player) {
		System.out.println(player + "はスライムを攻撃した");
		int hit = (int) (Math.random() * 10 + 1) * 10;
		System.out.println(hit + "のダメージを与えた");
		return hit;
	}
}
