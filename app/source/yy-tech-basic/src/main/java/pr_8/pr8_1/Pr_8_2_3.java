package pr_8.pr8_1;

public class Pr_8_2_3 {
	public static void main(String[] args) {
		Hello player = new Hello();
		player.sayHello();
	}
}

class Greeting {
	public String msg;
	public String target;

	public Greeting() {
		msg = "hello";
		target = "paiza";
	}
}

class Hello extends Greeting {
	public void sayHello() {
		System.out.println(msg + " " + target);
	}
}
