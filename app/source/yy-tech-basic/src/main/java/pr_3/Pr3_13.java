package pr_3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Pr3_13 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(
				new InputStreamReader(System.in));
		int month = Integer.parseInt(br.readLine());
		switch (month) {
		case 1:
			System.out.println("31日です");
			break;
		case 2:
			System.out.println("28日です");
			break;
		case 3:
			System.out.println("31日です");
			break;
		case 4:
			System.out.println("30日です");
			break;
		case 5:
			System.out.println("31日です");
			break;
		case 6:
			System.out.println("30日です");
			break;
		case 7:
			System.out.println("31日です");
			break;
		case 8:
			System.out.println("31日です");
			break;
		case 9:
			System.out.println("30日です");
			break;
		case 10:
			System.out.println("31日です");
			break;
		case 11:
			System.out.println("30日です");
			break;
		case 12:
			System.out.println("31日です");
			break;
		default:
			System.out.println("入力が間違っています");
			break;
		}
	}
}
