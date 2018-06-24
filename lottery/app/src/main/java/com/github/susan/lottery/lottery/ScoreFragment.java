package com.github.susan.lottery.lottery;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.text.Editable;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.TextView;

import com.github.susan.lottery.lottery.logistic.ScoreBet;
import com.github.susan.lottery.lottery.logistic.SingleBet;

import java.util.LinkedHashMap;
import java.util.Map;

import static android.support.constraint.Constraints.TAG;


/**
 * A simple {@link Fragment} subclass.
 */
public class ScoreFragment extends Fragment implements TextWatcher {


    String[] titleArray = {"1:0", "2:0", "2:1",
            "3:0", "3:1", "3:2",
            "4:0", "4:1", "4:2",
            "5:0", "5:1", "5:2", "胜其他",
            "0:0", "1:1", "2:2", "3:3", "平其他",
            "0:1", "0:2", "1:2", "0:3", "1:3",
            "2:3", "0:4", "1:4", "2:4", "0:5",
            "1:5", "2:5", "负其他",};

    private RecyclerView recyclerView;
    private GridLayoutManager layoutManager;

    private RecyclerGridViewAdapter adapter;
    Map<String, SingleBet.Rate> concedeMap;

    public ScoreFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_score, null);
        recyclerView = view.findViewById(R.id.fragment_recyclerview);
        layoutManager = new GridLayoutManager(getContext(), 4);
        recyclerView.setLayoutManager(layoutManager);
        concedeMap = new LinkedHashMap<>();
        for (String title : titleArray) {
            concedeMap.put(title, 0);
        }
        adapter = new RecyclerGridViewAdapter(this, getContext(), concedeMap, titleArray);
        recyclerView.setAdapter(adapter);
        return view;
    }

    @Override
    public void beforeTextChanged(CharSequence s, int start, int count, int after) {
        Log.d(TAG, "beforeTextChanged->" + s);
    }

    @Override
    public void onTextChanged(CharSequence s, int start, int before, int count) {
        Log.d(TAG, "onTextChanged->" + s);
        Map<String, Double> scoreMap = new LinkedHashMap<>();

        for (int i = 0; i < layoutManager.getChildCount(); i++) {
            View item = layoutManager.findViewByPosition(i);
            TextView scoreText = item.findViewById(R.id.tv_score);
            EditText editText = item.findViewById(R.id.et_oods);
            String oods = editText.getText().toString();
            if (!TextUtils.isEmpty(oods)) {
                scoreMap.put(scoreText.getText().toString(), Double.valueOf(oods));
            }
        }

        ScoreBet scoreBet = new ScoreBet(scoreMap, 0);
        concedeMap = scoreBet.getConcedeMap();
//        adapter.notifyDataSetChanged();
    }

    @Override
    public void afterTextChanged(Editable s) {
        Log.d(TAG, "afterTextChanged->" + s);
    }
}
