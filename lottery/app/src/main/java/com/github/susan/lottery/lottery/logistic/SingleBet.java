package com.github.susan.lottery.lottery.logistic;

import com.github.susan.lottery.lottery.logistic.GameType;
import com.github.susan.lottery.lottery.logistic.Result;

import java.util.Map;

import static com.github.susan.lottery.lottery.logistic.Utils.Price;
import static com.github.susan.lottery.lottery.logistic.Utils.TargetMoney;

/**
 * Created by susan on 2018/6/22.
 */

public abstract class SingleBet {

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
    private double moneyFail = 0;

    //总费用
    private double TotalCost = 0;

    private Map<String, Double> scoreMap;

    private int concedePoint;

    private Map<String, Rate> concedeMap;


    public SingleBet(GameType gameType, double oddSuccess, double oddDraw, double oddFail, Map<String, Double> scoreMap, int concedePoint) {
        this.gameType = gameType;
        this.scoreMap = scoreMap;
        this.concedePoint = concedePoint;
//        if (scoreMap != null) {
        calculate(oddSuccess, oddDraw, oddFail, scoreMap, concedePoint);
//        }
    }

    abstract void calculate(double oddSuccess, double oddDraw, double oddFail, Map<String, Double> scoreMap, int concedePoint);


    public void after(double oddSuccess, double oddDraw, double oddFail, Map<String, Rate> concedeMap) {
        this.oddsSuccess = oddSuccess;
        this.oddsDraw = oddDraw;
        this.oddsFail = oddFail;
        this.concedeMap = concedeMap;
        setMoneySuccess(oddsSuccess);
        setMoneyDraw(oddsDraw);
        setMoneyFail(oddsFail);
        setTotalCost();
    }

    public int getConcedePoint() {
        return concedePoint;
    }

    public void setConcedePoint(int concedePoint) {
        this.concedePoint = concedePoint;
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

    public Map<String, Rate> getConcedeMap() {
        return concedeMap;
    }

    public void setConcedeMap(Map<String, Rate> concedeMap) {
        this.concedeMap = concedeMap;
    }

    private void setMoneySuccess(double oddsSuccess) {
        if (oddsSuccess == 0.0) {
            this.moneySuccess = 0;
        } else {
            this.moneySuccess = TargetMoney / oddsSuccess;
        }

    }

    private void setMoneyDraw(double oddsDraw) {
        if (oddsDraw == 0.0) {
            this.moneyDraw = 0;
        } else {
            this.moneyDraw = TargetMoney / oddsDraw;
        }
    }

    private void setMoneyFail(double oddsFail) {
        if (oddsFail == 0.0) {
            this.moneyFail = 0;
        } else {
            this.moneyFail = TargetMoney / oddsFail;
        }

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
                ", concedePoint=" + concedePoint +
                ", concedeMap=" + concedeMap +
                '}';
    }

    public static class Rate {
        private double rawOdds;
        private String concedeBet;
        private Result result;
        //总球数
        private int scoreCount;
        private double precentMoney;
        private double earnMoney;

        public int getScoreCount() {
            return scoreCount;
        }

        public void setScoreCount(int scoreCount) {
            this.scoreCount = scoreCount;
        }

        public double getRawOdds() {
            return rawOdds;
        }

        public void setRawOdds(double rawOdds) {
            this.rawOdds = rawOdds;
        }

        public String getConcedeBet() {
            return concedeBet;
        }

        public void setConcedeBet(String concedeBet) {
            this.concedeBet = concedeBet;
        }

        public Result getResult() {
            return result;
        }

        public void setResult(Result result) {
            this.result = result;
        }

        public double getPrecentMoney() {
            return precentMoney;
        }

        public void setPrecentMoney(double rawOdds) {
            if (rawOdds == 0.0) {
                this.precentMoney = 0;
            } else {
                this.precentMoney = TargetMoney / rawOdds;
            }
        }

        public double getEarnMoney() {
            return earnMoney;
        }

        public void setEarnMoney(double rawOdds) {
            if (rawOdds == 0.0) {
                this.earnMoney = 0;
            } else {
                this.earnMoney = rawOdds * Price;
            }
        }

        @Override
        public String toString() {
            return "Rate{" +
                    "rawOdds=" + rawOdds +
                    ", concedeBet='" + concedeBet + '\'' +
                    ", result=" + result +
                    ", scoreCount=" + scoreCount +
                    ", precentMoney=" + precentMoney +
                    ", earnMoney=" + earnMoney +
                    '}';
        }
    }
}
