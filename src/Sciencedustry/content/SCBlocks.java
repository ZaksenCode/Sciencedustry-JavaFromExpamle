package Sciencedustry.content;

import arc.graphics.Color;
import mindustry.ctype.ContentList;
import mindustry.entities.bullet.LaserBoltBulletType;
import mindustry.type.Category;
import mindustry.type.ItemStack;
import mindustry.type.LiquidStack;
import mindustry.world.Block;
import mindustry.world.blocks.campaign.LaunchPad;
import mindustry.world.blocks.defense.Wall;
import mindustry.world.blocks.defense.turrets.ItemTurret;
import mindustry.world.blocks.defense.turrets.LiquidTurret;
import mindustry.world.blocks.defense.turrets.PowerTurret;
import mindustry.world.blocks.distribution.Conveyor;
import mindustry.world.blocks.environment.Floor;
import mindustry.world.blocks.environment.OreBlock;
import mindustry.world.blocks.power.PowerNode;
import mindustry.world.blocks.production.GenericCrafter;
import mindustry.world.meta.BuildVisibility;

import static mindustry.content.Bullets.*;
import static mindustry.content.Fx.smokeCloud;
import static mindustry.content.Items.*;
import static mindustry.content.Liquids.*;
import static mindustry.type.ItemStack.with;
import static Sciencedustry.content.SCBullets.*;
import static Sciencedustry.content.SCItems.*;
import static Sciencedustry.content.SCLiquids.ElectrifiedWater;
import static mindustry.world.meta.BuildVisibility.editorOnly;

public class SCBlocks implements ContentList {
    public static Block

            degree,
            equation,
            radical,
            spray,
            sprayLarge,
            sprayHuge,

            nurgumWall,
            nurgumWallLarge,
            nurgumiumWall,
            nurgumiumWallLarge,
            mixedWall,
            mixedWallLarge,

            electrifiedWaterMixer,
            solvent,
            nurgumiumAlloyMixer,
            nurgumMixer,
            sacchariteWaterGenerator,

            nurgumConveyor,
            nurgumiumAlloyConveyor,

            sacchariteFloor,
            sacchariteWall,
            sacchariteOre,

            nurgumiumAlloyLaunchPad,
            nurgumPowerNode,
            nurgumiumAlloyPowerNode
            ;

    public SCBlocks(){

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
            size = 2;
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
        nurgumiumAlloyMixer = new GenericCrafter("nurgumium-alloy-mixer"){{
            destructible = true;
            health = 250;
            solid = true;
            breakable = true;
            craftTime = 150.0f;
            size = 3;
            hasItems = true;
            hasLiquids = true;
            hasPower = true;
            itemCapacity = 20;
            liquidCapacity = 100;
            craftEffect = smokeCloud;
            consumes.power(4);
            consumes.items(with(nurgum, 2, sporePod, 2));
            consumes.liquid(slag, 0.3f);
            requirements(Category.crafting, BuildVisibility.shown, with(nurgum, 50, lead, 150, silicon, 80));
            outputItem = new ItemStack(nurgumiumAlloy, 2);
        }};
        nurgumMixer = new GenericCrafter("nurgum-mixer"){{
            destructible = true;
            health = 150;
            solid = true;
            breakable = true;
            craftTime = 180.0f;
            size = 2;
            hasItems = true;
            hasLiquids = true;
            hasPower = true;
            itemCapacity = 20;
            liquidCapacity = 100;
            craftEffect = smokeCloud;
            consumes.power(4);
            consumes.item(silicon, 2);
            consumes.liquid(water, 0.8f);
            requirements(Category.crafting, BuildVisibility.shown, with(copper, 50, lead, 80, silicon, 30));
            outputItem = new ItemStack(nurgum, 1);
        }};
        nurgumConveyor = new Conveyor("nurgum-conveyor"){{
            destructible = true;
            health = 100;
            breakable = true;
            requirements(Category.distribution, BuildVisibility.shown, with(copper, 1, lead, 1, nurgum, 2));
            speed = 0.11f;
            displayedSpeed = 12;
        }};
        nurgumiumAlloyConveyor = new Conveyor("nurgumium-alloy-conveyor"){{
            destructible = true;
            health = 150;
            breakable = true;
            requirements(Category.distribution, BuildVisibility.shown, with(copper, 2, lead, 2, nurgumiumAlloy, 2));
            speed = 0.12f;
            displayedSpeed = 13;
        }};
        sacchariteFloor = new Floor("saccharite-floor"){{
            variants = 3;
            wall = sacchariteWall;
            itemDrop = saccharite;
            playerUnmineable = true;
            speedMultiplier = 1.5f;
            dragMultiplier = 1.2f;
        }};
        sacchariteWall = new Block("saccharite-wall"){{
            solid = true;
            rebuildable = false;
            replaceable = false;
            variants = 2;
            buildVisibility = editorOnly;
        }};
        sacchariteOre = new OreBlock("saccharite-ore"){{
            itemDrop = saccharite;
            oreThreshold = 4;
            oreScale = 60;
            oreDefault = true;
            variants = 3;
        }};
        nurgumiumAlloyLaunchPad = new LaunchPad("nurgumium-alloy-launch-pad"){{
            destructible = true;
            health = 750;
            solid = true;
            size = 3;
            itemCapacity = 85;
            launchTime = 1050;
            breakable = true;
            requirements(Category.effect, BuildVisibility.campaignOnly, with(nurgumiumAlloy, 100, nurgum, 35, silicon, 80, copper, 50));
        }};
        nurgumPowerNode = new PowerNode("nurgum-power-node"){{
            laserRange = 10f;
            maxNodes = 20;
            destructible = true;
            health = 350;
            breakable = true;
            laserColor1 = Color.valueOf("76ed6f");
            laserColor2 = Color.valueOf("4db547");
            size = 2;
            requirements(Category.power, BuildVisibility.shown, with(nurgum, 15, lead, 35, copper, 20));
        }};
        nurgumiumAlloyPowerNode = new PowerNode("nurgumium-alloy-power-node"){{
            laserRange = 12f;
            maxNodes = 20;
            destructible = true;
            health = 500;
            breakable = true;
            laserColor1 = Color.valueOf("57eb99");
            laserColor2 = Color.valueOf("229455");
            size = 2;
            requirements(Category.power, BuildVisibility.shown, with(nurgumiumAlloy, 20, lead, 40, copper, 20));
        }};
        sacchariteWaterGenerator = new GenericCrafter("saccharite-water-generator"){{
            destructible = true;
            health = 200;
            solid = true;
            breakable = true;
            craftTime = 40.0f;
            size = 2;
            hasItems = true;
            hasLiquids = true;
            hasPower = true;
            itemCapacity = 20;
            liquidCapacity = 100;
            craftEffect = smokeCloud;
            consumes.power(3);
            consumes.item(saccharite, 2);
            requirements(Category.crafting, BuildVisibility.shown, with(saccharite, 25, lead, 50, silicon, 30));
            outputLiquid = new LiquidStack(water, 0.4f);
        }};
    }
}
