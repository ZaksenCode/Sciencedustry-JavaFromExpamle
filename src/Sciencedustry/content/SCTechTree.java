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


    @Override
    public void load() {
        margeNode(copperWallLarge, () -> {node(nurgumWall);} );
        margeNode(nurgumWall, () -> {node(nurgumWallLarge);} );
        margeNode(nurgumWallLarge, () -> {node(nurgumiumWall);} );
        margeNode(nurgumiumWall, () -> {node(nurgumiumWallLarge);} );
        margeNode(duo, () -> {node(radical);} );
        margeNode(radical, () -> {node(degree);} );
        margeNode(wave, () -> {node(spray);} );
        margeNode(spray, () -> {node(sprayLarge);} );
        margeNode(sprayLarge, () -> {node(sprayHuge);} );
        margeNode(launchPad, () -> {node(nurgumiumAlloyLaunchpad);} );
        margeNode(titaniumConveyor, () -> {node(nurgumConveyor);} );
        margeNode(nurgumConveyor, () -> {node(nurgumiumAlloyConveyor);} );
        margeNode(cryofluidMixer, () -> {node(electrifiedWaterMixer);} );
        margeNode(siliconSmelter, () -> {node(nurgumMixer);} );
        margeNode(nurgumMixer, () -> {node(nurgumiumAlloyMixer);} );
    }

    //code copied from Sharllotes mod
    private static void margeNode(UnlockableContent parent, Runnable children){
        TechTree.TechNode parnode = TechTree.all.find(t -> t.content == parent);
        context = parnode;
        children.run();
    }

    private static void node(UnlockableContent content, ItemStack[] requirements, Seq<Objectives.Objective> objectives, Runnable children){
        TechTree.TechNode node = new TechTree.TechNode(context, content, requirements);
        if(objectives != null) node.objectives = objectives;

        TechTree.TechNode prev = context;
        context = node;
        children.run();
        context = prev;
    }

    private static void node(UnlockableContent content, ItemStack[] requirements, Runnable children){
        node(content, requirements, null, children);
    }

    private static void node(UnlockableContent content, Seq<Objectives.Objective> objectives, Runnable children){
        node(content, content.researchRequirements(), objectives, children);
    }

    private static void node(UnlockableContent content, Runnable children){
        node(content, content.researchRequirements(), children);
    }

    private static void node(UnlockableContent block){
        node(block, () -> {});
    }

    private static void nodeProduce(UnlockableContent content, Seq<Objectives.Objective> objectives, Runnable children){
        node(content, content.researchRequirements(), objectives.and(new Objectives.Produce(content)), children);
    }

    private static void nodeProduce(UnlockableContent content, Runnable children){
        nodeProduce(content, Seq.with(), children);
    }

    private static void nodeProduce(UnlockableContent content){
        nodeProduce(content, Seq.with(), () -> {});
    }
}
