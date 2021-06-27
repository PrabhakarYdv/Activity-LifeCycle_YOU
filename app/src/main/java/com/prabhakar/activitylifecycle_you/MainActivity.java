package com.prabhakar.activitylifecycle_you;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    private Button launchSecond;
    private final String tag = "MainActivity";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        launchSecond = findViewById(R.id.activity_1);
        launchSecond.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, SecondActivity.class);
                startActivity(intent);
            }
        });
        Log.d(tag, "onCreate is calling");
    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.d(tag, "onStart is calling");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.d(tag, "onStop is calling");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.d(tag, "onPause is calling");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.d(tag, "onResume is calling");
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Log.d(tag,"onRestart is calling");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.d(tag,"onDestroy is calling");
    }
}