package com.github.susan.lottery.lottery;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.text.Editable;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.TextView;

import com.github.susan.lottery.lottery.logistic.HalfGameBet;
import com.github.susan.lottery.lottery.logistic.Result;
import com.github.susan.lottery.lottery.logistic.SingleBet;
import com.github.susan.lottery.lottery.logistic.VictoryBet;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.Unbinder;

import static android.support.constraint.Constraints.TAG;
import static com.github.susan.lottery.lottery.Helper.mathRound;


/**
 * A simple {@link Fragment} subclass.
 */
public class HalfGameFragment extends Fragment implements TextWatcher {

    //胜
    @BindView(R.id.et_win_win_oods)
    EditText etWinWinOods;
    @BindView(R.id.et_draw_win_oods)
    EditText etDrawWinOods;
    @BindView(R.id.et_fail_win_oods)
    EditText etFailWinOods;


    @BindView(R.id.tv_win_win_moneny)
    TextView tvWinWinMoneny;
    @BindView(R.id.tv_draw_win_moneny)
    TextView tvDrawWinMoneny;
    @BindView(R.id.tv_fail_win_moneny)
    TextView tvFailWinMoneny;

    //平
    @BindView(R.id.et_win_draw_oods)
    EditText etWinDrawOods;
    @BindView(R.id.et_draw_draw_oods)
    EditText etDrawDrawOods;
    @BindView(R.id.et_fail_draw_oods)
    EditText etFailDrawOods;

    @BindView(R.id.tv_win_draw_moneny)
    TextView tvWinDrawMoneny;
    @BindView(R.id.tv_draw_draw_moneny)
    TextView tvDrawDrawMoneny;
    @BindView(R.id.tv_fail_draw_moneny)
    TextView tvFailDrawMoneny;

    //负
    @BindView(R.id.et_win_fail_oods)
    EditText etWinFailOods;
    @BindView(R.id.et_draw_fail_oods)
    EditText etDrawFailOods;
    @BindView(R.id.et_fail_fail_oods)
    EditText etFailFailOods;

    @BindView(R.id.tv_win_fail_moneny)
    TextView tvWinFailMoneny;
    @BindView(R.id.tv_draw_fail_moneny)
    TextView tvDrawFailMoneny;
    @BindView(R.id.tv_fail_fail_moneny)
    TextView tvFailFailMoneny;


    @BindView(R.id.tv_min_oddsSuccess)
    TextView tvMinOddsSuccess;
    @BindView(R.id.tv_min_moneySuccess)
    TextView tvMinMoneySuccess;
    @BindView(R.id.tv_min_oddsDraw)
    TextView tvMinOddsDraw;
    @BindView(R.id.tv_min_moneyDraw)
    TextView tvMinMoneyDraw;
    @BindView(R.id.tv_min_oddsFail)
    TextView tvMinOddsFail;
    @BindView(R.id.tv_min_moneyFail)
    TextView tvMinMoneyFail;
    //    @BindView(R.id.tv_min_cost)
//    TextView tvMinCost;
//    @BindView(R.id.tv_min_total)
//    TextView tvMinTotal;
    @BindView(R.id.tv_max_oddsSuccess)
    TextView tvMaxOddsSuccess;
    @BindView(R.id.tv_max_moneySuccess)
    TextView tvMaxMoneySuccess;
    @BindView(R.id.tv_max_oddsDraw)
    TextView tvMaxOddsDraw;
    @BindView(R.id.tv_max_moneyDraw)
    TextView tvMaxMoneyDraw;
    @BindView(R.id.tv_max_oddsFail)
    TextView tvMaxOddsFail;
    @BindView(R.id.tv_max_moneyFail)
    TextView tvMaxMoneyFail;
    //    @BindView(R.id.tv_max_cost)
//    TextView tvMaxCost;
//    @BindView(R.id.tv_max_total)
//    TextView tvMaxTotal;
    Unbinder unbinder;

