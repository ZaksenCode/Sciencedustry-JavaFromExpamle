package sciencedustry.content;

import arc.graphics.Color;
import mindustry.ctype.ContentList;
import mindustry.entities.bullet.LaserBoltBulletType;
import mindustry.type.Category;
import mindustry.type.ItemStack;
import mindustry.type.LiquidStack;
import mindustry.world.Block;
import mindustry.world.blocks.defense.Wall;
import mindustry.world.blocks.defense.turrets.ItemTurret;
import mindustry.world.blocks.defense.turrets.LiquidTurret;
import mindustry.world.blocks.defense.turrets.PowerTurret;
import mindustry.world.blocks.production.GenericCrafter;
import mindustry.world.meta.BuildVisibility;

import static mindustry.content.Bullets.*;
import static mindustry.content.Fx.smokeCloud;
import static mindustry.content.Items.*;
import static mindustry.content.Liquids.*;
import static mindustry.type.ItemStack.with;
import static sciencedustry.content.bullets.*;
import static sciencedustry.content.items.*;
import static sciencedustry.content.liquids.ElectrifiedWater;

public class blocks implements ContentList {
    public static Block

    //turrets
            degree,
            equation,
            radical,
            spray,
            sprayLarge,
            sprayHuge,
    //walls
            nurgumWall,
            nurgumWallLarge,
            nurgumiumWall,
            nurgumiumWallLarge,
            mixedWall,
            mixedWallLarge,
    //crafting
            electrifiedWaterMixer,
            solvent,
            nurgumiumAlloyMixer,
            nurgumMixer,
    //conveyors
            nurgumConveyor,
            nurgumiumAlloyConveyor,
    //ores, floors & env
            sacchariteFloor,
            sacchariteWall,
            sacchariteOre,
    //machines
            nurgumiumAlloyLaunchpad
            ;

    public blocks(){

    }

