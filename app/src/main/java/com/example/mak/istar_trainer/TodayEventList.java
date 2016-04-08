package com.example.mak.istar_trainer;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;
import android.widget.AdapterView.OnItemClickListener;
import com.example.mak.istar_trainer.com.trainer.adapters.CustomEventAdapter;

/**
 * Created by mak on 4/8/2016.
 */
public class TodayEventList extends Activity{
    ListView listView ;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.calender_events);

        // Get ListView object from xml
        listView = (ListView) findViewById(R.id.list);

        // Defined Array values to show in ListView
        String[] college = new String[] { "IIT Delhi",
                "IIT Bombay",
                "IIT Kanpur",
                "IIT Khadagpur",
                "IIT Madras",
                "IIT Roorkie",
                "IIT Indore",
                "IIT Bombay",
                "IIT Kanpur",
                "IIT Khadagpur",
                "IIT BHU"
        };

        final String[] events ={
                "Safari Event",
                "Camera Event",
                "Global Event",
                "FireFox Event",
                "UC Event",
                "Android Event",
                "VLC Event",
                "Safari Event",
                "Camera Event",
                "Global Event",
                "Cold Event"
        };

        String[] time ={
                "09:00 am",
                "10:00 am",
                "11:00 am",
                "12:00 pm",
                "01:00 am",
                "02:00 am",
                "03:00 am",
                "09:00 am",
                "10:00 am",
                "11:00 am",
                "04:00 am"
        };

        // Define a new Adapter
        // First parameter - Context
        // Second parameter - Layout for the row
        // Third parameter - ID of the TextView to which the data is written
        // Forth - the Array of data

        CustomEventAdapter adapter = new CustomEventAdapter(this,events,college,time);
      //  ArrayAdapter<String> adapter = new ArrayAdapter<String>(this,
        //        android.R.layout.simple_list_item_1, android.R.id.text1, values);

        // Assign adapter to ListView
       listView.setAdapter(adapter);

        // ListView Item Click Listener
        listView.setOnItemClickListener(new OnItemClickListener() {

            @Override
            public void onItemClick(AdapterView<?> parent, View view,
                                    int position, long id) {
                // TODO Auto-generated method stub
                String Slecteditem= events[+position];
                Toast.makeText(getApplicationContext(), Slecteditem, Toast.LENGTH_SHORT).show();

            }
        });
    }


}
