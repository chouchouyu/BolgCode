package com.github.susan;

import org.junit.Test;

/**
 * Example local unit test, which will execute on the development machine (host).
 *
 * @see <a href="http://d.android.com/tools/testing">Testing documentation</a>
 */
public class ExampleUnitTest {

    @Test
    public void addition_isCorrect() {
        MyEnum.BLUE.getIndex();
        MyEnum.RED.getName();

        for (int i = 0; i < 20; i++) {
            System.out.print(Connections.getConnection());
        }
    }

}