package com.example.valeriy.brainsandroid.adapters;

import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.RecyclerView.ViewHolder;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.example.valeriy.brainsandroid.R;
import com.example.valeriy.brainsandroid.entities.Level;

import java.util.ArrayList;

/**
 * Created by Valeriy on 28.11.2017.
 */

public class LevelsListAdapter extends RecyclerView.Adapter<LevelsListAdapter.LevelsViewHolder> {

    private ArrayList<Level> levels = new ArrayList<>();

    public LevelsListAdapter() {

        for (int i = 1; i < 50; i++) {
            levels.add(new Level(i));
            Log.d("DEBUG", "LevelsListAdapter: " + levels.size());
        }
    }

    @Override
    public LevelsViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {

        View view  = LayoutInflater.from(parent.getContext()).inflate(R.layout.level_row,parent,false);
        return new LevelsViewHolder(view);
    }

    @Override
    public void onBindViewHolder(LevelsViewHolder holder, int position) {
        Level level = levels.get(position);
        holder.id.setText(String.valueOf(level.getId()));
    }

    @Override
    public int getItemCount() {
        return levels.size();
    }

    class LevelsViewHolder extends ViewHolder {

        private TextView id;

        public LevelsViewHolder(View itemView) {
            super(itemView);
            this.id = itemView.findViewById(R.id.levels_list_id);
        }
    }
}
