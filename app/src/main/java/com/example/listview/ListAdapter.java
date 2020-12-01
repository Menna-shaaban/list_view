package com.example.listview;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.LayoutRes;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import java.util.ArrayList;
import java.util.List;

public class ListAdapter extends ArrayAdapter {
    Context context;
    int resource;

    public ListAdapter(@NonNull Context context, @LayoutRes int resource, @NonNull ArrayList<user> objects) {
        super(context,  0,objects);
        this.context=context;
        this.resource =resource ;
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        convertView= LayoutInflater.from(context).inflate(resource,parent,false);
        TextView name=convertView.findViewById(R.id.name);
        TextView phone=convertView.findViewById(R.id.phone);
        user currentuser= (user) getItem(position);
        name.setText(String.valueOf(currentuser.getName()));
        phone.setText(currentuser.getPhone());
    return convertView;
    }
}
