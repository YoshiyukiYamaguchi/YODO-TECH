package pr_4.pr4_1;

import java.util.Scanner;

public class Pr_4_9_2 {
	public static void main(String[] args) {
		// 標準入力から1行取得
		Scanner sc = new Scanner(System.in);
		String line = sc.next();

		// カンマで分割して、配列に代入
		String[] janken = line.split(",");

		// 配列の要素をランダムに選ぶ
		double rand = Math.random() * janken.length;
		int hand = (int) rand;

		// ランダムに選んだ配列の要素を出力
		System.out.println(janken[hand]);
	}

}