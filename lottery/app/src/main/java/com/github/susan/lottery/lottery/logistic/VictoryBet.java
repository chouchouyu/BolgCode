package com.github.susan.lottery.lottery.logistic;


import java.util.LinkedHashMap;
import java.util.Map;

/**
 * Created by susan on 2018/6/22.
 */

public class VictoryBet extends SingleBet {


    public VictoryBet(double oddSuccess, double oddsDraw, double oddsFail, int concedePoint) {
        super(GameType.VICTORY, oddSuccess, oddsDraw, oddsFail, null, concedePoint);
    }


    @Override
    void calculate(double oddSuccess, double oddDraw, double oddFail, LinkedHashMap<String, Double> scoreMap, int concedePoint) {
        after(oddSuccess,oddDraw,oddFail,null);
    }
}
