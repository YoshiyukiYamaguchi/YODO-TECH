package pr_4.pr4_1;

import java.util.Scanner;

public class Pr_4_9_1 {
	public static void main(String[] args) {
		// 標準入力から1行取得
		Scanner sc = new Scanner(System.in);
		String line = sc.nextLine();

		// カンマで分割して、配列に代入
		String[] omikuji = line.split(",");

		// 配列の要素をランダムに選ぶ
		double rand = Math.random() * omikuji.length;
		int num = (int) rand;

		// ランダムに選んだ配列の要素を出力
		System.out.println(omikuji[num]);
	}

}
