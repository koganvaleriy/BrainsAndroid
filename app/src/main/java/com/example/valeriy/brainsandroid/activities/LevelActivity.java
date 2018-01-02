package com.example.valeriy.brainsandroid.activities;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.GridView;
import android.widget.TextView;
import android.widget.Toast;

import com.example.valeriy.brainsandroid.R;
import com.example.valeriy.brainsandroid.adapters.LevelGridAdapter;

public class LevelActivity extends AppCompatActivity {

    private TextView mParameters;
    private Intent mIntent;
    private int mLevelId;
    private int mAmountOfNumbers;
    private GridView mGridView;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_level);

        mIntent = getIntent();

        mLevelId = mIntent.getIntExtra("level_id", 0);
        mAmountOfNumbers = mIntent.getIntExtra("level_amount_of_numbers", 0);

        mParameters = findViewById(R.id.parameters);
        mParameters.setText("Level: " + String.valueOf(mLevelId) + " #: " + String.valueOf(mAmountOfNumbers));

        mGridView = findViewById(R.id.level_grid_view);
        mGridView.setAdapter(new LevelGridAdapter(this));

        mGridView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            public void onItemClick(AdapterView<?> parent, View v, int position, long id) {
                Toast.makeText(LevelActivity.this, String.valueOf(position), Toast.LENGTH_SHORT).show();
            }
        });
    }

}
