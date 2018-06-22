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

    Map<String, List<Example>> oneGame = new HashMap<>();

    @Test
    public void addition_isCorrect() throws Exception {
        initData();
        assertEquals(4, 2 + 2);
    }

    private void initData() {
        Example aGame = new Example(GameType.NOREMAL, 2.60, 3.00, 2.27);
        List<Example> gameList = new ArrayList<>();
        gameList.add(aGame);
        oneGame.put("尼日利亚 vs 冰岛", gameList);
    }
}