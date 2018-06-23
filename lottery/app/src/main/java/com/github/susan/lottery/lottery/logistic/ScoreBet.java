package com.github.susan.lottery.lottery.logistic;

import com.github.susan.lottery.lottery.logistic.GameType;
import com.github.susan.lottery.lottery.logistic.OtherBet;
import com.github.susan.lottery.lottery.logistic.Result;
import com.github.susan.lottery.lottery.logistic.Utils;

import java.util.Map;

import static com.github.susan.lottery.lottery.logistic.Utils.COLON;

/**
 * Created by susan on 2018/6/22.
 */

public class ScoreBet extends OtherBet {


    public ScoreBet(Map<String, Double> scoreMap, int concedePoint) {
        super(GameType.SCORE, scoreMap, concedePoint);
    }

    @Override
    Rate classifyScore(String rate, int concedePoint) {
        String[] rateArray = rate.split(COLON);
        int front = Integer.parseInt(rateArray[0]);
        int after = Integer.parseInt(rateArray[1]);
        front += concedePoint;
        if (front < 0) {
            front = 0;
        }
        if (after < 0) {
            after = 0;
        }

        Result result;
        if (front > after) {
            result = Result.SUCCESS;
        } else if (front == after) {
            result = Result.DRAW;
        } else {
            result = Result.FAIL;
        }
        return Utils.Create(front, after, result);
    }


}
