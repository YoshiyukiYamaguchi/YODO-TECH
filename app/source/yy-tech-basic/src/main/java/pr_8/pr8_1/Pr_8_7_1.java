package pr_8.pr8_1;

public class Pr_8_7_1 {
	public static void main(String[] args) {
		// この下で、sayHelloメソッドを呼び出す。
		sayHello();
		sayHello("java");
	}

	public static void sayHello() {
		System.out.println("hello paiza");
	}

	public static void sayHello(String target) {
		System.out.println("hello " + target);
	}

}
