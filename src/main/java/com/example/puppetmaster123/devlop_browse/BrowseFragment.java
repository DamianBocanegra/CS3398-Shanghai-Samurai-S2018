package com.example.puppetmaster123.devlop_browse;


import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;


/**
 * A simple {@link Fragment} subclass.
 */
public class BrowseFragment extends Fragment {


    public BrowseFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        final View view = inflater.inflate(R.layout.fragment_browse, container,false);
        final ArrayList<String> catagories = new ArrayList<>();
        catagories.add("All");
        catagories.add("Search");
        catagories.add("Sort");
        catagories.add("Data Structure");
        catagories.add("Quick Reference");
        // Inflate the layout for this fragment
        ListView listView = (ListView) view.findViewById(R.id.browseMenu);

        ArrayAdapter<String> lvAdapter = new ArrayAdapter<String>(getActivity(),android.R.layout.simple_list_item_1, catagories);
        listView.setAdapter(lvAdapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

                if(catagories.get(position) == "All")
                {
                    Intent intent = new Intent(getActivity(), AllAlgorithms.class);
                    startActivity(intent);
                }
                else if(catagories.get(position) == "Search")
                {
                    Toast.makeText(getActivity(), "You clicked Search", Toast.LENGTH_SHORT).show();                }
                else if (catagories.get(position) == "Sort")
                {

                    Toast.makeText(getActivity(), "You clicked Sort", Toast.LENGTH_SHORT).show();
                }

                else if(catagories.get(position) == "Data Structure")
                {
                    Toast.makeText(getActivity(), "You clicked Data Structures", Toast.LENGTH_SHORT).show();
                }

                else if(catagories.get(position) == "Quick Reference")
                {
                    Toast.makeText(getActivity(), "You clicked Quick Reference", Toast.LENGTH_SHORT).show();
                }

            }
        });

        return view;
    }

}
