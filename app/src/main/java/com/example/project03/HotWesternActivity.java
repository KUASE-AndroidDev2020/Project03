package com.example.project03;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;

public class HotWesternActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hot_western);
    }

    public void goToHot_Food_style(View view) {
        Intent toHot_Food_style = new Intent(this, HotFoodStyle.class);
        startActivity(toHot_Food_style);
    }

    public void goToLink3(View view) {
        Intent toLink3 = new Intent(Intent.ACTION_VIEW, Uri.parse("https://oceans-nadia.com/"));
        startActivity(toLink3);
    }
}
