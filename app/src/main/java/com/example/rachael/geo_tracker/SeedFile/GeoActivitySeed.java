package com.example.rachael.geo_tracker.SeedFile;

import com.example.rachael.geo_tracker.Models.GeoExcursion;
import com.example.rachael.geo_tracker.Models.GeoInfo;
import com.example.rachael.geo_tracker.Models.GeoTracker;
import com.example.rachael.geo_tracker.Types.ExcursionType;
import com.example.rachael.geo_tracker.Models.WayPoints;
import com.example.rachael.geo_tracker.Types.EraType;
import com.example.rachael.geo_tracker.Types.RockType;

import java.util.ArrayList;

public class GeoActivitySeed {

    public static ArrayList<GeoExcursion> seedEverything(){

        ArrayList<GeoExcursion> list;

        // adding rock types to the rockList array list for feeding into GeoInfo. Naming based on which walk they will belong to (rockListFossil = "The Fossil Tree" walk, rockListArches = "Carsaig Arches").
        RockType rocktype1 = RockType.BASALT;
        RockType rocktype2 = RockType.SANDSTONE;
        ArrayList<RockType> rockListFossil = new ArrayList<>();
        ArrayList<RockType> rockListArches = new ArrayList<>();
        rockListFossil.add(rocktype1);
        rockListArches.add(rocktype2);
        rockListArches.add(rocktype1);

        // adding geological eras to the eraList array list for feeding into GeoInfo. Naming based on which walk they will belong to (Fossil = "The Fossil Tree", Arches = "Carsaig Arches").
        EraType eraType1 = EraType.PALAEOGENE;
        EraType eraType2 = EraType.JURASSIC;
        EraType eraType3 = EraType.TRIASSIC;
        ArrayList<EraType> eraListFossil = new ArrayList<>();
        ArrayList<EraType> eraListArches = new ArrayList<>();
        eraListFossil.add(eraType1);
        eraListArches.add(eraType1);
        eraListArches.add(eraType2);
        eraListArches.add(eraType3);

        // populating GeoInfo with eraList and rockList array lists. Naming based on which walk they will belong to (Fossil = "The Fossil Tree", Arches = "Carsaig Arches").
        GeoInfo geoInfoFossil = new GeoInfo(eraListFossil, rockListFossil);
        GeoInfo geoInfoArches = new GeoInfo(eraListArches, rockListArches);
        ArrayList<GeoInfo> geoInfoListFossil = new ArrayList<>();
        ArrayList<GeoInfo> geoInfoListArches = new ArrayList<>();
        geoInfoListFossil.add(geoInfoFossil);
        geoInfoListArches.add(geoInfoArches);

        // inserting way points for each walk. Naming based on which walk they will belong to (Fossil = "The Fossil Tree", Arches = "Carsaig Arches").
        WayPoints waypoint1 = new WayPoints("Once on the main path, turn left at the fallen boulder by the Oak Tree and admire the basalt cliffs on your right. These formed as a result of volcanic activity 65 million years ago. Look carefully and you will see individual basalt layers, each representing individual eruptions from the many volcanoes once present in the area.");
        WayPoints waypoint2 = new WayPoints("Follow the path to the coastline. The path soon leaves the beach and continues across a number of debris fans. Care should be taken as loose rock is still actively falling. You may find small samples of zeolites in the fallen blocks of basalt from the cliffs above. Continue for many miles (keep an eye out for sandstones on the shore platform) and you will find the Carsaig Arches: sea stacks composed of basalt.");
        WayPoints waypoint3 = new WayPoints("Descend the rusty iron ladder to the pebble beach below. Don't worry, it's quite safe! Continue along the beach until you reach a rocky platform: beyond this in the next bay you will see a waterfall. To the right of the waterfall is MacCulloch's Fossil Tree: an astonishingly well preserved upright tree encased completely in lava.");
        ArrayList<WayPoints> wayPointListFossil = new ArrayList<>();
        ArrayList<WayPoints> wayPointListArches = new ArrayList<>();
        wayPointListFossil.add(waypoint1);
        wayPointListFossil.add(waypoint3);
        wayPointListArches.add(waypoint1);
        wayPointListArches.add(waypoint2);

        // inserting excursion type for each walk. Naming based on which walk they will belong to (Fossil = "The Fossil Tree", Arches = "Carsaig Arches").
        ExcursionType excursionTypeFossil = ExcursionType.WALK;
        ExcursionType excursionTypeArches = ExcursionType.WALK;

        // creating an empty list to add Geoexcursions to. Naming based on which walk they will belong to (Fossil = "The Fossil Tree", Arches = "Carsaig Arches").
        list = new ArrayList<>();
        list.add(new GeoExcursion("The Fossil Tree", "This 15 mile there and back again walk will take you to the infamous Fossil Tree on The Burgh in Mull.", geoInfoListFossil, wayPointListFossil, excursionTypeFossil, false));
        list.add(new GeoExcursion("The Carsaig Arches", "The Carsaig Arches, sea stacks made of basalt, await you at the turning point of a full day there and back again walk.", geoInfoListArches, wayPointListArches, excursionTypeArches, false));
        list.add(new GeoExcursion("The Wilderness", "A shorter version of The Fossil Tree walk, explore raised beaches and a volcanic vent.", geoInfoListArches, wayPointListArches, excursionTypeArches, false));
        list.add(new GeoExcursion("Ben More", "Mull's only Munro, a full day strenuous hike over rough terrain with reward views", geoInfoListArches, wayPointListArches, excursionTypeArches, false));

        return list;
    }




}
