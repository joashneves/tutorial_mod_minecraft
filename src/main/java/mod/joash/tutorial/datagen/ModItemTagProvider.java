package mod.joash.tutorial.datagen;

import mod.joash.tutorial.block.ModBlocks;
import mod.joash.tutorial.item.ModItems;
import mod.joash.tutorial.util.ModTags;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricTagProvider;
import net.minecraft.block.Block;
import net.minecraft.item.Item;
import net.minecraft.item.Items;
import net.minecraft.registry.RegistryWrapper;
import net.minecraft.registry.tag.BlockTags;
import net.minecraft.registry.tag.ItemTags;
import net.minecraft.registry.tag.TagKey;

import java.util.Collection;
import java.util.concurrent.CompletableFuture;

public class ModItemTagProvider extends FabricTagProvider.ItemTagProvider {

    public ModItemTagProvider(FabricDataOutput output, CompletableFuture<RegistryWrapper.WrapperLookup> completableFuture) {
        super(output, completableFuture);
    }

    @Override
    protected void configure(RegistryWrapper.WrapperLookup lookup) {
        getOrCreateTagBuilder(ModTags.Items.TRANSFORMABLE_ITEMS).add(ModItems.PINK_GARNET)
                .add(ModItems.RAW_PINK_GARNET)
                .add(Items.COAL)
                .add(Items.GUNPOWDER);

        getOrCreateTagBuilder(ItemTags.FENCES).add(ModBlocks.PINK_GARNET_FENCE.asItem());
        getOrCreateTagBuilder(ItemTags.STAIRS).add(ModBlocks.PINK_GARNET_STAIRS.asItem());
        getOrCreateTagBuilder(ItemTags.SLABS).add(ModBlocks.PINK_GARNET_SLAB.asItem());

        getOrCreateTagBuilder(ItemTags.FENCES).add(ModBlocks.BLUE_FENCE.asItem());
        getOrCreateTagBuilder(ItemTags.STAIRS).add(ModBlocks.BLUE_STAIRS.asItem());
        getOrCreateTagBuilder(ItemTags.SLABS).add(ModBlocks.BLUE_SLAB.asItem());

        getOrCreateTagBuilder(ItemTags.SWORDS).add(ModItems.PINK_GARNET_SWORD);
        getOrCreateTagBuilder(ItemTags.SHOVELS).add(ModItems.PINK_GARNET_SHOVEL);
        getOrCreateTagBuilder(ItemTags.AXES).add(ModItems.PINK_GARNET_AXE);
        getOrCreateTagBuilder(ItemTags.PICKAXES).add(ModItems.PINK_GARNET_PICKAXE);
        getOrCreateTagBuilder(ItemTags.HOES).add(ModItems.PINK_GARNET_HOE);

        getOrCreateTagBuilder(ItemTags.TRIMMABLE_ARMOR)
                .add(ModItems.PINK_GARNET_HELMET)
                .add(ModItems.PINK_GARNET_CHESTPLATE)
                .add(ModItems.PINK_GARNET_LEGGINGS)
                .add(ModItems.PINK_GARNET_BOOTS);

        getOrCreateTagBuilder(ItemTags.TRIM_MATERIALS).add(ModItems.PINK_GARNET);

        getOrCreateTagBuilder(ItemTags.TRIM_MATERIALS).add(ModItems.KAUPEN_SMITHING_TEMPLATE);

    }

}
