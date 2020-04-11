package cmn;

/**
 * 入力値チェックユーティリティ
 * 
 * @author yocchi
 *
 */
public class ValidateUtil {

    /**
     * 計算フラグ
     */
    public static boolean flg = false;

    /**
     * 計算実行判定
     * <p>
     * 入力値を判定処理を呼出しメッセージを返却する。
     * </p>
     * 
     * @param input 計算種別
     * @return message 返却メッセージ
     */
    public static String isAvailable(String input) {
        return isNumber(input) ? isCalcable(input) ? CalcConstants.MESSAGE_SUCCESS : CalcConstants.MESSAGE_FAIL_CALC
                : CalcConstants.MESSAGE_FAIL;
    }

    /**
     * 計算値判定
     * <p>
     * 計算種別と計算値を判定し、0除算が発生する場合、エラーメッセージを返却する。
     * </p>
     * 
     * @param input   計算種別
     * @param operand 計算値
     * @return 返却メッセージ
     */
    public static String isAvailable(String input, String operand) {
        return isNumber(input) ? isCalcable(input,operand) ? CalcConstants.MESSAGE_SUCCESS : CalcConstants.MESSAGE_FAIL_CALC
                : CalcConstants.MESSAGE_FAIL;
    }

    /**
     * 入力値判定 メソッド
     * <p>
     * 入力値が数値か判定する。
     * </p>
     * 
     * @param input
     * @return 入力値判定
     */
    private static boolean isNumber(String input) {
        // null値チェック
        if (input == null) {
            flg = false;
            return flg;
        }
        // 一文字ずつ先頭から確認する。for文は文字数分繰り返す
        for (int i = 0; i < input.length(); i++) {
            // i文字めの文字についてCharacter.isDigitメソッドで判定する
            if (Character.isDigit(input.charAt(i))) {
                // 数字の場合は次の文字の判定へ
                continue;
            }
            flg = false;
            return flg;
        }
        flg = true;
        return flg;
    }

    /**
     * 入力値判定 メソッド
     * <p>
     * 入力値が計算方法の値か判定する。
     * </p>
     * 
     * @param input
     * @return 計算可否判定
     */
    private static boolean isCalcable(String input) {
        int calcKind = Integer.parseInt(input);
        if (calcKind > CalcConstants.calcMap.size() || calcKind < 1) {
            flg = false;
            return flg;
        }
        flg = true;
        return flg;
    }

    /**
     * 入力値判定 メソッド
     * <p>
     * 入力された計算種別が 4:割り算 かつ 計算値が0の場合、<br>
     * 0除算が発生するため、計算不能判定を返す。
     * </p>
     * 
     * @param input
     * @return 計算可否判定
     */
    private static boolean isCalcable(String input, String operand) {
        if (input == CalcConstants.DIVIDE_KEY && operand == "0") {
            flg = false;
            return flg;
        }
        flg = true;
        return flg;
    }

}
