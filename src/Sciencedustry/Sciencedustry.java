package Sciencedustry;

import arc.Events;
import arc.util.Time;
import mindustry.game.EventType.*;
import mindustry.mod.Mod;

import Sciencedustry.content.ModLoader;
import mindustry.ui.dialogs.*;

public class Sciencedustry extends Mod {
    public Sciencedustry(){
        Events.on(ClientLoadEvent.class, e -> {
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