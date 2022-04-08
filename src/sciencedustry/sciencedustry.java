package sciencedustry;

import mindustry.ctype.ContentList;
import sciencedustry.content.blocks;
import arc.*;
import arc.util.*;
import mindustry.*;
import mindustry.content.*;
import mindustry.game.EventType.*;
import mindustry.gen.*;
import mindustry.mod.*;
import mindustry.ui.dialogs.*;
import sciencedustry.content.bullets;
import sciencedustry.content.items;
import sciencedustry.content.liquids;

public class sciencedustry extends Mod{

    @Override
    public void init(){
    }

    @Override
    public void loadContent(){
        items.load();
        liquids.load();
        bullets.load();
        blocks.load();
    }
}