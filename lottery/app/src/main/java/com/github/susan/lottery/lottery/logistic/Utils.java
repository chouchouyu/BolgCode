package com.github.susan.lottery.lottery.logistic;


/**
 * Created by susan on 2018/6/22.
 */

public class Utils {


    public static final int TargetMoney = 100;
    public static final int Price = 2;


    public static final String TAG = "LOTTERY :";
    public static final String WIN = "胜";
    public static final String LOST = "负";

    public static final String COLON = ":";
    public static final String SLASH = "\\/";


    public static SingleBet.Rate Create(int front, int after, Result result) {
        SingleBet.Rate rateObj = new SingleBet.Rate();
        rateObj.setConcedeBet(front + COLON + after);
        rateObj.setResult(result);
        rateObj.setScoreCount(front+after);
        return rateObj;
    }

    public static SingleBet.Rate Create(String front, String after, Result result) {
        SingleBet.Rate rateObj = new SingleBet.Rate();
        rateObj.setConcedeBet(front + COLON + after);
        rateObj.setResult(result);
        return rateObj;
    }
}