    @Override
    public void load(){
        degree = new ItemTurret("degree") {{
            range = 115;
            rotateSpeed = 4.2f;
            reloadTime = 35;
            maxAmmo = 40;
            size = 2;
            ammoPerShot = 2;
            inaccuracy = 0.1f;
            velocityInaccuracy = 0.1f;
            shots = 1;
            destructible = true;
            health = 400;
            shootCone = 5;
            requirements(Category.turret, BuildVisibility.shown, with(nurgum, 40, lead, 25, silicon, 80));
            ammo(
                    nurgum, NurgumBullet,
                    nurgumiumAlloy, NurgumiumAlloyBullet
            );
        }};
        equation = new PowerTurret("equation") {{
            range = 180;
            rotateSpeed = 3.0f;
            reloadTime = 40.0f;
            inaccuracy = 0.3f;
            velocityInaccuracy = 0.1f;
            shots = 2;
            destructible = true;
            health = 500;
            shootCone = 6;
            size = 2;
            powerUse = 0.85f;
            requirements(Category.turret, BuildVisibility.shown, with(nurgumiumAlloy, 150, lead, 100, silicon, 50));
            shootType = new LaserBoltBulletType(10f, 22f){{
                collidesTeam = true;
                healPercent = 3;
                lifetime = 20;
                frontColor = Color.valueOf("ffffff");
                backColor = Color.valueOf("83f793");
            }};
        }};
        radical = new ItemTurret("radical") {{
            range = 77;
            rotateSpeed = 4.2f;
            reloadTime = 30;
            maxAmmo = 40;
            ammoPerShot = 2;
            inaccuracy = 0.1f;
            velocityInaccuracy = 0.1f;
            shots = 2;
            destructible = true;
            health = 300;
            shootCone = 5;
            requirements(Category.turret, BuildVisibility.shown, with(nurgum, 25, lead, 40, silicon, 50));
        }};
        spray = new LiquidTurret("spray") {{
            size = 1;
            range = 120;
            health = 250;
            reloadTime = 10;
            shots = 2;
            inaccuracy = 0.2f;
            velocityInaccuracy = 0.2f;
            category = Category.turret;
            requirements(Category.turret, BuildVisibility.shown, with(saccharite, 10, lead, 25, silicon, 50));
            ammo(
                    ElectrifiedWater, ElectrifiedWaterBullet,
                    water , waterShot,
                    slag , slagShot,
                    oil, oilShot
            );
        }};
        sprayLarge = new LiquidTurret("spray-large"){{
            size = 2;
            range = 200;
            health = 400;
            reloadTime = 12;
            shots = 2;
            inaccuracy = 0.3f;
            velocityInaccuracy = 0.2f;
            requirements(Category.turret, BuildVisibility.shown, with(saccharite, 50, lead, 125, silicon, 80));
            category = Category.turret;
            ammo(
                    ElectrifiedWater, ElectrifiedWaterBullet,
                    water, waterShot,
                    slag, slagShot,
                    oil, oilShot
            );
        }};
        sprayHuge = new LiquidTurret("spray-huge"){{
            size = 3;
            range = 300;
            health = 1000;
            reloadTime = 15;
            shots = 3;
            inaccuracy = 0.5f;
            velocityInaccuracy = 0.3f;
            requirements(Category.turret, BuildVisibility.shown, with(saccharite, 150, lead, 180, silicon, 250));
            category = Category.turret;
            ammo(
                    ElectrifiedWater, ElectrifiedWaterBullet,
                    water, waterShot,
                    slag, slagShot,
                    oil, oilShot
            );
        }};
        nurgumWall = new Wall("nurgum-wall"){{
            destructible = true;
            health = 937;
            solid = true;
            breakable = true;
            requirements(Category.defense, BuildVisibility.shown, with(nurgum, 6));
        }};
        nurgumWallLarge = new Wall("nurgum-wall-large"){{
            destructible = true;
            size = 2;
            health = 2465;
            solid = true;
            breakable = true;
            requirements(Category.defense, BuildVisibility.shown, with(nurgum, 24));
        }};
        nurgumiumWall = new Wall("nurgumium-alloy-wall"){{
            destructible = true;
            health = 2104;
            solid = true;
            baseExplosiveness = 40;
            breakable = true;
            requirements(Category.defense, BuildVisibility.shown, with(nurgumiumAlloy, 3, blastCompound, 3));
        }};
        nurgumiumWallLarge = new Wall("nurgumium-alloy-wall-large"){{
            destructible = true;
            health = 7301;
            solid = true;
            size = 2;
            baseExplosiveness = 80;
            breakable = true;
            requirements(Category.defense, BuildVisibility.shown, with(nurgumiumAlloy, 12, blastCompound, 12));
        }};
        mixedWall = new Wall("mixed-wall"){{
            destructible = true;
            health = 1538;
            solid = true;
            baseExplosiveness = 25;
            breakable = true;
            requirements(Category.defense, BuildVisibility.shown, with(nurgumiumAlloy, 3, nurgum, 3));
        }};
        mixedWallLarge = new Wall("mixed-wall-large"){{
            destructible = true;
            health = 4987;
            solid = true;
            baseExplosiveness = 55;
            breakable = true;
            requirements(Category.defense, BuildVisibility.shown, with(nurgumiumAlloy, 12, nurgum, 12));
        }};
        electrifiedWaterMixer = new GenericCrafter("electrified-water-mixer"){{
            destructible = true;
            health = 150;
            solid = true;
            breakable = true;
            craftTime = 50.0f;
            size = 2;
            hasItems = true;
            hasLiquids = true;
            hasPower = true;
            itemCapacity = 20;
            liquidCapacity = 100;
            craftEffect = smokeCloud;
            requirements(Category.crafting, BuildVisibility.shown, with(titanium, 15, lead, 100, silicon, 30));
            outputLiquid = new LiquidStack(ElectrifiedWater, 24);
            consumes.power(5);
            consumes.liquid(water, 0.4f);
        }};
        solvent = new GenericCrafter("solvent"){{
            destructible = true;
            health = 150;
            solid = true;
            breakable = true;
            craftTime = 100.0f;
            size = 1;
            hasItems = true;
            hasLiquids = true;
            hasPower = true;
            itemCapacity = 20;
            liquidCapacity = 100;
            craftEffect = smokeCloud;
            consumes.power(0.5f);
            consumes.item(saccharite, 4);
            consumes.liquid(water, 0.4f);
            requirements(Category.crafting, BuildVisibility.shown, with(saccharite, 50, lead, 50, silicon, 25));
            outputItem = new ItemStack(silicon, 1);
        }};
    }
}
