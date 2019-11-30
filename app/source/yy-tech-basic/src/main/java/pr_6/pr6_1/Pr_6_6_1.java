package pr_6.pr6_1;

public class Pr_6_6_1 {
	public static void main(String[] args) {
		String[] enemies = { "スライム", "モンスター", "ドラゴン" };

		String player = null;
		for (String enemy : enemies) {
			player = "勇者";
			System.out.println(player + "は" + enemy + "を攻撃した");
		}

		System.out.println(player + "はすべての敵を倒した");
	}

}
