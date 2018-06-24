package com.github.susan.lottery.lottery.logistic;

import android.text.TextUtils;

import java.util.Map;

import static com.github.susan.lottery.lottery.logistic.Utils.LOST;
import static com.github.susan.lottery.lottery.logistic.Utils.SLASH;
import static com.github.susan.lottery.lottery.logistic.Utils.WIN;

/**
 * Created by susan on 2018/6/23.
 */
public class HalfGameBet extends OtherBet {

    public HalfGameBet(Map<String, Double> scoreMap) {
        super(GameType.HALFGAME, scoreMap, 0);
    }


    @Override
    Rate classifyScore(String rate, int concedePoint) {
        String[] rateArray = rate.split(SLASH);
        String front = rateArray[0];
        String after = rateArray[1];

        Result result;
        if (TextUtils.equals(after, WIN)) {
            result = Result.SUCCESS;
        } else if (TextUtils.equals(after, LOST)) {
            result = Result.FAIL;
        } else {
            result = Result.DRAW;
        }
        return Utils.Create(front, after, result);
    }
}
