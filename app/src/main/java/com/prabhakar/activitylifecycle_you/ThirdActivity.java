package com.prabhakar.activitylifecycle_you;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;

public class ThirdActivity extends AppCompatActivity {
    private final String tag = "ThirdActivity";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_third);
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
        Log.d(tag, "onRestart is calling");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.d(tag, "onDestroy is calling");
    }
}