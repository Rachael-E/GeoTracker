package com.example.rachael.geo_tracker.Activities;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioButton;

import com.example.rachael.geo_tracker.Models.GeoExcursion;
import com.example.rachael.geo_tracker.Models.GeoInfo;
import com.example.rachael.geo_tracker.Models.GeoTracker;
import com.example.rachael.geo_tracker.Models.WayPoints;
import com.example.rachael.geo_tracker.R;
import com.example.rachael.geo_tracker.Types.EraType;
import com.example.rachael.geo_tracker.Types.ExcursionType;
import com.example.rachael.geo_tracker.Types.RockType;

import java.util.ArrayList;

public class NewExcursionActivity extends AppCompatActivity {

    GeoExcursion geoExcursionToAdd;
    GeoTracker geoTracker;
    ArrayList<WayPoints> newArrayListOfWayPoints;
    WayPoints wayPointStringToAdd;
    RockType rockType;
    EraType eraType;
    ArrayList<EraType> eraTypeArrayList;
    ArrayList<RockType> rockTypeArrayList;
    GeoInfo geoInfo;
    ArrayList<GeoInfo> geoInfoArrayList;
    ExcursionType excursionType;

    private EditText excursionTitle;
    private EditText excursionSummary;
    private EditText excursionWayPoint;

    private CheckBox quaternaryCheckBox;
    private CheckBox palaeogeneCheckBox;
    private CheckBox jurassicCheckBox;
    private CheckBox triassicCheckBox;

    private CheckBox basaltCheckBox;
    private CheckBox sandstoneCheckBox;
    private CheckBox mudstoneCheckBox;

    private RadioButton walkButton;
    private RadioButton incompleteButton;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_new_excursion);

        excursionTitle = findViewById(R.id.editExcursionTitleId);
        excursionSummary = findViewById(R.id.editExcursionSummaryId);
        excursionWayPoint = findViewById(R.id.editWayPointId);

        quaternaryCheckBox = findViewById(R.id.checkBoxQuaternary);
        palaeogeneCheckBox = findViewById(R.id.checkBoxPalaeogene);
        jurassicCheckBox = findViewById(R.id.checkBoxJurassic);
        triassicCheckBox = findViewById(R.id.checkBoxTriassic);

        basaltCheckBox = findViewById(R.id.checkBoxBasalt);
        sandstoneCheckBox = findViewById(R.id.checkBoxSandstone);
        mudstoneCheckBox = findViewById(R.id.checkBoxMudstone);

        walkButton = findViewById(R.id.radioButtonWalk);
        incompleteButton = findViewById(R.id.radioButtonNotComplete);

    }


    public void onRadioButtonClicked(View view){

        boolean checked = ((RadioButton) view).isChecked();

        switch (view.getId()) {
            case R.id.radioButtonWalk:
                if (checked)
                    ExcursionType.valueOf(walkButton.getText().toString().toUpperCase());


                // this would return a string of False: but how to make that a boolean without the text saying false?
            case R.id.radioButtonNotComplete:
                if (checked)
                    incompleteButton.getText();

        }
    }

    public void onCheckBoxClicked(View view){

        boolean checked = ((CheckBox) view).isChecked();

        switch (view.getId()) {
            case R.id.checkBoxQuaternary:
                if (checked)
                   //EraType quaternaryCheckBox = EraType.QUATERNARY;
                    eraTypeArrayList.add(EraType.valueOf(quaternaryCheckBox.getText().toString().toUpperCase()));

            case R.id.checkBoxPalaeogene:
                if (checked)

                    eraTypeArrayList.add(EraType.valueOf(palaeogeneCheckBox.getText().toString().toUpperCase()));


            case R.id.checkBoxJurassic:
                if (checked)
                    eraTypeArrayList.add(EraType.valueOf(jurassicCheckBox.getText().toString().toUpperCase()));

            case R.id.checkBoxTriassic:
                if (checked)
                    eraTypeArrayList.add(EraType.valueOf(triassicCheckBox.getText().toString().toUpperCase()));

                case R.id.checkBoxBasalt:
                if (checked)
                rockTypeArrayList.add(RockType.valueOf(basaltCheckBox.getText().toString().toUpperCase()));

                case R.id.checkBoxSandstone:
                if (checked)

                rockTypeArrayList.add(RockType.valueOf(sandstoneCheckBox.getText().toString().toUpperCase()));

                case R.id.checkBoxMudstone:
                if (checked)
                rockTypeArrayList.add(RockType.valueOf(mudstoneCheckBox.getText().toString().toUpperCase()));


        }
    }




    public void onSaveExcursionButtonClicked(View button) {

        String getExcursionTitle = excursionTitle.getText().toString();
        String getExcursionSummary = excursionSummary.getText().toString();

        String wayPointString = excursionWayPoint.getText().toString();
        wayPointStringToAdd.setDescription(wayPointString);
        newArrayListOfWayPoints.add(wayPointStringToAdd);

        // get an enum when a checkbox is clicked
        // set that enum into GeoInfo
        // add the geoInfo into geoExcursion

//        EraType getEraType = quaternaryCheckBox.getEraEnum;
//        eraType.setGeologyPeriod(getEraType.getGeologyPeriod());


//        quaternaryCheckBox = eraType.setGeologyPeriod();


        geoExcursionToAdd.setTitle(getExcursionTitle);
        geoExcursionToAdd.setSummary(getExcursionSummary);
        geoExcursionToAdd.setWayPoints(newArrayListOfWayPoints);




    }




}
