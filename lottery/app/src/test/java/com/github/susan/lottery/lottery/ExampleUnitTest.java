package com.github.susan.lottery.lottery;

import org.junit.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import static org.junit.Assert.*;

/**
 * Example local unit test, which will execute on the development machine (host).
 *
 * @see <a href="http://d.android.com/tools/testing">Testing documentation</a>
 */
public class ExampleUnitTest {

    Map<String, List<SingleBet>> oneGame = new HashMap<>();

    private void print(SingleBet aGame){
        List<SingleBet> gameList = new ArrayList<>();
        gameList.add(aGame);
        oneGame.put("尼日利亚 vs 冰岛", gameList);
        System.out.print(oneGame.toString());
    }


    @Test
    public void addition_isCorrect() throws Exception {
//        initVictoryBet();
//        initScoreBet();
        assertEquals(4, 2 + 2);
    }
    @Test
    public void initVictoryBet() {
        VictoryBet aGame = new VictoryBet(2.60, 3.00, 2.27);
        print(aGame);
    }


    /**
     * 1:0 5.8
     * 0:0 6.5
     * 0:1 4.8
     */
    @Test
    public void initScoreBet() {
        Map<String, Double> scoreMap = new HashMap<>();
        scoreMap.put("1:0", 5.8);
        scoreMap.put("0:0", 6.5);
        scoreMap.put("0:1", 4.8);
        ScoreBet aGame = new ScoreBet(scoreMap);
        print(aGame);
    }
}