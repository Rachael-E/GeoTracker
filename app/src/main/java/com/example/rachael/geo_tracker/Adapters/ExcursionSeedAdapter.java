package com.example.rachael.geo_tracker.Adapters;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import com.example.rachael.geo_tracker.Models.GeoExcursion;
import com.example.rachael.geo_tracker.R;

import java.util.ArrayList;

public class ExcursionSeedAdapter extends ArrayAdapter<GeoExcursion> {

    public ExcursionSeedAdapter(Context context, ArrayList<GeoExcursion> geoExcursions) {
        super(context, 0, geoExcursions);
    }

    @Override
    public View getView(int position, View listItemView, ViewGroup parent) {

        if (listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(R.layout.find_excursion_items, parent, false);
        }

        GeoExcursion currentExcursion = getItem(position);

        TextView excursionTitle = listItemView.findViewById(R.id.excursionTitleTextViewId);
        excursionTitle.setText(currentExcursion.getTitle());

        TextView excursionType = listItemView.findViewById(R.id.excursionTypeViewId);
        String activityType = currentExcursion.getExcursionType().getActivityType();
        String activityToDisplay = "Excursion Type: " + activityType;
        excursionType.setText(activityToDisplay);

        listItemView.setTag(currentExcursion);

        //ImageView excursionImage

        return listItemView;
    }

}



