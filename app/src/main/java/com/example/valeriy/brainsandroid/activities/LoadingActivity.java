package com.example.valeriy.brainsandroid.activities;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.example.valeriy.brainsandroid.R;

public class LoadingActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_loading);

        Intent levelsActivity = new Intent(this, LevelsListActivity.class);
        startActivity(levelsActivity);

        //Need to request User information and Levels information from the server
    }
}
