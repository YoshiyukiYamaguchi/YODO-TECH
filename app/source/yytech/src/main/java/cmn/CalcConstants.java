package cmn;

import java.util.LinkedHashMap;
import java.util.Map;

/**
 * 定数定義クラス
 * @author yocchi
 *
 */
public class CalcConstants {
    
    // 計算種別
    public static final String ADD_STR = "足し算";
    public static final String DISTRACT_STR = "引き算";
    public static final String MULTIPLE_STR = "かけ算";
    public static final String DIVIDE_STR = "割り算";
    
    // キー
    public static final String ADD_KEY = "1";
    public static final String DISTRACT_KEY = "2";
    public static final String MULTIPLE_KEY = "3";
    public static final String DIVIDE_KEY = "4";
    
    // エラーメッセージ
    public static final String MESSAGE_SUCCESS = "計算処理を開始します。";
    public static final String MESSAGE_FAIL = "入力値が不正です。数値を入力してください。";
    public static final String MESSAGE_FAIL_CALC = "入力値が不正です。計算方法以外の数値が入力されました。";
    
    // アプリメッセージ
    public static final String CONST_SPACE_THREE = "   ";
    public static final String INPUT_LEFT_OPERAND = "左辺を入力してください。";
    public static final String INPUT_RIGHT_OPERAND = "右辺を入力してください。";
    
    // 計算方法種別連想配列
    public static Map<String, String> calcMap;
    
    static {
        calcMap = new LinkedHashMap<String,String>();
        calcMap.put(ADD_KEY, ADD_STR);
        calcMap.put(DISTRACT_KEY, DISTRACT_STR);
        calcMap.put(MULTIPLE_KEY, MULTIPLE_STR);
        calcMap.put(DIVIDE_KEY, DIVIDE_STR);
    }

}
