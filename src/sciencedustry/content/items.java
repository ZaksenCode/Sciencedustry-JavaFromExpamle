package sciencedustry.content;

import mindustry.type.Item;

public class items{

    public static Item
            nurgum,
            nurgumiumAlloy,
            saccharite;

    public static void load(){
        nurgum = new Item("nurgum"){{
            cost = 3.0f;
            description = "Jewel created by washing silicon";
        }};
        nurgumiumAlloy = new Item("nurgumium-alloy"){{
           cost = 5.0f;
           explosiveness = 0.5f;
           flammability = 0.4f;
            description = "Explosive";
        }};
        saccharite = new Item("saccharite"){{
           cost = 2.0f;
           radioactivity = 0.3f;
           description = "Mineral formed by the combination of parts of a meteorite with glucose";
        }};
    }
}
