package com.github.susan.lottery.lottery;

import java.util.Map;

/**
 * Created by susan on 2018/6/22.
 */

public class VictoryBet extends SingleBet {


    public VictoryBet(double oddSuccess, double oddsDraw, double oddsFail) {
        super(GameType.VICTORY, oddSuccess, oddsDraw, oddsFail,null);
    }


    @Override
    void calculate(double oddSuccess, double oddDraw, double oddFail, Map<String, Double> scoreMap) {

    }
}
