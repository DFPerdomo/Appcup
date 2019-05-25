package com.example.appcup;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    Button positionsButton, matchesButton, searchPlayerButton, newsButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        positionsButton= (Button)findViewById(R.id.posicionesButton);
        matchesButton= (Button)findViewById(R.id.matchButton);
        searchPlayerButton= (Button)findViewById(R.id.searchPlayerButton);
        newsButton= (Button)findViewById(R.id.newsButton);

        positionsButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent positions= new Intent(MainActivity.this, EncuentrosActivity.class);
                startActivity(positions);
            }
        });
    }

    //Create the options menu
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {

        super.onCreateOptionsMenu(menu);
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.logomenu, menu);
        return true;
    }
}