    public HalfGameFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_half_game, container, false);
        unbinder = ButterKnife.bind(this, view);

        etWinWinOods.addTextChangedListener(this);
        etDrawWinOods.addTextChangedListener(this);
        etFailWinOods.addTextChangedListener(this);

        etWinDrawOods.addTextChangedListener(this);
        etDrawDrawOods.addTextChangedListener(this);
        etFailDrawOods.addTextChangedListener(this);

        etWinFailOods.addTextChangedListener(this);
        etDrawFailOods.addTextChangedListener(this);
        etFailFailOods.addTextChangedListener(this);


        return view;
    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        unbinder.unbind();
    }

    @Override
    public void beforeTextChanged(CharSequence s, int start, int count, int after) {

    }

    String[] result = {"胜/胜", "平/胜", "负/胜",
            "胜/平", "平/平", "负/平",
            "胜/负", "平/负", "负/负"
    };


    @Override
    public void onTextChanged(CharSequence s, int start, int before, int count) {

        Map<String, ViewWrap> viewWrapMap = new LinkedHashMap<>();
        ViewWrap winWin = new ViewWrap(tvWinWinMoneny, etWinWinOods);
        viewWrapMap.put(result[0], winWin);
        ViewWrap drawWin = new ViewWrap(tvDrawWinMoneny, etDrawWinOods);
        viewWrapMap.put(result[1], drawWin);
        ViewWrap failWin = new ViewWrap(tvFailWinMoneny, etFailWinOods);
        viewWrapMap.put(result[2], failWin);

        ViewWrap winDraw = new ViewWrap(tvWinDrawMoneny, etWinDrawOods);
        viewWrapMap.put(result[3], winDraw);
        ViewWrap drawDraw = new ViewWrap(tvDrawDrawMoneny, etDrawDrawOods);
        viewWrapMap.put(result[4], drawDraw);
        ViewWrap failDraw = new ViewWrap(tvFailDrawMoneny, etFailDrawOods);
        viewWrapMap.put(result[5], failDraw);

        ViewWrap winFail = new ViewWrap(tvWinFailMoneny, etWinFailOods);
        viewWrapMap.put(result[6], winFail);
        ViewWrap drawFail = new ViewWrap(tvDrawFailMoneny, etDrawFailOods);
        viewWrapMap.put(result[7], drawFail);
        ViewWrap failFail = new ViewWrap(tvFailFailMoneny, etFailFailOods);
        viewWrapMap.put(result[8], failFail);


        Map<String, Double> halfGameMap = new LinkedHashMap<>();
        for (String key : viewWrapMap.keySet()) {
            halfGameMap.put(key, viewWrapMap.get(key).getOdds());
        }
        HalfGameBet halfGameBet = new HalfGameBet(halfGameMap);

        Map<String, SingleBet.Rate> concedeMap = halfGameBet.getConcedeMap();
        for (String keyConcedeMap : concedeMap.keySet()) {
            for (String keyViewWrapMap : viewWrapMap.keySet()) {
                if (TextUtils.equals(keyConcedeMap, keyViewWrapMap)) {
                    viewWrapMap.get(keyViewWrapMap).getTvMoney().setText(concedeMap.get(keyConcedeMap).getPrecentMoney() + "");
                }
            }
        }

        result(concedeMap);
    }

    private void result(Map<String, SingleBet.Rate> concedeMap) {

        Map<String, SingleBet.Rate> winMap = new LinkedHashMap<>();
        Map<String, SingleBet.Rate> drawMap = new LinkedHashMap<>();
        Map<String, SingleBet.Rate> failMap = new LinkedHashMap<>();

        ArrayList<Double> winOddsList = new ArrayList<Double>();
        ArrayList<Double> drawOddsList = new ArrayList<Double>();
        ArrayList<Double> failOddsList = new ArrayList<Double>();

        for (String key : concedeMap.keySet()) {
            SingleBet.Rate value = concedeMap.get(key);
            Result result = value.getResult();
            if (result.equals(Result.SUCCESS)) {
                winMap.put(key, value);
                winOddsList.add(value.getRawOdds());
            } else if (result.equals(Result.DRAW)) {
                drawMap.put(key, value);
                drawOddsList.add(value.getRawOdds());
            } else {
                failMap.put(key, value);
                failOddsList.add(value.getRawOdds());
            }
        }
        Double[] winOddsArray = sort(winOddsList);
        Double[] drawOddsArray = sort(drawOddsList);
        Double[] failOddsArray = sort(failOddsList);

        Log.d(TAG,"winOddsArray-> "+ winOddsArray.toString());
        Log.d(TAG,"drawOddsArray-> "+  drawOddsArray.toString());
        Log.d(TAG, "failOddsArray-> "+ failOddsArray.toString());

        Log.d(TAG,"winMap-> "+ winMap.toString());
        Log.d(TAG,"drawMap-> "+ drawMap.toString());
        Log.d(TAG,"failMap-> "+ failMap.toString());


        SingleBet.Rate minWinRate = getRate(winMap, winOddsArray, true);
        SingleBet.Rate minDrawRate = getRate(drawMap, drawOddsArray, true);
        SingleBet.Rate minFailRate = getRate(failMap, failOddsArray, true);

        tvMinOddsSuccess.setText(minWinRate.getRawOdds() + "");
        tvMinMoneySuccess.setText(minWinRate.getPrecentMoney() + "");

        tvMinOddsDraw.setText(minDrawRate.getRawOdds() + "");
        tvMinMoneyDraw.setText(minDrawRate.getPrecentMoney() + "");

        tvMinOddsFail.setText(minFailRate.getRawOdds() + "");
        tvMinMoneyFail.setText(minFailRate.getPrecentMoney() + "");

        SingleBet.Rate maxWinRate = getRate(winMap, winOddsArray, false);
        SingleBet.Rate maxDrawRate = getRate(drawMap, drawOddsArray, false);
        SingleBet.Rate maxFailRate = getRate(failMap, failOddsArray, false);

        tvMaxOddsSuccess.setText(maxWinRate.getRawOdds() + "");
        tvMaxMoneySuccess.setText(maxWinRate.getPrecentMoney() + "");

        tvMaxOddsDraw.setText(maxDrawRate.getRawOdds() + "");
        tvMaxMoneyDraw.setText(maxDrawRate.getPrecentMoney() + "");

        tvMaxOddsFail.setText(maxFailRate.getRawOdds() + "");
        tvMaxMoneyFail.setText(maxFailRate.getPrecentMoney() + "");


    }

    private SingleBet.Rate getRate(Map<String, SingleBet.Rate> map, Double[] array, boolean isMin) {
        Iterator winIt = map.values().iterator();
        while (winIt.hasNext()) {
            SingleBet.Rate val = (SingleBet.Rate) winIt.next();
            if (isMin) {
                if (val.getRawOdds() == array[0]) {
                    return val;
                }
            } else {
                if (val.getRawOdds() == array[array.length - 1]) {
                    return val;
                }
            }

        }
        return null;
    }

    private Double[] sort(ArrayList<Double> list) {
        Double[] array = new Double[list.size()];
        list.toArray(array);
        Arrays.sort(array);
        return array;
    }

    @Override
    public void afterTextChanged(Editable s) {

    }

    class ViewWrap {
        TextView tvMoney;
        EditText etOdds;
        double odds;

        public ViewWrap(TextView tvMoney, EditText etOdds) {
            this.tvMoney = tvMoney;
            this.etOdds = etOdds;
            setOdds(etOdds);
        }

        public TextView getTvMoney() {
            return tvMoney;
        }

        public void setTvMoney(TextView tvMoney) {
            this.tvMoney = tvMoney;
        }

        public EditText getEtOdds() {
            return etOdds;
        }

        public void setEtOdds(EditText etOdds) {
            this.etOdds = etOdds;
        }

        public double getOdds() {
            return odds;
        }

        public void setOdds(EditText etOdds) {
            String text = etOdds.getText().toString();
            if (TextUtils.isEmpty(text)) {
                this.odds = 0;
            } else {
                this.odds = Double.parseDouble(text);
            }
        }
    }
}