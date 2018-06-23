package com.github.susan.lottery.lottery;

import android.text.TextUtils;

import java.util.Map;

import static com.github.susan.lottery.lottery.Utils.LOST;
import static com.github.susan.lottery.lottery.Utils.SLASH;
import static com.github.susan.lottery.lottery.Utils.WIN;

/**
 * Created by susan on 2018/6/23.
 */
public class HalfGameBet extends OtherBet {

    public HalfGameBet(Map<String, Double> scoreMap) {
        super(GameType.HALFGAME, scoreMap,0);
    }


    @Override
    Result classifyScore(String rate, int concedePoint) {
        String[] rateArray = rate.split(SLASH);
//        String front = rateArray[0];
        String after = rateArray[1];
        if (TextUtils.equals(after, WIN)) {
            return Result.SUCCESS;
        } else if (TextUtils.equals(after, LOST)) {
            return Result.DRAW;
        } else {
            return Result.FAIL;
        }
    }

}
