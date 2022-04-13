package Sciencedustry.content;

import arc.graphics.Color;
import mindustry.content.Fx;
import mindustry.content.Items;
import mindustry.content.Liquids;
import mindustry.ctype.ContentList;
import mindustry.entities.bullet.LaserBoltBulletType;
import mindustry.gen.Sounds;
import mindustry.gen.Unit;
import mindustry.gen.UnitEntity;
import mindustry.type.Category;
import mindustry.type.ItemStack;
import mindustry.type.LiquidStack;
import mindustry.type.UnitType;
import mindustry.world.Block;
import mindustry.world.blocks.campaign.LaunchPad;
import mindustry.world.blocks.defense.MendProjector;
import mindustry.world.blocks.defense.Wall;
import mindustry.world.blocks.defense.turrets.ItemTurret;
import mindustry.world.blocks.defense.turrets.LiquidTurret;
import mindustry.world.blocks.defense.turrets.PowerTurret;
import mindustry.world.blocks.distribution.BufferedItemBridge;
import mindustry.world.blocks.distribution.Conveyor;
import mindustry.world.blocks.distribution.ItemBridge;
import mindustry.world.blocks.environment.Floor;
import mindustry.world.blocks.environment.OreBlock;
import mindustry.world.blocks.liquid.Conduit;
import mindustry.world.blocks.liquid.LiquidBridge;
import mindustry.world.blocks.liquid.LiquidJunction;
import mindustry.world.blocks.liquid.LiquidRouter;
import mindustry.world.blocks.power.Battery;
import mindustry.world.blocks.power.PowerNode;
import mindustry.world.blocks.power.SolarGenerator;
import mindustry.world.blocks.production.Drill;
import mindustry.world.blocks.production.GenericCrafter;
import mindustry.world.blocks.production.Pump;
import mindustry.world.blocks.storage.CoreBlock;
import mindustry.world.meta.Attribute;
import mindustry.world.meta.BuildVisibility;
import Sciencedustry.content.SCUnits.*;

import static Sciencedustry.content.SCLiquids.*;
import static Sciencedustry.content.SCUnits.fly;
import static mindustry.content.Blocks.basalt;
import static mindustry.content.Bullets.*;
import static mindustry.content.Fx.dropItem;
import static mindustry.content.Fx.smokeCloud;
import static mindustry.content.Items.*;
import static mindustry.content.Liquids.*;
import static mindustry.type.ItemStack.with;
import static Sciencedustry.content.SCBullets.*;
import static Sciencedustry.content.SCItems.*;
import static mindustry.world.meta.BuildVisibility.editorOnly;

public class SCBlocks implements ContentList {
    public static Block

            degree,
            equation,
            radical,
            spray,
            sprayLarge,
            sprayHuge,
            sweetLife,
            diabetes,

            nurgumWall,
            nurgumWallLarge,
            nurgumiumWall,
            nurgumiumWallLarge,
            mixedWall,
            mixedWallLarge,
            obsidianWall,
            obsidianWallLarge,
            sacchariteWall,
            sacchariteWallLarge,

            electrifiedWaterMixer,
            solvent,
            nurgumiumAlloyMixer,
            nurgumMixer,
            sacchariteWaterGenerator, gravelSmelter,
            quartzSolarPanel, quartzSolarPanelLarge,
            quartzPowerNode, quartzConduit, quartzMender,
            quartzBattary, quartzCore, quartzLiquidRouter,
            quartzLiquidJunction, quartzLiquidBridge,
            quartzItemBridge,

            nurgumConveyor,
            nurgumiumAlloyConveyor,
            obsidianConveyor,
            quartzPump,

