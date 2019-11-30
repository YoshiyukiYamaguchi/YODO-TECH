package pr_3.pr3_1;

import java.util.Scanner;

public class Pr_3_9_1 {
	public static void main(String[] args) {
		int seireki, shouwa, repeater;

		shouwa = 5;

		Scanner sc = new Scanner(System.in);
		seireki = sc.nextInt();
		repeater = sc.nextInt();

		for (int i = 0; i < repeater; seireki++, shouwa++, i++) {
			System.out.print("西暦" + seireki + "年は");
			System.out.println("昭和" + shouwa + "年です");
		}
	}
}
