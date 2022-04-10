package Sciencedustry.content;

import mindustry.ctype.ContentList;
import mindustry.game.Gamemode;
import mindustry.type.SectorPreset;

public class SCSectors implements ContentList {

    public static SectorPreset
            sacchariteDeltas;

    @Override
    public void load() {
        sacchariteDeltas = new SectorPreset("saccharite-deltas", SCPlantes.blontux, 15){{
            alwaysUnlocked = true;
            addStartingItems = true;
            difficulty = 3;
            useAI = true;
            startWaveTimeMultiplier = 3.5f;
            rules = rules -> rules.attackMode = true;
        }};
    }
}