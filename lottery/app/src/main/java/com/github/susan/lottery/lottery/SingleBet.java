package com.github.susan.lottery.lottery;

import android.support.annotation.NonNull;

import java.util.Map;

import static com.github.susan.lottery.lottery.Utils.TargetMoney;

/**
 * Created by susan on 2018/6/22.
 */

abstract class SingleBet {

    //比赛类型
    private GameType gameType;

    //赢的赔率
    private double oddsSuccess;

    //平的赔率
    private double oddsDraw;
    //失败的赔率
    private double oddsFail;


    //赢赔率的钱
    private double moneySuccess;

    //平赔率的钱
    private double moneyDraw;

    //失败赔率的钱
    private double moneyFail;

    //总费用
    private double TotalCost;

    private Map<String, Double> scoreMap;


    public SingleBet(GameType gameType, double oddSuccess, double oddDraw, double oddFail, Map<String, Double> scoreMap) {
        this.gameType = gameType;
        this.scoreMap = scoreMap;
        this.oddsSuccess = oddSuccess;
        this.oddsDraw = oddDraw;
        this.oddsFail = oddFail;
        if (scoreMap != null) {
            calculate(oddSuccess, oddDraw, oddFail, scoreMap);
        }
        setMoneySuccess(oddsSuccess);
        setMoneyDraw(oddsDraw);
        setMoneyFail(oddsDraw);
        setTotalCost();
    }

    abstract void calculate(double oddSuccess, double oddDraw, double oddFail, Map<String, Double> scoreMap);


   public void after(double oddSuccess, double oddDraw, double oddFail) {
       this.oddsSuccess = oddSuccess;
       this.oddsDraw = oddDraw;
       this.oddsFail = oddFail;
    }

    public void setGameType(GameType gameType) {
        this.gameType = gameType;
    }

    public void setOddsSuccess(double oddsSuccess) {
        this.oddsSuccess = oddsSuccess;
    }

    public void setOddsDraw(double oddsDraw) {
        this.oddsDraw = oddsDraw;
    }

    public void setOddsFail(double oddsFail) {
        this.oddsFail = oddsFail;
    }

    public Map<String, Double> getScoreMap() {
        return scoreMap;
    }

    public void setScoreMap(Map<String, Double> scoreMap) {
        this.scoreMap = scoreMap;
    }

    private void setMoneySuccess(double moneySuccess) {
        this.moneySuccess = TargetMoney / moneySuccess;
    }

    private void setMoneyDraw(double moneyDraw) {
        this.moneyDraw = TargetMoney / moneyDraw;
    }

    private void setMoneyFail(double moneyFail) {
        this.moneyFail = TargetMoney / moneyFail;
    }

    private void setTotalCost() {
        this.TotalCost = moneySuccess + moneyDraw + moneyFail;
    }


    public void setTotalCost(double totalCost) {
        TotalCost = totalCost;
    }

    public GameType getGameType() {
        return gameType;
    }

    public double getOddsSuccess() {
        return oddsSuccess;
    }

    public double getOddsDraw() {
        return oddsDraw;
    }

    public double getOddsFail() {
        return oddsFail;
    }

    public double getMoneySuccess() {
        return moneySuccess;
    }

    public double getMoneyDraw() {
        return moneyDraw;
    }

    public double getMoneyFail() {
        return moneyFail;
    }

    public double getTotalCost() {
        return TotalCost;
    }

    @Override
    public String toString() {
        return "SingleBet{" +
                "gameType=" + gameType +
                ", oddsSuccess=" + oddsSuccess +
                ", oddsDraw=" + oddsDraw +
                ", oddsFail=" + oddsFail +
                ", moneySuccess=" + moneySuccess +
                ", moneyDraw=" + moneyDraw +
                ", moneyFail=" + moneyFail +
                ", TotalCost=" + TotalCost +
                ", scoreMap=" + scoreMap +
                '}';
    }
}
