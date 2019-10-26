package pr_5.pr5_1;

import java.util.Scanner;

public class Pr_5_10_1 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int m = sc.nextInt();

		int[][] table = new int[n][m];
		// ここに、標準入力から2次元配列に代入するコードを書く
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < m; j++) {
				table[i][j] = sc.nextInt();
			}
		}
		// 2次元配列から文字を出力
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < m; j++) {
				if (table[i][j] == 1) {
					System.out.print("#");
				} else {
					System.out.print(" ");
				}
			}
			System.out.println("");
		}
	}

}
