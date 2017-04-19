package com.example.user.rv_examplecastom;

import android.support.v7.widget.RecyclerView;

/**
 * Created by user on 18.04.2017.
 */

public class CustomRecyclerViewPoll extends RecyclerView.RecycledViewPool {
    @Override
    public RecyclerView.ViewHolder getRecycledView(int viewType) {
        RecyclerView.ViewHolder viewHolder = super.getRecycledView(viewType);
        LogUtil.info(this, "getRecycledView: " + viewType + " viewHolder: " + viewHolder);

        return viewHolder;
    }

    @Override
    public void putRecycledView(RecyclerView.ViewHolder scrap) {
        super.putRecycledView(scrap);
        LogUtil.info(this, "putRecycledView: " + scrap);
    }
}
