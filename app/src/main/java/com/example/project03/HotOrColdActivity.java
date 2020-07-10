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

    public void goToHotFoodStyle(View view) {
        Intent toHotFoodStyle = new Intent(this, HotFoodStyle.class);
        startActivity(toHotFoodStyle);
    }

    public void goToColdFoodStyle(View view) {
        Intent toColdFoodStyle = new Intent(this, ColdFoodStyle.class);
        startActivity(toColdFoodStyle);
    }
}
