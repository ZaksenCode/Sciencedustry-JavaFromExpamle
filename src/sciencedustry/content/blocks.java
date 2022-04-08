package sciencedustry.content;

import mindustry.content.Blocks;
import mindustry.content.Items;
import mindustry.ctype.ContentList;
import mindustry.type.Category;
import mindustry.world.Block;
import mindustry.world.blocks.defense.Wall;
import mindustry.world.blocks.defense.turrets.ItemTurret;
import mindustry.world.blocks.defense.turrets.LiquidTurret;
import mindustry.world.blocks.defense.turrets.PowerTurret;
import mindustry.world.blocks.environment.Floor;
import mindustry.world.blocks.environment.TreeBlock;

public class blocks implements ContentList{
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
            category = Category.turret;
        }};
        equation = new PowerTurret("equation") {{

        }};
        radical = new ItemTurret("eadical") {{

        }};
        spray = new LiquidTurret("spray") {{

        }};
        sprayLarge = new LiquidTurret("spray-large"){{

        }};
        sprayHuge = new LiquidTurret("spray-huge"){{

        }};
        nurgumWall = new Wall("nurgum-wall"){{

        }};
        nurgumWallLarge = new Wall("nurgum-wall-large"){{

        }};
        nurgumiumWall = new Wall("nurgumium-alloy-wall"){{

        }};
        nurgumiumWallLarge = new Wall("nurgumium-alloy-wall-large"){{

        }};
        mixedWall = new Wall("mixed-wall"){{

        }};
        mixedWallLarge = new Wall("mixed-wall-large"){{

        }};
    }
}
