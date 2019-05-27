package com.example.appcup;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.ListView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    Button positionsButton, matchesButton, searchPlayerButton, newsButton;
    private ListView myListView;

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
                Intent positions= new Intent(MainActivity.this, PosicionesActivity.class);
                startActivity(positions);
            }
        });

        matchesButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent match= new Intent(MainActivity.this, MatchActivity.class);
                startActivity(match);
            }
        });

        searchPlayerButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent search= new Intent(MainActivity.this, SearchPlayerActivity.class);
                startActivity(search);
            }
        });

        newsButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent news= new Intent(MainActivity.this, NewsActivity.class);
                startActivity(news);
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
