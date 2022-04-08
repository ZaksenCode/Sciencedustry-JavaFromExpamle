package Sciencedustry.core;

import arc.Events;
import mindustry.mod.*;
import Sciencedustry.content.ModLoader;
import mindustry.game.EventType.*;

public class Main extends Mod{

    public Main()
    {
        Events.on(ContentInitEvent.class, e -> {
        });
    }


    @Override
    public void init(){
    }

    @Override
    public void loadContent(){
        new ModLoader().load();
    }
}