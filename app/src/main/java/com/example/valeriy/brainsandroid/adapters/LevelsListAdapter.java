package com.example.valeriy.brainsandroid.adapters;

import android.content.Context;
import android.content.Intent;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.example.valeriy.brainsandroid.R;
import com.example.valeriy.brainsandroid.activities.LevelActivity;
import com.example.valeriy.brainsandroid.entities.Level;

import java.util.ArrayList;

/**
 * Created by Valeriy on 28.11.2017.
 */

public class LevelsListAdapter extends RecyclerView.Adapter<LevelsListAdapter.LevelsViewHolder> {

    private static final String TAG = "LevelsListAdapter";
    private ArrayList<Level> mLevels = new ArrayList<>();
    private static Context mContext;

    public LevelsListAdapter(Context context) {

        mContext = context;
        for (int i = 1; i < 50; i++) {
            mLevels.add(new Level(i,25));
            Log.d("DEBUG", "LevelsListAdapter: " + mLevels.size());
        }
    }

    public LevelsListAdapter(Context context, ArrayList<Level> levels) {

        mLevels = levels;
        mContext = context;

    }

    @Override
    public LevelsViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        Log.d("DEBUG", "onCreateViewHolder: ");
        View view  = LayoutInflater.from(parent.getContext()).inflate(R.layout.level_row,parent,false);
        return new LevelsViewHolder(view);
    }

    @Override
    public void onBindViewHolder(LevelsViewHolder holder, int position) {
        Level level = mLevels.get(position);

        holder.id.setText(String.valueOf(level.getId()));
        holder.mLevel = level;

        Log.d("DEBUG", "onBindViewHolder: " + position + String.valueOf(level.getId()));

    }

    @Override
    public int getItemCount() {
        Log.d("DEBUG", "getItemCount: " + mLevels.size());
        return mLevels.size();
    }

    public static class LevelsViewHolder extends RecyclerView.ViewHolder {

        private final TextView id;
        private Level mLevel;

        public LevelsViewHolder(View itemView) {
            super(itemView);


            // Define click listener for the ViewHolder's View.
            itemView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Log.d(TAG, "Element " + getAdapterPosition() + " clicked.");
                    Intent levelIntent = new Intent(mContext, LevelActivity.class);

                    //TODO put other Level's parameters
                    levelIntent.putExtra("level_id", mLevel.getId());
                    levelIntent.putExtra("level_amount_of_numbers", mLevel.getmAmountOfNumbers());

                    mContext.startActivity(levelIntent);
                }
            });

            this.id = (TextView)itemView.findViewById(R.id.levels_list_id);
            Log.d("DEBUG", "LevelsViewHolder: " + id);

        }
    }
}
