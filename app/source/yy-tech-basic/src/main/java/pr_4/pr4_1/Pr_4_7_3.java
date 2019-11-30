package pr_4.pr4_1;

import java.util.Scanner;

public class Pr_4_7_3 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String url_str = sc.next();
		// ここに文字列を分割するコードを記述する
		String[] url = url_str.split("/");
		for (String s : url) {
			System.out.println(s);
		}
	}

}
