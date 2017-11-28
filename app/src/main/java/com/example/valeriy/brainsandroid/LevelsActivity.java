package com.example.valeriy.brainsandroid;

import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.example.valeriy.brainsandroid.fragments.LevelsFragment;

public class LevelsActivity extends AppCompatActivity {

    private FragmentManager mFragmentManager = getSupportFragmentManager();
    private FragmentTransaction mFragmentTransaction = mFragmentManager.beginTransaction();
    private final String LEVELS_TAG = "LevelsFragment";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_levels);

        mFragmentTransaction.add(R.id.levels_fragment_container, new LevelsFragment(), LEVELS_TAG)
                .commit();


    }
}
