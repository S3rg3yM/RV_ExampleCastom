package com.example.user.rv_examplecastom;

import android.content.Context;
import android.support.annotation.Nullable;
import android.support.v7.widget.RecyclerView;
import android.util.AttributeSet;


/**
 * Created by user on 18.04.2017.
 */

public class CustomRecyclerView extends RecyclerView {

    public CustomRecyclerView(Context context) {
        this(context, null);
    }

    public CustomRecyclerView(Context context, @Nullable AttributeSet attrs) {
        this(context, attrs, 0);
    }

    public CustomRecyclerView(Context context, @Nullable AttributeSet attrs, int defStyle) {
        super(context, attrs, defStyle);
        init(context, attrs, defStyle);
    }

    private void init(Context context, AttributeSet attrs, int defStyle) {


    }

    @Override
    public RecycledViewPool getRecycledViewPool() {
        LogUtil.info(this, "getRecycledViewPool" + getRecycledViewPool() );
        return super.getRecycledViewPool();
    }


}
