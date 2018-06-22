package com.github.susan.lottery.lottery;

/**
 * Created by susan on 2018/6/22.
 */

public class Example {

    //比赛类型
    private GameType result;

    //赢的赔率
    private double oddsSuccess;
    //平的赔率
    private double oddsDraw;
    //失败的赔率
    private double oddsFail;

    //总费用
    private double TotalCost;

    public Example(GameType result, double oddsSuccess, double oddsDraw, double oddsFail) {
        this.result = result;
        this.oddsSuccess = oddsSuccess;
        this.oddsDraw = oddsDraw;
        this.oddsFail = oddsFail;
    }

    public GameType getResult() {
        return result;
    }

    public void setResult(GameType result) {
        this.result = result;
    }

    public double getOddsSuccess() {
        return oddsSuccess;
    }

    public void setOddsSuccess(double oddsSuccess) {
        this.oddsSuccess = oddsSuccess;
    }

    public double getOddsDraw() {
        return oddsDraw;
    }

    public void setOddsDraw(double oddsDraw) {
        this.oddsDraw = oddsDraw;
    }

    public double getOddsFail() {
        return oddsFail;
    }

    public void setOddsFail(double oddsFail) {
        this.oddsFail = oddsFail;
    }

    public double getTotalCost() {
        return TotalCost;
    }

    public void setTotalCost(double totalCost) {
        TotalCost = totalCost;
    }

    @Override
    public String toString() {
        return "Game{" +
                "result=" + result +
                ", oddsSuccess=" + oddsSuccess +
                ", oddsDraw=" + oddsDraw +
                ", oddsFail=" + oddsFail +
                ", TotalCost=" + TotalCost +
                '}';
    }
}
