package com.example.project03;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class HotFoodStyle extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hot__food_style);
    }

    public void goToHotJapaneseActivity(View view) {
        Intent toHotJapanese =new Intent(this, HotJapaneseActivity.class);
        startActivity(toHotJapanese);
    }

    public void goToHotWesternActivity(View view) {
        Intent toHotWestern =new Intent(this, HotWesternActivity.class);
        startActivity(toHotWestern);
    }

    public void goToHot_Chinese(View view) {
        Intent toHot_Chinese = new Intent(this,Hot_Chinese.class);
        startActivity(toHot_Chinese);
    }
}
