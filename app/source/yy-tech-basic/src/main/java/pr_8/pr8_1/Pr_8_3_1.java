package pr_8.pr8_1;

public class Pr_8_3_1 {
	public static void main(String[] args) {
		Hello player = new Hello("paiza");
		player.sayHello();
	}
}

class Greeting {
	public String target;

	public Greeting(String name) {
		target = name;
	}
}

class Hello extends Greeting {
	// この下にコンストラクタを定義する
	public Hello(String name) {
		super(name);
	}

	public void sayHello() {
		System.out.println("hello " + target);
	}
}
