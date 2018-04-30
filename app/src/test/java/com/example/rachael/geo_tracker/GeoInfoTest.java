package com.example.rachael.geo_tracker;

import com.example.rachael.geo_tracker.Models.GeoInfo;
import com.example.rachael.geo_tracker.Models.WayPoints;
import com.example.rachael.geo_tracker.Types.EraType;
import com.example.rachael.geo_tracker.Types.RockType;

import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.assertEquals;

public class GeoInfoTest {

    GeoInfo geoInfo1;
    WayPoints waypoint1;
    RockType rocktype1;
    RockType rocktype2;
    ArrayList<RockType> rockList;
    EraType eraType1;
    ArrayList<EraType> eraList;

    @Before
    public void before(){
        rocktype1 = RockType.BASALT;
        rocktype2 = RockType.SANDSTONE;

        rockList = new ArrayList<RockType>();
        rockList.add(rocktype1);
        rockList.add(rocktype2);

        eraType1 = EraType.PALAEOGENE;
        eraList = new ArrayList<EraType>();
        eraList.add(eraType1);

        geoInfo1 = new GeoInfo(eraList, rockList);

        waypoint1 = new WayPoints("Turn left at the fallen boulder");

    }

    @Test
    public void eraExists(){
        assertEquals("Palaeogene", eraList.get(0).getGeologyPeriod());
    }

    @Test
    public void geoInfoEraInfo(){
        assertEquals("Palaeogene", geoInfo1.getEraTypes().get(0).getGeologyPeriod());
    }

    @Test
    public void geoInfoHasRockTypes(){
        assertEquals(2, geoInfo1.getRockTypes().size());
    }

    @Test
    public void geoInfoRockTypeHasType(){
        assertEquals("Basalt", geoInfo1.getRockTypes().get(0).getRockType());
    }

    @Test
    public void wayPointHasDescription(){
        assertEquals("Turn left at the fallen boulder", waypoint1.getDescription());
    }




}
