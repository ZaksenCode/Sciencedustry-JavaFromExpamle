package sciencedustry.content;

import arc.graphics.Color;
import mindustry.ctype.ContentList;
import mindustry.type.Liquid;

import static mindustry.content.StatusEffects.electrified;

public class liquids{

    public static Liquid
        ElectrifiedWater;

    public static void load() {
        ElectrifiedWater = new Liquid("electrified-water"){{
            temperature = 0.6f;
            flammability = 0.1f;
            viscosity = 0.5f;
            heatCapacity = 0.3f;
            explosiveness = 0.1f;
            effect = electrified;
            color = Color.valueOf("3bb5d1");
        }};
    }
}
