package pr_7.pr7_1;

public class Pr_7_3_1 {
	public static void main(String[] args) {
		// この下に、インスタンスを実体化し、メソッド呼び出しを記述する
		Greeting greeting1 = new Greeting("paiza");
		greeting1.sayHello();
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
