package com.codewithhamad.headwaybuilders;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;

import com.codewithhamad.headwaybuilders.analyst.AnalystActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_main);


        startActivity(new Intent(MainActivity.this, AnalystActivity.class));
    }
}