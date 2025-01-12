package com.github.alexthe666.iceandfire.world.gen;

import com.github.alexthe666.iceandfire.IceAndFire;
import com.github.alexthe666.iceandfire.world.gen.processor.ScriberVillageProcessor;
import com.github.alexthe666.iceandfire.world.village.ComponentScriberHouse;
import net.minecraft.server.MinecraftServer;
import net.minecraft.util.EnumFacing;
import net.minecraft.util.Mirror;
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.Rotation;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import net.minecraft.world.biome.Biome;
import net.minecraft.world.gen.feature.WorldGenerator;
import net.minecraft.world.gen.structure.template.PlacementSettings;
import net.minecraft.world.gen.structure.template.Template;
import net.minecraft.world.gen.structure.template.TemplateManager;

import java.util.Random;

public class WorldGenScriberHouse extends WorldGenerator {

    private static final ResourceLocation HOUSE = new ResourceLocation(IceAndFire.MODID, "scriber_house");
    private ComponentScriberHouse component;
    private Rotation rotation;
    private EnumFacing facing;

    public WorldGenScriberHouse(ComponentScriberHouse component, EnumFacing facing) {
        this.component = component;
        this.facing = facing;
        switch (facing) {
            case SOUTH:
                rotation = Rotation.CLOCKWISE_180;
                break;
            case EAST:
                rotation = Rotation.CLOCKWISE_90;
                break;
            case WEST:
                rotation = Rotation.COUNTERCLOCKWISE_90;
                break;
            default:
                rotation = Rotation.NONE;
                break;
        }
    }

    @Override
    public boolean generate(World worldIn, Random rand, BlockPos position) {
        if (worldIn == null) {
            return false;
        }
        MinecraftServer server = worldIn.getMinecraftServer();
        TemplateManager templateManager = worldIn.getSaveHandler().getStructureTemplateManager();
        PlacementSettings settings = new PlacementSettings().setRotation(rotation).setMirror(Mirror.NONE);
        Template template = templateManager.getTemplate(server, HOUSE);
        Biome biome = worldIn.getBiome(position);
        int xSize = template.getSize().getX() / 2;
        int zSize = template.getSize().getZ() / 2;

        template.addBlocksToWorld(worldIn, position.up(3).offset(EnumFacing.NORTH, xSize).offset(EnumFacing.SOUTH, zSize), new ScriberVillageProcessor(), settings, 2);
        return true;
    }
}