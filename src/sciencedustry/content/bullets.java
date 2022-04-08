package sciencedustry.content;

import arc.Core;
import arc.graphics.Blending;
import arc.graphics.Color;
import arc.graphics.g2d.Draw;
import arc.graphics.g2d.Fill;
import arc.graphics.g2d.Lines;
import arc.math.Angles;
import arc.math.Interp;
import arc.math.Mathf;
import arc.math.geom.Vec2;
import arc.util.Time;
import arc.util.Tmp;
import mindustry.Vars;
import mindustry.content.Bullets;
import mindustry.content.Fx;
import mindustry.content.Items;
import mindustry.content.StatusEffects;
import mindustry.ctype.ContentList;
import mindustry.entities.Damage;
import mindustry.entities.Effect;
import mindustry.entities.Lightning;
import mindustry.entities.Units;
import mindustry.entities.bullet.*;
import mindustry.game.Team;
import mindustry.gen.*;
import mindustry.graphics.Drawf;
import mindustry.graphics.Layer;
import mindustry.graphics.Pal;
import mindustry.graphics.Trail;

import static arc.graphics.g2d.Draw.color;
import static arc.graphics.g2d.Lines.*;
import static arc.math.Angles.randLenVectors;
import static mindustry.Vars.headless;
import static mindustry.content.Fx.*;
import static sciencedustry.content.liquids.ElectrifiedWater;

public class bullets implements ContentList{

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
