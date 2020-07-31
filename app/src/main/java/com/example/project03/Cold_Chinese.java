package com.example.project03;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;

public class Cold_Chinese extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cold_chinese);
    }


    public void goToLink6(View view) {
        Intent toLink6 = new Intent(Intent.ACTION_VIEW, Uri.parse("https://delishkitchen.tv/"));
        startActivity(toLink6);
    }

    public void goToColdFoodStyle(View view) {
        Intent toColdFoodStyle =new Intent(this, ColdFoodStyle.class);
        startActivity(toColdFoodStyle);
    }
}
