package pr_4.pr4_1;

import java.util.Scanner;

public class Pr_4_8_2 {
	public static void main(String[] args) {
		final String temp = "が";
		final String temp2 = "匹現れた";
		int idx1 = 5;
		int ii = 1;

		Scanner sc = new Scanner(System.in);
		String line = sc.nextLine();

		String[][] array = new String[idx1][2];
		array[0] = line.split(",");

		for(int i = 0; i < array.length; i++) {
			for(int j = 0; j < array[i].length; j++) {
				System.out.println(array[i][j] + temp + array[i][ii] + temp2);
			}
		}
	}
}
