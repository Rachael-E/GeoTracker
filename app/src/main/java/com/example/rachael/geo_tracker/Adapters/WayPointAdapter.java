package com.example.rachael.geo_tracker.Adapters;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import com.example.rachael.geo_tracker.Models.GeoExcursion;
import com.example.rachael.geo_tracker.Models.WayPoints;
import com.example.rachael.geo_tracker.R;

import java.util.ArrayList;

public class WayPointAdapter extends ArrayAdapter<WayPoints> {

    public WayPointAdapter(Context context, ArrayList<WayPoints> geoExcursionWayPoint) {
        super(context, 0, geoExcursionWayPoint);
    }

    @Override
    public View getView(int position, View listItemView, ViewGroup parent) {

        if (listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(R.layout.waypoint_items_layout, parent, false);
        }

        WayPoints currentWayPoint = getItem(position);

        TextView excursionWayPoint = listItemView.findViewById(R.id.waypointItemsLayoutTextViewId);
        excursionWayPoint.setText(currentWayPoint.getDescription());

        listItemView.setTag(excursionWayPoint);

        return listItemView;


    }










}
