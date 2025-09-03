package com.rakib.customadapter;
import android.app.Activity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

public class CustomAdapter extends BaseAdapter {
    private final Activity context;

    public CustomAdapter(Activity context, String[] district, Integer[] imageId) {
        this.context = context;
        this.district = district;
        this.imageId = imageId;
    }

    private final String[] district;
    private final Integer[] imageId;

    @Override
    public int getCount() {
        return district.length;
    }

    @Override
    public Object getItem(int position) {
        return null;
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {


        //LAYOUT INFLATE
        LayoutInflater inflater = context.getLayoutInflater();
        View rowView = inflater.inflate(R.layout.single_list, null, true);

        //CUSTING
        TextView txtTitle = rowView.findViewById(R.id.txt);
        ImageView imageView = rowView.findViewById(R.id.img);


        //position assing
        txtTitle.setText(district[position]);
        imageView.setImageResource(imageId[position]);



        return rowView;



    }
}
