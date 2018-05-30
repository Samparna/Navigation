package com.qspider.navigation.adapter;

import android.app.Activity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import com.qspider.navigation.R;

public class ListAdapter extends BaseAdapter {
    private String[] namelist;
    private Activity activity;
    public ListAdapter(String[]namelist,Activity activity)
    {
        this.namelist=namelist;
        this.activity=activity;
    }
    @Override
    public int getCount() {
        return namelist.length;
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
        View view= LayoutInflater.from(activity).inflate(R.layout.list_item,parent,false);
        TextView textView=view.findViewById(R.id.nameTv);
        textView.setText(namelist[position]);
        return view;
    }
}
