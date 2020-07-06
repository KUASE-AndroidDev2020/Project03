package com.example.project03;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class Hot_Food_style extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hot__food_style);
    }

    public void goToHotJapaneseActivity(View view) {
        Intent tolog =new Intent(this, HotJapaneseActivity.class);
    }

    public void goToHotWesternActivity(View view) {
        Intent tolog =new Intent(this, HotWesternActivity.class);
    }

    public void goToHot_Chinese(View view) {
        Intent tolog = new Intent(this,Hot_Chinese.class);
    }
}
