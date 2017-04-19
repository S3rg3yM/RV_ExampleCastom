package com.example.user.rv_examplecastom;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    ArrayList<Person> mPersons;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);
            setContentView(R.layout.activity_main);

        CustomLinerLayoutManager customLinerLayoutManager1 = new CustomLinerLayoutManager(this);
        customLinerLayoutManager1.setInitialPrefetchItemCount(6);
        mPersons = Person.PersonsList(20);

        RecyclerView rvContacts = (CustomRecyclerView) findViewById(R.id.recycler_view);

        RecyclerView.RecycledViewPool recycledViewPool = new CustomRecyclerViewPoll();
        rvContacts.setRecycledViewPool(recycledViewPool);

        rvContacts.setLayoutManager(customLinerLayoutManager1);
        PersonAdapter adapter = new PersonAdapter(mPersons);
        rvContacts.setAdapter(adapter);

        RecyclerView rvContacts_second = (RecyclerView) findViewById(R.id.recycler_view_second);
        rvContacts_second.setLayoutManager(new LinearLayoutManager(this));
        rvContacts_second.setAdapter(adapter);


//        LogUtil.info(this,"size - " );
    }
}
