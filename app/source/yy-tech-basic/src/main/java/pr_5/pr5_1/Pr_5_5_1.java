package pr_5.pr5_1;

public class Pr_5_5_1 {
	public static void main(String[] args) {

		// この下で、配列を作成しよう
		int[][] array = new int[2][3];

		for (int[] item : array) {
			for (int num : item) {
				System.out.print(num);
			}
			System.out.println("");
		}
	}

}
