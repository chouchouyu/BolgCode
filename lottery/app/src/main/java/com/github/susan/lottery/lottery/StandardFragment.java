package com.github.susan.lottery.lottery;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentTransaction;
import android.text.Editable;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.TextView;

import com.github.susan.lottery.lottery.logistic.VictoryBet;

import java.text.DecimalFormat;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.Unbinder;

import static com.github.susan.lottery.lottery.Helper.mathRound;
import static com.github.susan.lottery.lottery.logistic.Utils.TAG;


/**
 * A simple {@link Fragment} subclass.
 */
public class StandardFragment extends Fragment {


    public StandardFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_standard, container, false);

        addWinOrLostFragment();

        addHalfGameFragment();

        return view;
    }

    private void addWinOrLostFragment() {
        Fragment winOrlostFragment = new WinOrLostFragment();
        FragmentTransaction transaction = getChildFragmentManager().beginTransaction();
        transaction.add(R.id.fl_win_or_lost, winOrlostFragment).commit();
    }

    private void addHalfGameFragment() {
        Fragment halfGameFragment = new HalfGameFragment();
        FragmentTransaction transaction = getChildFragmentManager().beginTransaction();
        transaction.add(R.id.fl_halfgame, halfGameFragment).commit();
    }
}
