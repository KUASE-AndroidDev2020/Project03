package com.example.project03;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class HotFoodStyle extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hot_food_style);
    }

    public void goToHotJapaneseActivity(View view) {
        Intent toHotJapaneseActivity = new Intent(this, HotJapaneseActivity.class);
        startActivity(toHotJapaneseActivity);
    }

    public void goToHotWesternActivity(View view) {
        Intent toHotWesternActivity = new Intent(this, HotWesternActivity.class);
        startActivity(toHotWesternActivity);
    }

    public void goToHot_Chinese(View view) {
        Intent toHot_Chinese = new Intent(this, Hot_Chinese.class);
        startActivity(toHot_Chinese);
    }
}
