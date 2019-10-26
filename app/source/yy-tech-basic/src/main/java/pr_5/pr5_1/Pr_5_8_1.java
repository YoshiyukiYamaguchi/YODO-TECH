package pr_5.pr5_1;

public class Pr_5_8_1 {
	public static void main(String[] args) {
		String[][] areaMap = new String[5][10];
		// この下で、2次元配列の初期値を設定する
		areaMap[0][0] = "+";
		areaMap[0][9] = "+";
		areaMap[4][0] = "+";
		areaMap[4][9] = "+";
		for (int i = 0; i < areaMap.length; i++) {
			for (int j = 0; j < areaMap[i].length; j++) {
				if (areaMap[i][j] == null) {
					areaMap[i][j] = ".";
				}
				System.out.print(areaMap[i][j]);
			}
			System.out.println("");
		}
	}

}
