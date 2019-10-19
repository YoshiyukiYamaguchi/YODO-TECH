package pr_2.pr2_1;

public class Pr_2_11_1 {
	// 肉の量り売り

	    public static void main(String[] args) {
	        int price = 128;
	        int weight = 300;

	        double i = (double)price;
	        double amount = i / 100 * weight;

	        System.out.println("100グラム" + price + "円の肉、" + weight + "グラムは、" + (int)amount + "円です。");
	    }
}
