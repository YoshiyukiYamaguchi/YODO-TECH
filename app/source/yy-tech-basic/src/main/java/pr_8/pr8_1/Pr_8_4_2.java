package pr_8.pr8_1;

public class Pr_8_4_2 {
	public static void main(String[] args) {
		Hello player = new Hello();
		player.sayHello();
	}
}

class Greeting {
	public void sayHello() {
		System.out.println("greeting paiza");
	}
}

class Hello extends Greeting {
	public void sayHello() {
		System.out.println("hello paiza");
	}

}
