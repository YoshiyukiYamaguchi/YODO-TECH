package pr_7.pr7_1;

import java.util.ArrayList;

public class Pr_7_4_1 {
	public static void main(String[] args) {
		ArrayList<Player> team = new ArrayList<Player>();
		team.add(new Player("勇者"));
		team.add(new Player("戦士"));
		team.add(new Player("魔法使い"));

		for (Player person : team) {
			person.attack("スライム");
		}
	}
}

class Player {
	private String myName;

	public Player(String name) {
		myName = name;
	}

	public void attack(String enemy) {
		System.out.println(myName + "は" + enemy + "を攻撃した");
	}

}