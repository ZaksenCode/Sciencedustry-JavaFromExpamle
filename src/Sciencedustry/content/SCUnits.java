package Sciencedustry.content;

import mindustry.ai.types.BuilderAI;
import mindustry.ai.types.FlyingAI;
import mindustry.content.Fx;
import mindustry.content.UnitTypes;
import mindustry.ctype.ContentList;
import mindustry.gen.EntityMapping;
import mindustry.gen.Flyingc;
import mindustry.type.UnitType;
import mindustry.type.Weapon;
import Sciencedustry.Sciencedustry;

import static Sciencedustry.content.SCBullets.QuartzBullet;

public class SCUnits implements ContentList {
    public static UnitType fly;

    static{
        EntityMapping.nameMap.put(Sciencedustry.name("fly"), EntityMapping.idMap[20]);
    }

    @Override
    public void load() {
        fly = new UnitType("fly"){{
            defaultController = BuilderAI::new;
            isCounted = false;

            flying = true;
            mineSpeed = 7f;
            mineTier = 1;
            buildSpeed = 0.8f;
            drag = 0.05f;
            speed = 3.3f;
            rotateSpeed = 17f;
            accel = 0.1f;
            itemCapacity = 50;
            health = 150f;
            engineOffset = 6f;
            hitSize = 9f;
            rotateShooting = false;
            lowAltitude = true;
            commandLimit = 5;
            alwaysUnlocked = true;

            weapons.add(new Weapon("fly-weapon"){{
                top = false;
                rotate = true;
                reload = 25f;
                shotDelay = 5f;
                shots = 1;
                x = 3f;
                y = 0.5f;
                rotateSpeed = 17f;
                bullet = QuartzBullet;
                spacing = 0f;
                ejectEffect = Fx.casing1;
            }});
        }};
    }
}
