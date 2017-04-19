package com.example.user.rv_examplecastom;

import android.content.Context;
import android.support.v7.widget.LinearLayoutManager;
import android.util.AttributeSet;
import android.view.View;

/**
 * Created by user on 18.04.2017.
 */

public class CustomLinerLayoutManager extends LinearLayoutManager {

    public CustomLinerLayoutManager(Context context) {
        super(context);
    }

    public CustomLinerLayoutManager(Context context, int orientation, boolean reverseLayout) {
        super(context, orientation, reverseLayout);
    }

    public CustomLinerLayoutManager(Context context, AttributeSet attrs, int defStyleAttr, int defStyleRes) {
        super(context, attrs, defStyleAttr, defStyleRes);

    }


//    @Override
//    public void setInitialPrefetchItemCount(int itemCount) {
//        LogUtil.info(this, "itemCount: " + itemCount);
//        super.setInitialPrefetchItemCount(itemCount);
//    }

//    @Override
//    public int getItemCount() {
//        LogUtil.info(this, "count - " + getItemCount());
//        return super.getItemCount();
//
//    }

    @Override
    public void addView(View child) {
        super.addView(child);
        LogUtil.info(this, "Add view: " + child);
    }

//    @Override
//    public int getInitialPrefetchItemCount() {
//        LogUtil.info(this, "getInitialPrefetchItemCount: " + getInitialPrefetchItemCount());
//        return super.getInitialPrefetchItemCount();
//    }


}
