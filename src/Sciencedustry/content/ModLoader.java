package Sciencedustry.content;

import mindustry.ctype.ContentList;

public class ModLoader implements ContentList{
    private final ContentList[] contents = {
            new SCItems(),
            new SCStatusEffects(),
            new SCLiquids(),
            new SCBullets(),
            new SCBlocks(),
            new SCTechTree(),
            new SCPlantes(),
            new SCSectors()
    };

    public void load(){
        for(ContentList list : contents){
            list.load();
        }
    }
}