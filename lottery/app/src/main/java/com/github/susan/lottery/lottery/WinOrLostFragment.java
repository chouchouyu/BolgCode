package com.github.susan.lottery.lottery;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.text.Editable;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.TextView;

import com.github.susan.lottery.lottery.logistic.VictoryBet;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.Unbinder;

import static com.github.susan.lottery.lottery.Helper.mathRound;


/**
 * A simple {@link Fragment} subclass.
 */
public class WinOrLostFragment extends Fragment implements TextWatcher {

    @BindView(R.id.input_oddsSuccess)
    EditText inputOddsSuccess;
    @BindView(R.id.input_oddsFail)
    EditText inputOddsFail;
    @BindView(R.id.input_oddsDraw)
    EditText inputOddsDraw;

    @BindView(R.id.input_moneySuccess)
    TextView inputMoneySuccess;
    @BindView(R.id.input_moneyDraw)
    TextView inputMoneyDraw;
    @BindView(R.id.input_moneyFail)
    TextView inputMoneyFail;

    @BindView(R.id.tv_totalCost)
    TextView tvTotalCost;

    Unbinder unbinder;

    public WinOrLostFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_win_or_lost, container, false);
        unbinder = ButterKnife.bind(this, view);
        inputOddsSuccess.setFocusable(true);
        inputOddsSuccess.addTextChangedListener(this);
        inputOddsDraw.addTextChangedListener(this);
        inputOddsFail.addTextChangedListener(this);
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

    @Override
    public void onTextChanged(CharSequence s, int start, int before, int count) {
        String textOddsSuccess = inputOddsSuccess.getText().toString();
        String textOddsDraw = inputOddsDraw.getText().toString();
        String textOddsFail = inputOddsFail.getText().toString();
        if (TextUtils.isEmpty(textOddsSuccess)
                || TextUtils.isEmpty(textOddsDraw)
                || TextUtils.isEmpty(textOddsFail)) {
            return;
        }
        double oddsDraw = Double.parseDouble(textOddsDraw);
        double oddsFail = Double.parseDouble(textOddsFail);
        double oddsSuccess = Double.parseDouble(textOddsSuccess);
        VictoryBet victoryBet = new VictoryBet(oddsSuccess, oddsDraw, oddsFail, 0);

        inputMoneySuccess.setText(mathRound(victoryBet.getMoneySuccess()));
        inputMoneyDraw.setText(mathRound(victoryBet.getMoneyDraw()));
        inputMoneyFail.setText(mathRound(victoryBet.getMoneyFail()));
        tvTotalCost.setText(mathRound(victoryBet.getTotalCost()));
    }

    @Override
    public void afterTextChanged(Editable s) {
    }

}
