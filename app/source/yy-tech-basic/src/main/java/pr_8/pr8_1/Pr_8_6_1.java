package pr_8.pr8_1;

public class Pr_8_6_1 {
	public static void main(String[] args) {
		Player hero = new Player("勇者");
		Player wizard = new Player("魔法使い");
		Warrior warrior = new Warrior("戦士");
		Player[] party = { hero, wizard, warrior };

		for (Player member : party) {
			member.attack("スライム");
		}
	}
}

class Player {
	public String myName;

	public Player(String name) {
		myName = name;
	}

	public void attack(String enemy) {
		System.out.println(myName + "は" + enemy + "を攻撃した");
	}
}

class Warrior extends Player {
	public Warrior(String name) {
		super(name);
	}

	public void attack(String enemy) {
		System.out.println(myName + "は" + enemy + "を猛攻撃した");
	}
}
