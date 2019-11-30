package pr_3.pr3_1;

import java.util.Scanner;

public class Pr_3_9_2 {
	public static void main(String[] args) {
		int seireki, shouwa;
		Scanner sc = new Scanner(System.in);
		int start = sc.nextInt();
		int term = sc.nextInt();

		int stop = start + term - 1;
		for (seireki = start; seireki <= stop; seireki++) {
			System.out.print("西暦" + seireki + "年は");
			shouwa = seireki - 1925;
			System.out.println("昭和" + shouwa + "年です");
		}
	}

}
