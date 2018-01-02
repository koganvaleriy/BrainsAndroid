package com.example.valeriy.brainsandroid.activities;

import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.example.valeriy.brainsandroid.R;
import com.example.valeriy.brainsandroid.fragments.LevelsListFragment;

public class LevelsListActivity extends AppCompatActivity {

    private FragmentManager mFragmentManager = getSupportFragmentManager();
    private FragmentTransaction mFragmentTransaction = mFragmentManager.beginTransaction();
    private final String LEVELS_TAG = "LevelsListFragment";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_levels_list);

        mFragmentTransaction.add(R.id.levels_fragment_container, new LevelsListFragment(), LEVELS_TAG)
                .commit();


    }
}
