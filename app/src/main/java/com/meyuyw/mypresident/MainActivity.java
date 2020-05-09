package com.meyuyw.mypresident;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;


public class MainActivity extends AppCompatActivity {
    RecyclerView mainRV;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mainRV = findViewById(R.id.rv_main);
        load();
    }

    public void load() {
        PresidentAdapter adapter = new PresidentAdapter(this, Database.getData());
        mainRV.setAdapter(adapter);
        mainRV.setLayoutManager(new LinearLayoutManager(this));
    }

}
