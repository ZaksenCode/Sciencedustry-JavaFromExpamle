package Sciencedustry.content;

import mindustry.ctype.ContentList;

public class ModLoader {
    private final ContentList[] contents = {
            new items(),
            new statusEffects(),
            new liquids(),
            new bullets(),
            new blocks(),
            new techTree()
    };

    public void load(){
        for(ContentList list : contents){
            list.load();
        }
    }
}
