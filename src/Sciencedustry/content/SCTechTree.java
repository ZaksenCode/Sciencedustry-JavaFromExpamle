package Sciencedustry.content;

import arc.struct.Seq;
import mindustry.content.TechTree;
import mindustry.content.TechTree.*;
import mindustry.ctype.ContentList;
import mindustry.ctype.UnlockableContent;
import mindustry.game.Objectives;
import mindustry.type.ItemStack;

import static Sciencedustry.content.SCBlocks.*;
import static mindustry.content.Blocks.*;

public class SCTechTree implements ContentList {
    static TechTree.TechNode context = null;

    //newHorizen code
    public static void addProduce(UnlockableContent root, UnlockableContent content){
        TechNode node = new TechNode(TechTree.get(root), content, ItemStack.with());
        node.objectives.add(new Objectives.Produce(content));
    }

    public static void add(UnlockableContent root, UnlockableContent content){
        new TechNode(TechTree.get(root), content, content.researchRequirements());
    }

    public static void add(UnlockableContent root, UnlockableContent content, Objectives.Objective... objectives){
        TechNode node = new TechNode(TechTree.get(root), content, content.researchRequirements());
        node.objectives.addAll(objectives);
    }


    @Override
    public void load() {
        add(copperWallLarge, nurgumWall);
        add(nurgumWall, nurgumWallLarge);
        add(nurgumWallLarge, nurgumiumWall);
        add(nurgumiumWall, nurgumiumWallLarge);
        add(arc, radical);
        add(radical, degree);
        add(wave, spray);
        add(spray, sprayLarge);
        add(sprayLarge, sprayHuge);
        add(launchPad, nurgumiumAlloyLaunchPad);
        add(titaniumConveyor, nurgumConveyor);
        add(nurgumConveyor, nurgumiumAlloyConveyor);
        add(cryofluidMixer, electrifiedWaterMixer);
        add(siliconSmelter, nurgumMixer);
        add(nurgumMixer, nurgumiumAlloyMixer);
    }
}
