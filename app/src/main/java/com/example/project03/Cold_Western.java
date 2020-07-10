package com.example.project03;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;

public class Cold_Western extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cold_western);
    }

    public void goToCold_food_style(View view) {
        Intent toCold_food_style = new Intent(this, Cold_Food_Style.class);
        startActivity(toCold_food_style);
    }

    public void goToLink4(View view) {
        Intent toLink4 = new Intent(Intent.ACTION_VIEW, Uri.parse("https://oceans-nadia.com/"));
        startActivity(toLink4);
    }
}
