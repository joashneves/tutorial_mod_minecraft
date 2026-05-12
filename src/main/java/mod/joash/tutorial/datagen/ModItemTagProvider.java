package mod.joash.tutorial.datagen;

import mod.joash.tutorial.block.ModBlocks;
import mod.joash.tutorial.item.ModItems;
import mod.joash.tutorial.util.ModTags;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricTagProvider;
import net.minecraft.item.Items;
import net.minecraft.registry.RegistryWrapper;
import net.minecraft.registry.tag.ItemTags;

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
    }
}
