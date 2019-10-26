package pr_5.pr5_1;

public class Pr_5_9_1 {
	public static void main(String[] args) {
		String[][] areaMap = new String[5][10];

		for (int i = 0; i < areaMap.length; i++) {
			for (int j = 0; j < areaMap[i].length; j++) {
				if (areaMap[i][j] == null) {
					if (i % 2 == 0 && j % 2 == 0) {
						areaMap[i][j] = "+";
					} else {
						areaMap[i][j] = ".";
					}
				}
				System.out.print(areaMap[i][j]);
			}
			System.out.println("");
		}
	}

}
