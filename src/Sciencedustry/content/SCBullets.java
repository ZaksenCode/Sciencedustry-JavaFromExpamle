package Sciencedustry.content;

import mindustry.ctype.ContentList;
import mindustry.entities.bullet.*;
import static mindustry.content.Fx.*;
import static Sciencedustry.content.SCLiquids.ElectrifiedWater;

public class SCBullets implements ContentList {

    public static BulletType
            NurgumBullet,
            NurgumiumAlloyBullet;

    public static LiquidBulletType
            ElectrifiedWaterBullet;

    @Override
    public void load() {
        NurgumBullet = new BulletType(10f, 12f){{
            lifetime = 10f;
            shootEffect = shootSmall;
            smokeEffect = smoke;
            hitEffect = hitLaser;
        }};
        NurgumiumAlloyBullet = new BulletType(13f, 20f){{
            lifetime = 15f;
            shootEffect = shootSmall;
            smokeEffect = smoke;
            hitEffect = hitLaser;
        }};
        ElectrifiedWaterBullet = new LiquidBulletType(ElectrifiedWater){{
            damage = 5;
            speed = 35;
            lifetime = 320;
            drag = 0.15f;
            orbSize = 4;
        }};
    }
}
