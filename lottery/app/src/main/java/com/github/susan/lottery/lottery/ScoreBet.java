package com.github.susan.lottery.lottery;

import java.util.Map;

/**
 * Created by susan on 2018/6/22.
 */

public class ScoreBet extends SingleBet {


    public ScoreBet(Map<String, Double> scoreMap) {
        super(GameType.SCORE, 0, 0, 0, scoreMap);
    }

    private Result classifyScore(String rate) {
        String[] rateArray = rate.split(":");
        int front = Integer.parseInt(rateArray[0]);
        int after = Integer.parseInt(rateArray[1]);
        if (front > after) {
            return Result.SUCCESS;
        } else if (front == after) {
            return Result.DRAW;
        } else {
            return Result.FAIL;
        }
    }

    @Override
    void calculate(double oddSuccess, double oddDraw, double oddFail, Map<String, Double> scoreMap) {
        for (String score : scoreMap.keySet()) {
            Result result = classifyScore(score);
            if (result.equals(Result.SUCCESS)) {
                oddSuccess += scoreMap.get(score);
            } else if (result.equals(Result.DRAW)) {
                oddDraw += scoreMap.get(score);
            } else {
                oddFail += scoreMap.get(score);
            }
        }

        after(oddSuccess,oddDraw,oddFail);
    }




    private enum Result {
        SUCCESS,
        FAIL,
        DRAW
    }
}
