package Sciencedustry.content;

import arc.graphics.Color;
import mindustry.ctype.ContentList;
import mindustry.type.Item;


public class SCItems implements ContentList {

    public static Item
            nurgum,
            nurgumiumAlloy,
            saccharite,
            purpleSand
                    ;

    @Override
    public void load(){
        nurgum = new Item("nurgum", Color.valueOf("5dde5b")){{
            cost = 3.0f;
            description = "Jewel created by washing silicon";
        }};
        nurgumiumAlloy = new Item("nurgumium-alloy", Color.valueOf("91d9b7")){{
           cost = 5.0f;
           explosiveness = 0.5f;
           flammability = 0.4f;
            description = "Explosive";
        }};
        saccharite = new Item("saccharite", Color.valueOf("ededed")){{
           cost = 2.0f;
           radioactivity = 0.3f;
           description = "Mineral formed by the combination of parts of a meteorite with glucose";
        }};
        purpleSand = new Item("purple-sand", Color.valueOf("af2fcc")){{
            cost = 2.2f;
            radioactivity = 0.4f;
            flammability = 0.1f;
        }};
    }
}
