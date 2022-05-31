package com.example.lec_5;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;

import androidx.annotation.NonNull;

import java.util.List;

public class MyAdapter extends ArrayAdapter<Student> {

    public MyAdapter(@NonNull Context context, int resource, @NonNull List<Student> objects) {
        super(context, resource, objects);
    }
    @NonNull
    @Override
    public View getView(int position, @NonNull View convertView, @NonNull ViewGroup parent)
    {
        Student student = getItem(position);

        convertView = LayoutInflater.from(getContext()).inflate(R.layout.student,parent,false);

        return convertView;

    }

}
