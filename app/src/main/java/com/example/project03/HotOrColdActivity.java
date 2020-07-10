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

    public void goToHot_Food_Style(View view) {
        Intent toHot_Food_Style = new Intent(this, Hot_Food_Style.class);
        startActivity(toHot_Food_Style);
    }

    public void goToCold_Food_Style(View view) {
        Intent toCold_Food_Style = new Intent(this, Cold_Food_Style.class);
        startActivity(toCold_Food_Style);
    }
}
