package com.example.valeriy.brainsandroid.fragments;


import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.widget.DividerItemDecoration;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.valeriy.brainsandroid.R;
import com.example.valeriy.brainsandroid.adapters.LevelsListAdapter;
import com.example.valeriy.brainsandroid.entities.Level;

import java.util.ArrayList;

/**
 * A simple {@link Fragment} subclass.
 */
public class LevelsFragment extends Fragment {

    private RecyclerView mLevelsList;
    private LevelsListAdapter mLevelsListAdapter;
    private RecyclerView.LayoutManager mLayoutManager;
    private RecyclerView.ItemDecoration mDivider;

    public LevelsFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View v = inflater.inflate(R.layout.fragment_levels, container, false);

        mLevelsListAdapter = new LevelsListAdapter();
        mLayoutManager = new LinearLayoutManager(getActivity(), LinearLayoutManager.VERTICAL, false);

        mDivider = new DividerItemDecoration(getActivity(),DividerItemDecoration.VERTICAL);

        mLevelsList = v.findViewById(R.id.levels_list);
        mLevelsList.setLayoutManager(mLayoutManager);
        mLevelsList.setAdapter(mLevelsListAdapter);
        //mLevelsList.addItemDecoration(mDivider);
        return v;
    }

    @Override
    public void onViewCreated(View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

    }
}
