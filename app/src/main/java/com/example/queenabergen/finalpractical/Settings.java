package com.example.queenabergen.finalpractical;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

public class Settings extends AppCompatActivity {
RecyclerView recyclerView;
    LinearLayoutManager linearLayoutManager;
    SettingsAdapter settingsAdapter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_settings);

        recyclerView = (RecyclerView)findViewById(R.id.settings_RecView);
        linearLayoutManager = new LinearLayoutManager(this, LinearLayoutManager.VERTICAL, false);
        settingsAdapter = new SettingsAdapter();
        recyclerView.setLayoutManager(linearLayoutManager);
        recyclerView.setAdapter(settingsAdapter);
    }
}
