package com.example.project03;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class Cold_Food_Style extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cold_food_style);
    }

    public void goToColdJapaneseActivity(View view) {
        Intent toColdJapanese = new Intent(this, ColdJapaneseActivity.class);
        startActivity(toColdJapanese);
    }

    public void goToCold_Western(View view) {
        Intent toCold_Western =new Intent(this, Cold_Western.class);
        startActivity(toCold_Western);
    }

    public void gotoCold_Chinese(View view) {
        Intent toCold_Chinese= new Intent(this,Cold_Chinese.class);
        startActivity(toCold_Chinese);
    }
}
