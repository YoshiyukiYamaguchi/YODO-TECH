package pr_5.pr5_1;

public class Pr_5_2_1 {
	public static void main(String[] args) {
		String[] item1 = { "木の棒", "こん棒" };
		String[] item2 = { "おにぎり", "おにぎり" };
		String[] item3 = { "毒消し", "薬草" };

		// item1 ~ 3を、basket配列に代入してください。
		String[][] basket = { item1, item2, item3 };
		System.out.println(basket[0][0]);
		System.out.println(basket[0][1]);
		System.out.println(basket[1][0]);
		System.out.println(basket[1][1]);
		System.out.println(basket[2][0]);
		System.out.println(basket[2][1]);
	}

}
