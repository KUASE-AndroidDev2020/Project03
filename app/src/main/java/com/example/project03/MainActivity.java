package com.example.project03;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void goToHotOrColdActivity(View view) {
        Intent toHotOrColdActivity = new Intent(this, HotOrColdActivity.class);
        startActivity(toHotOrColdActivity);
    }

    public void goToBreakfastActivity(View view) {
        Intent toBreakfastActivity =new Intent(this, BreakfastActivity.class);
        startActivity(toBreakfastActivity);
    }
}
