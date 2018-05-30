package com.qspider.navigation.Fragment;

import android.database.DataSetObserver;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import com.qspider.navigation.R;
import com.qspider.navigation.adapter.ListAdapter;

public class ListFragment extends Fragment {
    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view=inflater.inflate(R.layout.list_fragment,container,false);
        ListView listView=view.findViewById(R.id.namelist);
        String[] namelist={"foods","kindle store","moblies,computer","TV,Appliances,Electronics","Men's fashion","Women's Fashion",
        "Sports","Toys","Beauty and health","car","Books","Music","Gift Cards","Moblie Recharge"};
        ListAdapter listAdapter=new ListAdapter(namelist,getActivity());
        listView.setAdapter(listAdapter);
        return view;
    }
}
