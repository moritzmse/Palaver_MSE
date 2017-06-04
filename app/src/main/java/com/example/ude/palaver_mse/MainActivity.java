package com.example.ude.palaver_mse;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button b = (Button) findViewById(R.id.buttonTest);
        b.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startNewActivity();
            }
        });
    }
    private void startNewActivity() {
        Intent i = new Intent(this, LoginActivity.class);
        startActivity(i);
    }

}

/*
@Override
            public void onClick(View v) {
                startNewActivity();
            }
 */