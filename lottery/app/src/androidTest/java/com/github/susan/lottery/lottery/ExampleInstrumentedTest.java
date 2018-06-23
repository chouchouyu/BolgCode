package com.github.susan.lottery.lottery;

import android.content.Context;
import android.support.test.InstrumentationRegistry;
import android.support.test.runner.AndroidJUnit4;
import android.util.Log;

import org.junit.Test;
import org.junit.runner.RunWith;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import static com.github.susan.lottery.lottery.Utils.TAG;
import static org.junit.Assert.*;

/**
 * Instrumented test, which will execute on an Android device.
 *
 * @see <a href="http://d.android.com/tools/testing">Testing documentation</a>
 */
@RunWith(AndroidJUnit4.class)
public class ExampleInstrumentedTest {
    @Test
    public void useAppContext() throws Exception {
        // Context of the app under test.
        Context appContext = InstrumentationRegistry.getTargetContext();

        assertEquals("com.github.susan.lottery.lottery", appContext.getPackageName());
    }

    Map<String, List<SingleBet>> oneGame = new HashMap<>();

    private void print(SingleBet aGame) {
        List<SingleBet> gameList = new ArrayList<>();
        gameList.add(aGame);
        oneGame.put("尼日利亚 vs 冰岛", gameList);
        Log.w(TAG,oneGame.toString());
    }


    @Test
    public void addition_isCorrect() throws Exception {
//        initVictoryBet();
//        initScoreBet();
//        initHalfGameBet();
        initVictoryBet2();
        initScoreBet2();
        assertEquals(4, 2 + 2);
    }

    @Test
    public void initVictoryBet() {
        VictoryBet aGame = new VictoryBet(2.60, 3.00, 2.27,0);
        print(aGame);
    }

    @Test
    public void initVictoryBet2() {
        VictoryBet aGame = new VictoryBet(6.25, 4.15, 1.32,-1);
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
        ScoreBet aGame = new ScoreBet(scoreMap,0);
        print(aGame);
    }

    @Test
    public void initScoreBet2() {
        Map<String, Double> scoreMap = new HashMap<>();
        scoreMap.put("1:0", 5.8);
        scoreMap.put("0:0", 6.5);
        scoreMap.put("0:1", 4.8);
        ScoreBet aGame = new ScoreBet(scoreMap,2);
        print(aGame);
    }


    /**
     * 胜/胜 4.2
     * 胜/负 25
     * 平/平 4
     */

    @Test
    public void initHalfGameBet() {
        Map<String, Double> scoreMap = new HashMap<>();
        scoreMap.put("胜/胜", 4.2);
        scoreMap.put("胜/负", Double.valueOf(25));
        scoreMap.put("平/平", Double.valueOf(4));
        HalfGameBet aGame = new HalfGameBet(scoreMap);
        print(aGame);
    }
}
