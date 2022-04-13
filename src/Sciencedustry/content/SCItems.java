package Sciencedustry.content;

import arc.graphics.Color;
import mindustry.ctype.ContentList;
import mindustry.type.Item;


public class SCItems implements ContentList {

    public static Item
            nurgum,
            nurgumiumAlloy,
            saccharite,
            purpleSand,
            obsidian,
            iron,
            rawIron,
            gravel,
            quartz
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
           cost = 1.0f;
           radioactivity = 0.3f;
           description = "Mineral formed by the combination of parts of a meteorite with glucose";
        }};
        purpleSand = new Item("purple-sand", Color.valueOf("af2fcc")){{
            cost = 2.2f;
            radioactivity = 0.4f;
            flammability = 0.1f;
        }};
        obsidian = new Item("obsidian", Color.valueOf("171717")){{
            cost = 6f;
        }};
        iron = new Item("iron", Color.valueOf("8a8a8a")){{
            cost = 4f;
        }};
        rawIron = new Item("raw-iron", Color.valueOf("9e9e9e")){{
            cost = 2f;
        }};
        gravel = new Item("gravel", Color.valueOf("363636")){{
            cost = 1.5f;
        }};
        quartz = new Item("quartz", Color.valueOf("ad9e9e")){{
            cost = 2.5f;
        }};
    }
}
