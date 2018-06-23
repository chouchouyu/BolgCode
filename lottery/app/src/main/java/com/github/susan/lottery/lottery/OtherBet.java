package com.github.susan.lottery.lottery;

import java.util.Map;

/**
 * Created by susan on 2018/6/23.
 */

public abstract class OtherBet extends SingleBet {

    public OtherBet(GameType gameType, Map<String, Double> scoreMap, int concedePoint) {
        super(gameType, 0, 0, 0, scoreMap, concedePoint);
    }

    @Override
    void calculate(double oddSuccess, double oddDraw, double oddFail, Map<String, Double> scoreMap, int concedePoint) {
        for (String score : scoreMap.keySet()) {
            Result result = classifyScore(score, concedePoint);
            double rawRate = scoreMap.get(score);
            if (result.equals(Result.SUCCESS)) {
                oddSuccess += rawRate;
            } else if (result.equals(Result.DRAW)) {
                oddDraw += rawRate;
            } else {
                oddFail += rawRate;
            }
        }

        after(oddSuccess, oddDraw, oddFail, getoncedeMap());
    }


    abstract Result classifyScore(String score, int concedePoint);

    abstract Map<String, Rate> getoncedeMap();

}
