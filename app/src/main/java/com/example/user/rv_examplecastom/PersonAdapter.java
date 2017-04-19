package com.example.user.rv_examplecastom;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.List;

/**
 * Created by user on 18.04.2017.
 */

public class PersonAdapter extends RecyclerView.Adapter<PersonAdapter.ViewHolder> {

    private List<Person> mPersons;


    public PersonAdapter(List<Person> persons) {
        mPersons = persons;
    }

    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {

        RecyclerView.RecycledViewPool mPool = new RecyclerView.RecycledViewPool();
        mPool.getRecycledViewCount(parent.getChildCount());
        LogUtil.info(this,"countParent " +  mPool.getRecycledViewCount(parent.getChildCount()));

        View rootView = LayoutInflater.from(parent.getContext()).inflate(R.layout.item, parent, false);

        ViewHolder viewHolder = new ViewHolder(rootView);
        return viewHolder;    }

    @Override
    public void onBindViewHolder(ViewHolder holder, int position) {
        Person contact = mPersons.get(position);

        TextView textView = holder.nameTextView;
        textView.setText(contact.getName());
    }

    @Override
    public int getItemCount() {
        return mPersons.size();
    }


    public class ViewHolder extends RecyclerView.ViewHolder {

        public TextView nameTextView;

        public ViewHolder(View itemView) {

            super(itemView);

            nameTextView = (TextView) itemView.findViewById(R.id.item);
        }
    }
}
