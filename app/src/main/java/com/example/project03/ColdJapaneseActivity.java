package com.example.project03;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;

public class ColdJapaneseActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cold_japanese);
    }


    public void goToLink2(View view) {
        Intent toLink2 = new Intent(Intent.ACTION_VIEW, Uri.parse("https://oceans-nadia.com/"));
        startActivity(toLink2);
    }

    public void goToColdFoodStyle(View view) {
        Intent toColdFoodStyle = new Intent(this, ColdFoodStyle.class);
        startActivity(toColdFoodStyle);
    }
}
