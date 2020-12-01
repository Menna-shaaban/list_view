package com.example.listview;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
ListView listView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        listView=(ListView)findViewById(R.id.list);
        ArrayList<user> values=new ArrayList<>();
        values.add(new user("menna shaaban","01000735538",R.drawable.noura));
        values.add(new user("narii","01002365577",R.drawable.noura));
        values.add(new user("mama","01010732569",R.drawable.noura));
        values.add(new user("israa","0111245970",R.drawable.noura));
        values.add(new user("heba","01000735538",R.drawable.noura));
        values.add(new user("aya","0101222131",R.drawable.noura));
        values.add(new user("menna ","123487",R.drawable.noura));
        values.add(new user("manar","1235889",R.drawable.noura));
        ListAdapter adapter=new ListAdapter(this,R.layout.listview,values);
listView.setAdapter(adapter);

    }
}