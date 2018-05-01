package com.example.rachael.geo_tracker.Adapters;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;

import com.example.rachael.geo_tracker.Models.GeoExcursion;
import com.example.rachael.geo_tracker.R;

import java.util.ArrayList;

public class CompletedExcursionAdaptor extends ArrayAdapter<GeoExcursion> {

    public CompletedExcursionAdaptor(Context context, ArrayList<GeoExcursion> completedGeoExcursions) {
        super(context, 0, completedGeoExcursions);
    }

    @Override
    public View getView(int position, View listItemView, ViewGroup parent) {

        if (listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(R.layout.excursion_name_text_view, parent, false);
        }


        GeoExcursion completedGeoExcursion = getItem(position);

        TextView excursionTitle = listItemView.findViewById(R.id.excursionNameCompletedTextViewId);
        excursionTitle.setText(completedGeoExcursion.getTitle());
        
        listItemView.setTag(completedGeoExcursion);

        return listItemView;
    }


}
