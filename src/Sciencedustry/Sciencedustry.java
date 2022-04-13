package Sciencedustry;

import arc.Events;
import arc.util.Time;
import mindustry.Vars;
import mindustry.game.EventType.*;
import mindustry.mod.Mod;

import Sciencedustry.content.ModLoader;
import mindustry.mod.Mods;
import mindustry.ui.dialogs.*;

import static arc.util.OS.env;

public class Sciencedustry extends Mod {

    public static final String MOD_NAME = "sciencedustry";
    public static Mods.LoadedMod MOD;

    public static String name(String name){
        return MOD_NAME + "-" + name;
    }

    public Sciencedustry(){
        Events.on(ClientLoadEvent.class, e -> {
        });
    }

    @Override
    public void init(){
    }

    @Override
    public void loadContent(){
        MOD = Vars.mods.getMod(getClass());
        new ModLoader().load();
    }


}