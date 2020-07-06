package com.example.project03;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class cold_food_style extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cold_food_style);
    }

    public void goToColdJapaneseActivity(View view) {
        Intent tolog = new Intent(this, ColdJapaneseActivity.class);
    }

    public void goToCold_Western(View view) {
        Intent tolog =new Intent(this, Cold_Western.class);
    }

    public void gotoCold_Chinese(View view) {
        Intent tolog = new Intent(this,Cold_Chinese.class);
    }
}
