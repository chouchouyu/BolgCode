package com.github.susan.lottery.lottery;

import org.junit.Test;

import java.util.Arrays;

import static org.junit.Assert.*;

/**
 * Example local unit test, which will execute on the development machine (host).
 *
 * @see <a href="http://d.android.com/tools/testing">Testing documentation</a>
 */
public class ExampleUnitTest {


    @Test
    public void addition_isCorrect() throws Exception {
        double[] news = { 1.5, 3.2, 4.7, 52, 0.77, 0.28, -0.9, 11, 2, 6 };
        Arrays.sort(news);
        System.out.print("!!!!!!!!"+news.toString());
        assertEquals(4, 2 + 2);
    }

}