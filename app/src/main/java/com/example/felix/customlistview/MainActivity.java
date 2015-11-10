package com.example.felix.customlistview;

import android.app.Activity;
import android.content.Context;
import android.content.res.Resources;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.View;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;

public class MainActivity extends Activity
{

    ListView lv;
    Context context;

    ArrayList prgmName;
    public static int [] profilePics={R.drawable.images,R.drawable.images,R.drawable.images,R.drawable.images};
    public static String [] Details={"  Saturday 5:00pm\n  Bike Sesh",
            "  Monday 8:00pm\n  Movie Night",
            "  Thursday 2:00pm\n  Gaming",
            "  Tuesday 10:00am\n  Workout"};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        context=this;

        lv=(ListView) findViewById(R.id.listView);
        View footerView = ((LayoutInflater) getSystemService(Context.LAYOUT_INFLATER_SERVICE)).inflate(R.layout.footer_layout, null, false);
        lv.addFooterView(footerView);
        lv.setAdapter(new CustomAdapter(this, Details,profilePics));

    }

}