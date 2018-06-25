package com.github.susan.lottery.lottery.logistic;


import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

/**
 * Created by susan on 2018/6/23.
 */

public abstract class OtherBet extends SingleBet {

    public OtherBet(GameType gameType, LinkedHashMap<String, Double> scoreMap, int concedePoint) {
        super(gameType, 0, 0, 0, scoreMap, concedePoint);
    }

    private LinkedHashMap<String, Rate> concedeMap;

    @Override
    void calculate(double oddSuccess, double oddDraw, double oddFail, LinkedHashMap<String, Double> scoreMap, int concedePoint) {
        if (concedeMap == null) {
            concedeMap = new LinkedHashMap<>();
        } else {
            concedeMap.clear();
        }

        for (String score : scoreMap.keySet()) {
            Rate rate = classifyScore(score, concedePoint);
            double rawRate = scoreMap.get(score);
            rate.setRawOdds(rawRate);
            rate.setEarnMoney(rawRate);
            rate.setPrecentMoney(rawRate);
            concedeMap.put(score, rate);
            Result result = rate.getResult();
            if (result.equals(Result.SUCCESS)) {
                oddSuccess += rawRate;
            } else if (result.equals(Result.DRAW)) {
                oddDraw += rawRate;
            } else {
                oddFail += rawRate;
            }
        }

        after(oddSuccess, oddDraw, oddFail,concedeMap);
    }


    abstract Rate classifyScore(String score, int concedePoint);


}
