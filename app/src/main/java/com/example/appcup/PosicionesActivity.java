package com.example.appcup;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TabHost;

public class PosicionesActivity extends AppCompatActivity {
    TabHost tabHost;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_posiciones);

        tabHost= findViewById(R.id.tab_Host);

        //TabHost 1
        tabHost.setup();
        TabHost.TabSpec tabSpec_1= tabHost.newTabSpec("TabHost_1");
        tabSpec_1.setIndicator("Groups");
        tabSpec_1.setContent(R.id.tab1);
        tabHost.addTab(tabSpec_1);

        //TabHost 1
        tabHost.setup();
        TabHost.TabSpec tabSpec_2= tabHost.newTabSpec("TabHost_2");
        tabSpec_2.setIndicator("Fixture");
        tabSpec_2.setContent(R.id.tab2);
        tabHost.addTab(tabSpec_2);
    }
}
