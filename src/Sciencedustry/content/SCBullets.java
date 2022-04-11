package Sciencedustry.content;

import mindustry.ctype.ContentList;
import mindustry.entities.bullet.*;

import static Sciencedustry.content.SCLiquids.RadioactiveWater;
import static mindustry.content.Fx.*;
import static Sciencedustry.content.SCLiquids.ElectrifiedWater;

public class SCBullets implements ContentList {

    public static BulletType
            NurgumBullet,
            NurgumiumAlloyBullet,
            SacchariteBullet,
            RawIronBullet,
            QuartzBullet;

    public static LiquidBulletType
            ElectrifiedWaterBullet,
            RadioactiveWaterBullet;

    @Override
    public void load() {
        NurgumBullet = new BulletType(10f, 12f){{
            lifetime = 10f;
            shootEffect = shootSmall;
            smokeEffect = smoke;
            hitEffect = hitLaser;
            drawSize = 2f;
        }};
        NurgumiumAlloyBullet = new BulletType(13f, 20f){{
            lifetime = 15f;
            shootEffect = shootSmall;
            smokeEffect = smoke;
            hitEffect = hitLaser;
            drawSize = 2f;
        }};
        SacchariteBullet = new BulletType(12f, 10f){{
            lifetime = 18f;
            shootEffect = shootSmall;
            smokeEffect = smoke;
            hitEffect = hitBulletSmall;
            drawSize = 2f;
        }};
        RawIronBullet = new BulletType(15f, 14f){{
            lifetime = 20f;
            shootEffect = shootSmall;
            smokeEffect = smoke;
            hitEffect = hitBulletSmall;
            drawSize = 2f;
        }};
        QuartzBullet = new BulletType(13f, 15f){{
            lifetime = 20f;
            shootEffect = shootSmall;
            smokeEffect = smoke;
            hitEffect = hitBulletSmall;
            drawSize = 2f;
        }};
        ElectrifiedWaterBullet = new LiquidBulletType(ElectrifiedWater){{
            damage = 5;
            speed = 35;
            lifetime = 280;
            drag = 0.15f;
            orbSize = 4;
        }};
        RadioactiveWaterBullet = new LiquidBulletType(RadioactiveWater){{
            damage = 4;
            speed = 30;
            lifetime = 280;
            drag = 0.15f;
            orbSize = 3;
        }};
    }
}
