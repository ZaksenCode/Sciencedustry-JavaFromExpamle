package Sciencedustry.content;

import arc.Core;
import mindustry.content.Blocks;
import mindustry.content.Liquids;
import mindustry.content.TechTree;
import mindustry.content.TechTree.*;
import mindustry.ctype.ContentList;
import mindustry.ctype.UnlockableContent;
import mindustry.game.Objectives;
import mindustry.gen.Iconc;
import mindustry.type.ItemStack;
import mindustry.type.SectorPreset;

import static Sciencedustry.content.SCBlocks.*;
import static Sciencedustry.content.SCItems.*;
import static Sciencedustry.content.SCLiquids.ElectrifiedWater;
import static Sciencedustry.content.SCLiquids.RadioactiveWater;
import static mindustry.content.Blocks.*;
import static mindustry.content.Items.*;
import static mindustry.content.Liquids.*;

public class SCTechTree implements ContentList {
    static TechTree.TechNode context = null;

    //New Horizen code
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
        add(nurgumWallLarge, mixedWall);
        add(mixedWall, mixedWallLarge);
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
        add(powerNodeLarge, nurgumPowerNode);
        add(nurgumPowerNode, nurgumiumAlloyPowerNode);
        add(mechanicalPump, sacchariteWaterGenerator);
        add(titaniumConveyor, obsidianConveyor);
        add(titaniumWallLarge, obsidianWall);
        add(obsidianWall, obsidianWallLarge);
        add(graphitePress,ironFortifier);
        add(mechanicalDrill, ironDrill);

        addProduce(copper, rawIron);
        addProduce(rawIron, iron);
        addProduce(iron, obsidian);
        addProduce(copper, gravel);
        addProduce(silicon, nurgum);
        addProduce(nurgum, nurgumiumAlloy);
        addProduce(Liquids.water, ElectrifiedWater);
        addProduce(Liquids.water, RadioactiveWater);
    }

    //New Horizon code
    public static class SpecialMap implements Objectives.Objective{
        String key;
        SectorPreset preset;

        public SpecialMap(String key, SectorPreset preset){
            this.key = key;
            this.preset = preset;
        }

        /** @return whether this objective is met. */
        @Override
        public boolean complete(){
            return Core.settings.getBool(key, false);
        }

        /**
         * @return the string displayed when this objective is completed, in imperative form. e.g. when the objective is
         * 'complete 10 waves', this would display "complete 10 waves".
         */
        @Override
        public String display(){
            return Core.bundle.get("nh.cutscene.research-objective") + (preset.unlocked() ? preset.localizedName : Iconc.lock);
        }
    }
}
