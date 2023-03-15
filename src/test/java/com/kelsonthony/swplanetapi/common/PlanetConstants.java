package com.kelsonthony.swplanetapi.common;

import com.kelsonthony.swplanetapi.domain.model.Planet;

import java.util.ArrayList;
import java.util.List;

public class PlanetConstants {
    public static final Planet PLANET = new Planet("name", "climate", "terrain");
    public static final Planet PLANET2 = new Planet("climate", "terrain");
    public static final Planet INVALID_PLANET = new Planet("", "", "");
    public static final Planet TATTOINE = new Planet(1L, "Tatooine", "arid", "desert");
    public static final Planet ALDERAAN = new Planet(2L, "Alderaan", "temperate", "gresslands");
    public static final Planet YAVINIV = new Planet(3L, "Yavin IV", "temperate", "rocks");

    public static final List<Planet> PLANETS = new ArrayList<>(){
        {
            add(TATTOINE);
            add(ALDERAAN);
            add(YAVINIV);
        }
    };
}
