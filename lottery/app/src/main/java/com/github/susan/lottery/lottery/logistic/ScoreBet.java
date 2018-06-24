package com.github.susan.lottery.lottery.logistic;

import android.text.TextUtils;
import android.widget.TextView;

import com.github.susan.lottery.lottery.logistic.GameType;
import com.github.susan.lottery.lottery.logistic.OtherBet;
import com.github.susan.lottery.lottery.logistic.Result;
import com.github.susan.lottery.lottery.logistic.Utils;

import java.util.Map;

import static com.github.susan.lottery.lottery.logistic.Utils.COLON;
import static com.github.susan.lottery.lottery.logistic.Utils.TargetMoney;

/**
 * Created by susan on 2018/6/22.
 */

public class ScoreBet extends OtherBet {


    public ScoreBet(Map<String, Double> scoreMap, int concedePoint) {
        super(GameType.SCORE, scoreMap, concedePoint);
    }

    @Override
    Rate classifyScore(String rate, int concedePoint) {
        Result result = null;
        if (rate.contains("其他")) {
            if (TextUtils.equals(rate, "胜其他")) {
                result = Result.SUCCESS;
            } else if (TextUtils.equals(rate, "平其他")) {
                result = Result.DRAW;
            } else if (TextUtils.equals(rate, "负其他")) {
                result = Result.FAIL;
            }
            SingleBet.Rate rateObj = new SingleBet.Rate();
            rateObj.setConcedeBet(rate);
            rateObj.setResult(result);
            rateObj.setScoreCount(-1);
            return rateObj;
        }
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
