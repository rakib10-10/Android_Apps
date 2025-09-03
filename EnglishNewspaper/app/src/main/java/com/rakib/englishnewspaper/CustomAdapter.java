package com.rakib.englishnewspaper;

import android.app.Activity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

public class CustomAdapter extends BaseAdapter {

    private final Activity context;
    private final String[] titles;
    private final String[] subTitles;
    private final String[] fullStory;
    private final String[] times;

    public CustomAdapter(Activity context, String[] titles, String[] subTitles, String[] times, String[] fullStory) {
        this.context = context;
        this.titles = titles;
        this.subTitles = subTitles;
        this.times = times;
        this.fullStory = fullStory;
    }
    @Override
    public int getCount() {
        return titles.length;
    }

    @Override
    public Object getItem(int i) {
        return null;
    }

    @Override
    public long getItemId(int i) {
        return 0;
    }

    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {

        LayoutInflater inflater = context.getLayoutInflater();
        View rowView = inflater.inflate(R.layout.activity_title, viewGroup, false);


        TextView title = rowView.findViewById(R.id.news_title);
        title.setText(titles[i]);

        TextView subtitle = rowView.findViewById(R.id.news_subtitle);
        subtitle.setText(subTitles[i]);

        TextView time = rowView.findViewById(R.id.news_time);
        time.setText(times[i]);

        TextView fullstory = rowView.findViewById(R.id.news_fullstory);
        fullstory.setText(fullStory[i]);

        return rowView;
    }


}
