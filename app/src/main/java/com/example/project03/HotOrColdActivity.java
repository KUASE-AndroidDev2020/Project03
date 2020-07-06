package com.example.project03;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class HotOrColdActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hot_or_cold);
    }

    public void goToHot_Food_style(View view) {
        Intent tolog = new Intent(this, Hot_Food_style.class);
    }

    public void goToCold_food_style(View view) {
        Intent tolog = new Intent(this, cold_food_style.class);
    }
}
