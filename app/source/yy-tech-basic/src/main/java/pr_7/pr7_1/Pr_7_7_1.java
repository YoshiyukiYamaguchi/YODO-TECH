package pr_7.pr7_1;

public class Pr_7_7_1 {
	public static void main(String[] args) {
		Greeting paiza = new Greeting("paiza");
		paiza.sayHello();
	}
}

class Greeting {
	private String myName;

	public Greeting(String name) {
		myName = name;
	}

	public void sayHello() {
		System.out.println("hello " + myName);
	}

}
