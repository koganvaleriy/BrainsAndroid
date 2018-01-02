package com.example.valeriy.brainsandroid.adapters;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.GridView;
import android.widget.ImageView;
import android.widget.ListAdapter;
import android.widget.TextView;

import com.example.valeriy.brainsandroid.R;
import com.example.valeriy.brainsandroid.activities.LevelActivity;

/**
 * Created by Valeriy on 02.01.2018.
 */

public class LevelGridAdapter extends BaseAdapter {
    private Context mContext;

    public LevelGridAdapter(Context c) {
        mContext = c;
    }

    public int getCount() {
        return mThumbIds.length;
    }

    public Object getItem(int position) {
        return null;
    }

    public long getItemId(int position) {
        return 0;
    }

    // create a new ImageView for each item referenced by the Adapter
    public View getView(int position, View convertView, ViewGroup parent) {
        TextView textView;
        if (convertView == null) {
            // if it's not recycled, initialize some attributes
            textView = new TextView(mContext);
            textView.setLayoutParams(new GridView.LayoutParams(85, 85));
            //textView.setScaleType(ImageView.ScaleType.CENTER_CROP);
            textView.setPadding(8, 8, 8, 8);
        } else {
            textView = (TextView) convertView;
        }

        textView.setText(String.valueOf(mThumbIds[position]));
        return textView;
    }

    // references to our images
    private Integer[] mThumbIds = {
            1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23, 24, 25
    };
}

