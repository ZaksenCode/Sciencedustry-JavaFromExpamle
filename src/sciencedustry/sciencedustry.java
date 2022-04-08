package sciencedustry;

import mindustry.mod.*;
import sciencedustry.content.ModLoader;

public class sciencedustry extends Mod{



    @Override
    public void init(){
    }

    @Override
    public void loadContent(){
        new ModLoader().load();
    }
}