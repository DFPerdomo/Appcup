package com.example.appcup;

import android.app.TabActivity;
import android.content.Intent;
import android.os.Bundle;
import android.widget.TabHost;

import com.example.appcup.GruposActivity;
import com.example.appcup.LlavesActivity;

class Posiciones extends TabActivity {
    @Override
    public void onCreate(Bundle savedInsteanceState){
        super.onCreate(savedInsteanceState);
        TabHost host = getTabHost();
        host.addTab(host.newTabSpec("tab_1").setIndicator("Grupos").setContent(new Intent(this, GruposActivity.class)));
        host.addTab(host.newTabSpec("tab_2").setIndicator("Fixture").setContent(new Intent(this, LlavesActivity.class)));
    }
}