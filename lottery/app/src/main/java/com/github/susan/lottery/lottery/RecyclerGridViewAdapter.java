package com.github.susan.lottery.lottery;

import android.app.Fragment;
import android.content.Context;
import android.graphics.Color;
import android.support.v7.widget.RecyclerView;
import android.text.Editable;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.github.susan.lottery.lottery.logistic.SingleBet;

import java.util.LinkedHashMap;
import java.util.Map;

import static com.github.susan.lottery.lottery.logistic.Utils.TAG;

/**
 * RecyclerView实现 gridview效果！
 * https://blog.csdn.net/u011827502/article/details/52366788
 * Created by susan on 2018/6/25.
 */
public class RecyclerGridViewAdapter extends RecyclerView.Adapter<RecyclerGridViewAdapter.ViewHolder> {
    private final LinkedHashMap<String, SingleBet.Rate> concedeMap;
    private final ScoreFragment fragment;
    private final String[] titleArray;
    private Context mContext;
    private LayoutInflater inflater;


    public interface OnRecyclerViewItemListener {
        public void onItemClickListener(View view, int position);

        public void onItemLongClickListener(View view, int position);
    }

    private OnRecyclerViewItemListener mOnRecyclerViewItemListener;

    public void setOnRecyclerViewItemListener(OnRecyclerViewItemListener listener) {
        mOnRecyclerViewItemListener = listener;
    }


    public RecyclerGridViewAdapter(ScoreFragment fragment, Context mContext, LinkedHashMap<String, SingleBet.Rate> concedeMap, String[] titleArray) {
        this.titleArray = titleArray;
        this.fragment = fragment;
        this.mContext = mContext;
        this.concedeMap = concedeMap;
        inflater = LayoutInflater.from(mContext);
    }


    @Override
    public ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
        View v = inflater.inflate(R.layout.fragment_score_recycler_item, viewGroup, false);
        return new ViewHolder(v);
    }

    @Override
    public void onBindViewHolder(final ViewHolder viewHolder, int i) {

        if (viewHolder == null) {
            return;
        }
        if (mOnRecyclerViewItemListener != null) {
            itemOnClick(viewHolder);
            itemOnLongClick(viewHolder);
        }
        String key = titleArray[i];
        viewHolder.tv_score.setText(key);

//        for (String key : concedeMap.keySet()) {
//            viewHolder.tv_score.setText(concedeMap.get(key));
//        }
//        SingleBet.Rate rate = concedeMap.get(key);
//        if (null == rate) {
//
//        } else {
//            viewHolder.tv_score.setText(rate.getConcedeBet());
//            viewHolder.tv_precent.setText(rate.getPrecentMoney() + "");
//            viewHolder.et_oods.setText(rate.getRawOdds() + "");
//            switch (rate.getResult()) {
//                case DRAW:
//                    viewHolder.view_result.setBackgroundColor(Color.YELLOW);
//                    break;
//                case FAIL:
//                    viewHolder.view_result.setBackgroundColor(Color.GREEN);
//                    break;
//                case SUCCESS:
//                    viewHolder.view_result.setBackgroundColor(Color.RED);
//                    break;
//            }
//        }
        viewHolder.et_oods.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {
                Log.d(TAG, "viewHolder ->" + viewHolder.tv_score.getText().toString());
                fragment.dataSetChange(viewHolder.tv_score.getText().toString(), viewHolder.et_oods.getText().toString());
            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {

            }

            @Override
            public void afterTextChanged(Editable s) {

            }
        });
    }

    @Override
    public int getItemCount() {
        return concedeMap.size();
    }

    class ViewHolder extends RecyclerView.ViewHolder {

        TextView tv_score;
        TextView et_oods;
        TextView tv_precent;
        View view_result;

        public ViewHolder(View itemView) {
            super(itemView);
            tv_score = (TextView) itemView.findViewById(R.id.tv_score);
            et_oods = (TextView) itemView.findViewById(R.id.et_oods);
            tv_precent = (TextView) itemView.findViewById(R.id.tv_precent);
            view_result = (View) itemView.findViewById(R.id.view_result);
        }
    }

    //单机事件
    private void itemOnClick(final RecyclerView.ViewHolder holder) {
        holder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int position = holder.getLayoutPosition();
                mOnRecyclerViewItemListener.onItemClickListener(holder.itemView, position);
            }
        });
    }

    //长按事件
    private void itemOnLongClick(final RecyclerView.ViewHolder holder) {
        holder.itemView.setOnLongClickListener(new View.OnLongClickListener() {
            @Override
            public boolean onLongClick(View v) {
                int position = holder.getLayoutPosition();
                mOnRecyclerViewItemListener.onItemLongClickListener(holder.itemView, position);
                //返回true是为了防止触发onClick事件
                return true;
            }
        });
    }


}
