package pr_3;

public class Pr3_7 {
	public static void main(String[] argus) {
		int i = 70;
		if (i >= 60)
			System.out.println("合格");
		else
			System.out.println("不合格");
		if (i >= 80)
			System.out.println("たいへんよくできました。");
		else if (i >= 60)
			System.out.println("よくできました。");
		else
			System.out.println("ざんねんでした。");
		if (i >= 80)
			System.out.println("優");
		else if (i >= 70)
			System.out.println("良");
		else if (i >= 60)
			System.out.println("可");
		else
			System.out.println("不可");
	}
}
