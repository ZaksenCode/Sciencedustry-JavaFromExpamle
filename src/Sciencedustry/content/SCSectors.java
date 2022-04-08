package Sciencedustry.content;

import mindustry.ctype.ContentList;
import mindustry.type.SectorPreset;

public class SCSectors implements ContentList {

    public static SectorPreset
            sacchariteDeltas;

    @Override
    public void load() {
        sacchariteDeltas = new SectorPreset("saccharite-deltas", SCPlantes.blontux, 15){{
            alwaysUnlocked = true;
            addStartingItems = true;
            captureWave = 20;
            difficulty = 3;
        }};
    }
}