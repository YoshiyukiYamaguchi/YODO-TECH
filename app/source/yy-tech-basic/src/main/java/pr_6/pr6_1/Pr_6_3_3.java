package pr_6.pr6_1;

public class Pr_6_3_3 {
	public static void main(String[] args) {
		for (int num = 1; num <= 9; num++) {
			for (int num2 = 1; num2 <= 9; num2++) {
				System.out.print(multi(num, num2));
				if (num2 < 9) {
					System.out.print(", ");
				} else {
					System.out.println("");
				}
			}
		}
	}

	public static int multi(int x, int y) {
		return x * y;
	}

}
