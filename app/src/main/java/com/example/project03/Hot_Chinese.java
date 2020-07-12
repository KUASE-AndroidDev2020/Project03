package com.example.project03;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;

public class Hot_Chinese extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hot_chinese);
    }

    public void goToLink5(View view) {
        Intent toLink5 = new Intent(Intent.ACTION_VIEW, Uri.parse("https://oceans-nadia.com/"));
        startActivity(toLink5);
    }

    public void goToHotFoodStyle(View view) {
        Intent toHotFoodStyle = new Intent(this, HotFoodStyle.class);
        startActivity(toHotFoodStyle);
    }
}
