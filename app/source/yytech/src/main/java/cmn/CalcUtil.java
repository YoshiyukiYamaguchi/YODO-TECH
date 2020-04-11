package cmn;

/**
 * 計算用ユーティリティ
 * 
 * @author yocchi
 *
 */
public class CalcUtil {

    /**
     * 計算前入力値ルール出力
     */
    public static void beforeCalc() {
        System.out.println("計算方法を選んでください");
        System.out.print("1 :" + CalcConstants.ADD_STR + CalcConstants.CONST_SPACE_THREE);
        System.out.print("2 :" + CalcConstants.DISTRACT_STR + CalcConstants.CONST_SPACE_THREE);
        System.out.print("3 :" + CalcConstants.MULTIPLE_STR + CalcConstants.CONST_SPACE_THREE);
        System.out.println("4 :" + CalcConstants.DIVIDE_STR + CalcConstants.CONST_SPACE_THREE);
        System.out.print("入力値 → ");
    }

    /**
     * 計算処理実行メソッド
     * 
     * @param input
     * @throws Exception
     */
    public static void execute(String input, String operandL, String operandR) throws Exception {
        int operandNumL = Integer.parseInt(operandL);
        int operandNumR = Integer.parseInt(operandR);
        switch (input) {
        case CalcConstants.ADD_KEY:
            add(operandNumL, operandNumR);
            break;
        case CalcConstants.DISTRACT_KEY:
            subtract(operandNumL, operandNumR);
            break;
        case CalcConstants.MULTIPLE_KEY:
            multipul(operandNumL, operandNumR);
            break;
        case CalcConstants.DIVIDE_KEY:
            divide(operandNumL, operandNumR);
            break;
        default:
            throw new RuntimeException();
        }
    }

    /**
     * 足し算処理
     * 
     * @param i
     * @param i2
     */
    private static void add(int operandL, int operandR) {
        System.out.println("足し算の結果： " + (operandL + operandR));
    }

    /**
     * 引き算処理
     * 
     * @param i
     * @param i2
     */
    private static void subtract(int i, int i2) {
        System.out.println("引き算の結果： " + (i - i2));
    }

    /**
     * かけ算処理
     * 
     * @param i
     * @param i2
     */
    private static void multipul(int i, int i2) {
        System.out.println("かけ算の結果： " + (i * i2));
    }

    /**
     * 割り算処理
     * 
     * @param i
     * @param i2
     */
    private static void divide(int i, int i2) {
        System.out.println("割り算の結果： " + (i / i2));
        if (i % i2 > 0)
            System.out.println("余りは：" + (i % i2));
    }

}
