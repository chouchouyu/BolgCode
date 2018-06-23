package com.github.susan.lottery.lottery;

import java.util.Map;
import java.util.TreeMap;

import static com.github.susan.lottery.lottery.Utils.COLON;

/**
 * Created by susan on 2018/6/22.
 */

public class ScoreBet extends OtherBet {

    private Map<String, String> concedeMap;


    public ScoreBet(Map<String, Double> scoreMap, int concedePoint) {
        super(GameType.SCORE, scoreMap, concedePoint);
    }

    @Override
    Result classifyScore(String rate, int concedePoint) {
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
//        save(rate, front, after);
        if (front > after) {
            return Result.SUCCESS;
        } else if (front == after) {
            return Result.DRAW;
        } else {
            return Result.FAIL;
        }
    }

    @Override
    Map<String, Rate> getoncedeMap() {
        return null;
    }
//    private void save(String rate, int front, int after,Map<String, String> concedeMap) {
//        if (concedeMap == null) {
//            concedeMap = new TreeMap<>();
//        }
//        concedeMap.put(rate, new StringBuilder().append(front).append(COLON).append(after).toString());
//    }



}
