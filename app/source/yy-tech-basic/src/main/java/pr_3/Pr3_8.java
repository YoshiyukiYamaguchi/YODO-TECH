package pr_3;

public class Pr3_8 {
	public static void main(String[] args) {
		int x = 90;
		int y = 10;
		if (x >= 60 && y >= 60)
			System.out.println("合格");
		else if (x + y >= 130)
			System.out.println("合格");
		else if (x + y >= 100 && x >= 90 || y >= 90)
			System.out.println("合格");
		else
			System.out.println("不合格");
	}
}