            sacchariteFloor, sacchariteBlock, coldrock,
            sacchariteOre,
            petrifiedSacchariteFloor, petrifiedSacchariteWall, petrifiedSacchariteWallLarge,
            purpleSandFloor, purpleSandWater, darkPurpleSandFloor, purpleSandWall,
            radioactiveWaterFloor, deepRadioactiveWater,
            obsidianFloor, obsidianBlock,
            greenMoss, sporeGreenMoss,
            ironOre,
            gravelFloor,
            greenMossyStone,
            greenMossyStoneWall,
            warmSnow, warmSnowWall,
            blueAsh, blueAshWall,
            quartzOre,

            nurgumiumAlloyLaunchPad,
            nurgumPowerNode,
            nurgumiumAlloyPowerNode,
            ironFortifier,
            ironThinner,
            ironDrill
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
            researchCostMultiplier = 1f;
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
            researchCostMultiplier = 3f;
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
            researchCostMultiplier = 3f;
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
            researchCostMultiplier = 2f;
            requirements(Category.turret, BuildVisibility.shown, with(saccharite, 10, copper, 25));
            ammo(
                    ElectrifiedWater, ElectrifiedWaterBullet,
                    RadioactiveWater, RadioactiveWaterBullet,
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
            researchCostMultiplier = 3f;
            requirements(Category.turret, BuildVisibility.shown, with(saccharite, 50, copper, 125));
            category = Category.turret;
            ammo(
                    ElectrifiedWater, ElectrifiedWaterBullet,
                    RadioactiveWater, RadioactiveWaterBullet,
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
            researchCostMultiplier = 4f;
            requirements(Category.turret, BuildVisibility.shown, with(saccharite, 150, copper, 180));
            category = Category.turret;
            ammo(
                    ElectrifiedWater, ElectrifiedWaterBullet,
                    RadioactiveWater, RadioactiveWaterBullet,
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
            researchCostMultiplier = 2f;
            requirements(Category.defense, BuildVisibility.shown, with(nurgum, 6));
        }};
        nurgumWallLarge = new Wall("nurgum-wall-large"){{
            destructible = true;
            size = 2;
            health = 2465;
            solid = true;
            breakable = true;
            researchCostMultiplier = 2f;
            requirements(Category.defense, BuildVisibility.shown, with(nurgum, 24));
        }};
        nurgumiumWall = new Wall("nurgumium-alloy-wall"){{
            destructible = true;
            health = 2104;
            solid = true;
            baseExplosiveness = 40;
            breakable = true;
            researchCostMultiplier = 2f;
            requirements(Category.defense, BuildVisibility.shown, with(nurgumiumAlloy, 3, blastCompound, 3));
        }};
        nurgumiumWallLarge = new Wall("nurgumium-alloy-wall-large"){{
            destructible = true;
            health = 7301;
            solid = true;
            size = 2;
            baseExplosiveness = 80;
            breakable = true;
            researchCostMultiplier = 2f;
            requirements(Category.defense, BuildVisibility.shown, with(nurgumiumAlloy, 12, blastCompound, 12));
        }};
        mixedWall = new Wall("mixed-wall"){{
            destructible = true;
            health = 1538;
            solid = true;
            baseExplosiveness = 25;
            breakable = true;
            researchCostMultiplier = 2f;
            requirements(Category.defense, BuildVisibility.shown, with(nurgumiumAlloy, 3, nurgum, 3));
        }};
        mixedWallLarge = new Wall("mixed-wall-large"){{
            destructible = true;
            health = 4987;
            solid = true;
            size = 2;
            baseExplosiveness = 55;
            breakable = true;
            researchCostMultiplier = 2f;
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
            researchCostMultiplier = 3f;
            requirements(Category.crafting, BuildVisibility.shown, with(iron, 50, quartz, 100));
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
            researchCostMultiplier = 2f;
            requirements(Category.crafting, BuildVisibility.shown, with(saccharite, 50, quartz, 25, iron, 25));
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
            researchCostMultiplier = 2f;
            requirements(Category.crafting, BuildVisibility.shown, with(nurgum, 50, quartz, 135, iron, 80));
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
            consumes.items(with(saccharite, 2, quartz, 2));
            consumes.liquid(water, 0.5f);
            researchCostMultiplier = 2f;
            requirements(Category.crafting, BuildVisibility.shown, with(copper, 50, saccharite, 80, iron, 30));
            outputItem = new ItemStack(nurgum, 1);
        }};
        nurgumConveyor = new Conveyor("nurgum-conveyor"){{
            destructible = true;
            health = 100;
            breakable = true;
            researchCostMultiplier = 2f;
            requirements(Category.distribution, BuildVisibility.shown, with(copper, 1, saccharite, 1, nurgum, 2));
            speed = 0.11f;
            displayedSpeed = 12;
        }};
        nurgumiumAlloyConveyor = new Conveyor("nurgumium-alloy-conveyor"){{
            destructible = true;
            health = 150;
            breakable = true;
            researchCostMultiplier = 2f;
            requirements(Category.distribution, BuildVisibility.shown, with(copper, 2, saccharite, 2, nurgumiumAlloy, 2));
            speed = 0.12f;
            displayedSpeed = 13;
        }};
        sacchariteFloor = new Floor("saccharite-floor"){{
            variants = 3;
            wall = sacchariteBlock;
            itemDrop = saccharite;
            playerUnmineable = true;
            speedMultiplier = 1.5f;
            dragMultiplier = 1.2f;
            attributes.set(Attribute.water, -0.25f);
        }};
        sacchariteBlock = new Block("saccharite-block"){{
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
            researchCostMultiplier = 3f;
            requirements(Category.effect, BuildVisibility.campaignOnly, with(nurgumiumAlloy, 100, nurgum, 35, copper, 50));
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
            researchCostMultiplier = 3f;
            requirements(Category.power, BuildVisibility.shown, with(nurgum, 15, copper, 20));
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
            researchCostMultiplier = 3f;
            requirements(Category.power, BuildVisibility.shown, with(nurgumiumAlloy, 20, copper, 20));
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
            consumes.item(saccharite, 2);
            researchCostMultiplier = 2f;
            requirements(Category.crafting, BuildVisibility.shown, with(saccharite, 25, quartz, 25));
            outputLiquid = new LiquidStack(water, 20);
        }};
        petrifiedSacchariteFloor = new Floor("petrified-saccharite-floor"){{
            variants = 3;
            wall = petrifiedSacchariteWall;
            playerUnmineable = true;
        }};
        petrifiedSacchariteWall = new Block("petrified-saccharite-wall"){{
            solid = true;
            rebuildable = false;
            replaceable = false;
            variants = 2;
            buildVisibility = editorOnly;
        }};
        petrifiedSacchariteWallLarge = new Block("petrified-saccharite-wall-large"){{
            solid = true;
            rebuildable = false;
            replaceable = false;
            size = 2;
            buildVisibility = editorOnly;
        }};
        purpleSandFloor = new Floor("purple-sand-floor"){{
            variants = 3;
            playerUnmineable = true;
            itemDrop = purpleSand;
            buildVisibility = editorOnly;
            wall = purpleSandWall;
        }};
        purpleSandWall = new Block("purple-sand-wall"){{
            solid = true;
            rebuildable = false;
            replaceable = false;
            size = 1;
            variants = 2;
            buildVisibility = editorOnly;
        }};
        radioactiveWaterFloor = new Floor("radioactive-water-floor"){{
            playerUnmineable = true;
            liquidDrop = RadioactiveWater;
            buildVisibility = editorOnly;
            isLiquid = true;
            shallow = true;
        }};
        deepRadioactiveWater = new Floor("deep-radioactive-water"){{
            playerUnmineable = true;
            buildVisibility = editorOnly;
            liquidDrop = RadioactiveWater;
            drownTime = 512;
            isLiquid = true;
            liquidMultiplier = 1.5f;
        }};
        purpleSandWater = new Floor("purple-sand-water"){{
            playerUnmineable = true;
            buildVisibility = editorOnly;
            isLiquid = true;
            shallow = true;
        }};
        obsidianFloor = new Floor("obsidian-floor"){{
           playerUnmineable = true;
           buildVisibility = editorOnly;
           variants = 3;
           itemDrop = obsidian;
           wall = obsidianBlock;
        }};
        obsidianBlock = new Block("obsidian-block"){{
           variants = 2;
           buildVisibility = editorOnly;
           solid = true;
           rebuildable = false;
           replaceable = false;
        }};
        greenMoss = new Floor("green-moss"){{
           variants = 3;
           playerUnmineable = true;
           buildVisibility = editorOnly;
        }};
        obsidianWall = new Block("obsidian-wall"){{
            destructible = true;
            health = 2500;
            solid = true;
            breakable = true;
            researchCostMultiplier = 3f;
            requirements(Category.defense, BuildVisibility.shown, with(obsidian, 10));
        }};
        obsidianWallLarge = new Block("obsidian-wall-large"){{
            destructible = true;
            health = 8000;
            solid = true;
            breakable = true;
            size = 2;
            researchCostMultiplier = 3f;
            requirements(Category.defense, BuildVisibility.shown, with(obsidian, 30));
        }};
        ironFortifier = new GenericCrafter("iron-fortifier"){{
            hasItems = true;
            hasLiquids = true;
            craftEffect = smokeCloud;
            destructible = true;
            health = 750;
            solid = true;
            breakable = true;
            size = 2;
            researchCostMultiplier = 0.5f;
            craftTime = 35f;
            requirements(Category.crafting, BuildVisibility.shown, with(copper, 70, saccharite, 80));
            consumes.liquid(LiquefiedIron, 0.2f);
            outputItem = new ItemStack(iron, 1);
            liquidCapacity = 50f;
            itemCapacity = 20;
        }};
        ironThinner = new GenericCrafter("iron-thinner"){{
            hasItems = true;
            hasLiquids = true;
            craftEffect = smokeCloud;
            destructible = true;
            health = 750;
            solid = true;
            breakable = true;
            size = 3;
            researchCostMultiplier = 0.5f;
            craftTime = 30f;
            requirements(Category.crafting, BuildVisibility.shown, with(copper, 100, saccharite, 50));
            consumes.liquid(water, 0.2f);
            consumes.item(rawIron, 1);
            outputLiquid = new LiquidStack(LiquefiedIron, 6);
            liquidCapacity = 50f;
            itemCapacity = 20;
        }};
        obsidianConveyor = new Conveyor("obsidian-conveyor"){{
            researchCostMultiplier = 2f;
            requirements(Category.distribution, with(obsidian, 3));
            health = 500;
            speed = 0.09f;
            displayedSpeed = 11.5f;
        }};
        ironOre = new OreBlock("iron-ore"){{
           variants = 3;
           itemDrop = rawIron;
           playerUnmineable = false;
           oreThreshold = 2;
           oreScale = 40;
           buildVisibility = editorOnly;
        }};
        ironDrill = new Drill("iron-drill"){{
            tier = 3;
            drillTime = 400;
            health = 200;
            solid = true;
            breakable = true;
            researchCostMultiplier = 2f;
            size = 2;
            requirements(Category.production, with(iron, 10, copper, 20));
            consumes.liquid(Liquids.water, 0.06f).boost();
        }};
        gravelFloor = new OreBlock("gravel-floor"){{
            variants = 2;
            playerUnmineable = true;
            oreThreshold = 35;
            oreScale = 1.2f;
            buildVisibility = editorOnly;
            itemDrop = gravel;
        }};
        greenMossyStone = new Floor("green-mossy-stone"){{
            variants = 3;
            playerUnmineable = true;
            buildVisibility = editorOnly;
            wall = greenMossyStoneWall;
        }};
        greenMossyStoneWall = new Block("green-mossy-stone-wall"){{
            variants = 2;
            buildVisibility = editorOnly;
            solid = true;
            rebuildable = false;
            replaceable = false;
        }};
        warmSnow = new Floor("warm-snow"){{
            variants = 3;
            playerUnmineable = true;
            buildVisibility = editorOnly;
            wall = warmSnowWall;
        }};
        warmSnowWall = new Block("warm-snow-wall"){{
            variants = 2;
            buildVisibility = editorOnly;
            solid = true;
            rebuildable = false;
            replaceable = false;
        }};
        blueAsh = new Floor("blue-ash"){{
            variants = 3;
            playerUnmineable = true;
            buildVisibility = editorOnly;
            wall = blueAshWall;
        }};
        blueAshWall = new Block("blue-ash-wall"){{
            variants = 2;
            buildVisibility = editorOnly;
            solid = true;
            rebuildable = false;
            replaceable = false;
        }};
        darkPurpleSandFloor = new Floor("dark-purple-sand-floor"){{
            variants = 3;
            playerUnmineable = true;
            itemDrop = purpleSand;
            buildVisibility = editorOnly;
        }};
        coldrock = new Floor("coldrock"){{
            attributes.set(Attribute.heat, 0.5f);
            attributes.set(Attribute.water, -0.5f);
            blendGroup = basalt;

            emitLight = true;
            lightRadius = 30f;
            lightColor = Color.blue.cpy().a(0.15f);
        }};
        sporeGreenMoss = new Floor("spore-green-moss"){{
            variants = 3;
            playerUnmineable = true;
            buildVisibility = editorOnly;
        }};
        sweetLife = new ItemTurret("sweet-life"){{
            spread = 4f;
            shots = 2;
            alternate = true;
            reloadTime = 20f;
            restitution = 0.03f;
            range = 120;
            shootCone = 15f;
            ammoUseEffect = Fx.casing1;
            health = 250;
            inaccuracy = 2f;
            rotateSpeed = 10f;
            alwaysUnlocked = true;
            requirements(Category.turret, BuildVisibility.shown, with(saccharite, 15, copper, 20));
            ammo(
                    saccharite, SacchariteBullet,
                    rawIron, RawIronBullet,
                    quartz, QuartzBullet
            );
        }};
        diabetes = new ItemTurret("diabetes"){{
            reloadTime = 18f;
            range = 240f;
            size = 2;
            burstSpacing = 5f;
            shots = 2;
            targetGround = false;

            recoilAmount = 2f;
            rotateSpeed = 15f;
            inaccuracy = 17f;
            shootCone = 35f;

            health = 500;
            shootSound = Sounds.shootSnap;
            alwaysUnlocked = true;

            limitRange(2);
            requirements(Category.turret, BuildVisibility.shown, with(saccharite, 25, copper, 15));
            ammo(
                    saccharite, SacchariteBullet,
                    rawIron, RawIronBullet,
                    quartz, QuartzBullet
            );
        }};
        quartzOre = new OreBlock("quartz-ore"){{
            variants = 3;
            playerUnmineable = true;
            itemDrop = quartz;
            buildVisibility = editorOnly;
        }};
        sacchariteWall = new Wall("saccharite-wall"){{
            size = 1;
            health = 350;
            requirements(Category.defense, BuildVisibility.shown, with(saccharite, 6));
        }};
        sacchariteWallLarge = new Wall("saccharite-wall-large"){{
            size = 2;
            health = 1300;
            requirements(Category.defense, BuildVisibility.shown, with(saccharite, 24));
        }};
        gravelSmelter = new GenericCrafter("gravel-smelter"){{
            destructible = true;
            health = 250;
            solid = true;
            breakable = true;
            craftTime = 30.0f;
            size = 2;
            hasItems = true;
            hasLiquids = true;
            hasPower = true;
            itemCapacity = 20;
            liquidCapacity = 100;
            craftEffect = smokeCloud;
            researchCostMultiplier = 1.2f;
            requirements(Category.crafting, BuildVisibility.shown, with(saccharite, 20, copper, 25, quartz, 30));
            outputLiquid = new LiquidStack(slag, 10f);
            consumes.power(1);
            consumes.item(gravel, 1);
        }};
        quartzSolarPanel = new SolarGenerator("quartz-solar-panel"){{
            powerProduction = 0.41666f;
            size = 2;
            requirements(Category.power, BuildVisibility.shown, with(saccharite, 20, quartz, 50));
        }};
        quartzSolarPanelLarge = new SolarGenerator("quartz-solar-panel-large"){{
            powerProduction = 1.66666f;
            size = 4;
            requirements(Category.power, BuildVisibility.shown, with(saccharite, 50, quartz, 100));
        }};
        quartzPowerNode = new PowerNode("quartz-power-node"){{
            laserRange = 7f;
            maxNodes = 12;
            requirements(Category.power, with(quartz, 5, saccharite, 5));
            health = 50;
            laserColor1 = Color.valueOf("c7c7c7");
            laserColor2 = Color.valueOf("ababab");
        }};
        quartzConduit = new Conduit("quartz-conduit"){{
            requirements(Category.liquid, with(quartz, 1));
            health = 45;
        }};
        quartzMender = new MendProjector("quartz-mender"){{
            consumes.power(0.3f);
            size = 1;
            reload = 200f;
            range = 50f;
            healPercent = 3f;
            phaseBoost = 5f;
            phaseRangeBoost = 20f;
            health = 100;
            consumes.item(iron).boost();
            requirements(Category.effect, with(quartz, 25, saccharite, 5));
            baseColor = Color.valueOf("c7c7c7");
        }};
        quartzBattary = new Battery("quartz-battery"){{
            consumes.powerBuffered(5000);
            requirements(Category.power, BuildVisibility.shown, with(saccharite, 15, quartz, 35));
            emptyLightColor = Color.valueOf("c7c7c7");
            fullLightColor = Color.valueOf("ababab");
        }};
        quartzPump = new Pump("quartz-pump"){{
            requirements(Category.liquid, with(quartz, 15, saccharite, 10));
            pumpAmount = 8f / 60f;
        }};
        quartzCore = new CoreBlock("quartz-core"){{
            size = 3;
            health = 2000;
            alwaysUnlocked = true;
            itemCapacity = 5000;
            unitCapModifier = 2;
            unitType = fly;
            requirements(Category.effect, editorOnly, with(saccharite, 800, quartz, 1000));
        }};
        quartzLiquidRouter = new LiquidRouter("quartz-liquid-router"){{
           liquidCapacity = 25f;
           health = 150;
           size = 1;
           requirements(Category.liquid, BuildVisibility.shown, with(iron, 4, quartz, 10));
        }};
        quartzLiquidJunction = new LiquidJunction("quartz-liquid-junction"){{
            liquidCapacity = 25f;
            health = 150;
            size = 1;
            requirements(Category.liquid, BuildVisibility.shown, with(iron, 1, quartz, 5));
        }};
        quartzLiquidBridge = new LiquidBridge("quartz-liquid-bridge"){{
            requirements(Category.liquid, with(iron, 4, quartz, 8));
            fadeIn = moveArrows = false;
            arrowSpacing = 6f;
            range = 4;
            hasPower = false;
        }};
        quartzItemBridge = new BufferedItemBridge("quartz-item-bridge"){{
            requirements(Category.distribution, with(quartz, 6, saccharite, 6));
            fadeIn = moveArrows = false;
            range = 4;
            speed = 74f;
            arrowSpacing = 6f;
            bufferCapacity = 14;
        }};
    }
}