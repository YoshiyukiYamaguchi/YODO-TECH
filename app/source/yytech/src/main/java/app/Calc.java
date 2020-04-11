package app;

import java.util.Scanner;

import cmn.CalcConstants;
import cmn.CalcUtil;
import cmn.ValidateUtil;

public class Calc {

    public static void main(String[] args) {
        // 計算方法出力
        CalcUtil.beforeCalc();

        // 入力受け付け
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();

        // 入力値チェック
        System.out.println(ValidateUtil.isAvailable(input));
        try {
            if (ValidateUtil.flg) {
                System.out.println(CalcConstants.INPUT_LEFT_OPERAND);
                String operandL = sc.next();
                System.out.println(ValidateUtil.isAvailable(input, operandL));

                System.out.println(CalcConstants.INPUT_RIGHT_OPERAND);
                String operandR = sc.next();
                System.out.println(ValidateUtil.isAvailable(input, operandR));
                
                if (ValidateUtil.flg) {
                    CalcUtil.execute(input, operandL, operandR);
                }
            }
            System.out.println("計算アプリを終了します。");
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            sc.close();
        }
    }
}
