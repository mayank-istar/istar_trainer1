package com.example.mak.istar_trainer.com.trainer.adapters;

import android.app.Activity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.mak.istar_trainer.R;

/**
 * Created by mak on 4/8/2016.
 */
public class CustomEventAdapter extends ArrayAdapter<String> {

    private final Activity context;
    private final String[] event_name;
    private final String[] college;
    private final String[] time;


    public CustomEventAdapter(Activity context, String[] event_name, String[] college,String[] time) {
        super(context, R.layout.event_list, event_name);
        // TODO Auto-generated constructor stub

        this.context=context;
        this.event_name=event_name;
        this.college=college;
        this.time=time;
        //this.imgid=imgid;
    }

    public View getView(int position,View view,ViewGroup parent) {
        LayoutInflater inflater=context.getLayoutInflater();
        View rowView=inflater.inflate(R.layout.event_list, null, true);

        TextView eventText = (TextView) rowView.findViewById(R.id.event_name);
        TextView collegeText = (TextView) rowView.findViewById(R.id.college);
        TextView timeText = (TextView) rowView.findViewById(R.id.time);


        eventText.setText(event_name[position]);
        collegeText.setText("College: "+college[position]);
        timeText.setText("Time: "+time[position]);
       // imageView.setImageResource(imgid[position]);
       // extratxt.setText("Description "+itemname[position]);
        return rowView;

    };
}
