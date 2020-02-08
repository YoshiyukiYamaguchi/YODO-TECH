package pr_7.pr7_1;

public class Pr_7_3_2 {
	public static void main(String[] args) {
		Greeting paiza = new Greeting("java");
		paiza.sayHello();
	}
}

class Greeting {
	// この下に、メンバー変数とコンストラクタを追加する
	private String myName;

	public Greeting(String name) {
		myName = name;
	}

	public void sayHello() {
		System.out.println("hello " + myName);
	}

}
