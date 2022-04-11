package Sciencedustry.content;

import Sciencedustry.content.planets.BlontuxPlanetGenerator;
import arc.graphics.Color;
import mindustry.content.Planets;
import mindustry.ctype.ContentList;
import mindustry.graphics.g3d.HexMesh;
import mindustry.maps.planet.SerpuloPlanetGenerator;
import mindustry.type.Planet;

public class SCPlantes implements ContentList {

    public static Planet
            blontux;

    @Override
    public void load() {
        blontux = new Planet("blontux", Planets.sun, 1f, 3){{
            generator = new BlontuxPlanetGenerator();
            meshLoader = () -> new HexMesh(this, 6);
            atmosphereColor = Color.valueOf("6BFF92");
            atmosphereRadIn = 0.03f;
            atmosphereRadOut = 0.4f;
            startSector = 7;
            accessible = true;
            visible = true;
            hasAtmosphere = true;
            bloom = false;
            alwaysUnlocked = true;
        }};
    }
}