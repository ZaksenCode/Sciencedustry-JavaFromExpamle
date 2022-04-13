package Sciencedustry.content;

import arc.graphics.Color;
import mindustry.content.StatusEffects;
import mindustry.ctype.ContentList;
import mindustry.type.Liquid;
import mindustry.type.StatusEffect;

import static mindustry.content.StatusEffects.*;

public class SCLiquids implements ContentList {

    public static Liquid
        ElectrifiedWater,
        RadioactiveWater,
        LiquefiedIron
    ;

    @Override
    public void load() {
        ElectrifiedWater = new Liquid("electrified-water"){{
            temperature = 0.6f;
            flammability = 0.1f;
            viscosity = 0.5f;
            heatCapacity = 0.3f;
            explosiveness = 0.1f;
            effect = electrified;
            color = Color.valueOf("3bb5d1");
        }};
        RadioactiveWater = new Liquid("radioactive-water"){{
            temperature = 0.7f;
            flammability = 0.2f;
            viscosity = 0.4f;
            heatCapacity = 0.6f;
            explosiveness = 0.2f;
            effect = melting;
            color = Color.valueOf("ab5cbf");
        }};
        LiquefiedIron = new Liquid("liquefied-iron"){{
            temperature = 1f;
            flammability = 0.3f;
            viscosity = 0.7f;
            effect = melting;
            color = Color.valueOf("949494");
        }};
    }
}
