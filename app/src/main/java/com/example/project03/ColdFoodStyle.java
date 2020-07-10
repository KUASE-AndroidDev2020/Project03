package com.example.project03;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class ColdFoodStyle extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cold_food_style);
    }

    public void goToColdJapaneseActivity(View view) {
        Intent toColdJapaneseActivity = new Intent(this, ColdJapaneseActivity.class);
        startActivity(toColdJapaneseActivity);
    }

    public void goToCold_Western(View view) {
        Intent toCold_Western = new Intent(this, Cold_Western.class);
        startActivity(toCold_Western);
    }

    public void goToCold_Chinese(View view) {
        Intent toCold_chinese = new Intent(this, Cold_Chinese.class);
        startActivity(toCold_chinese);
    }
}
