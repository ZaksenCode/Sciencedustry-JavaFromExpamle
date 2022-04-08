package Sciencedustry;

import mindustry.mod.*;
import Sciencedustry.content.ModLoader;

public class sciencedustry extends Mod{

    public sciencedustry()
    {

    }


    @Override
    public void init(){
    }

    @Override
    public void loadContent(){
        new ModLoader().load();
    }
}