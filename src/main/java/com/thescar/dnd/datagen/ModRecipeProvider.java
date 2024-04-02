package com.thescar.dnd.datagen;

import com.thescar.dnd.DnD;
import com.thescar.dnd.block.ModBlocks;
import com.thescar.dnd.item.ModItems;
import net.minecraft.data.PackOutput;
import net.minecraft.data.recipes.*;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.crafting.AbstractCookingRecipe;
import net.minecraft.world.item.crafting.Ingredient;
import net.minecraft.world.item.crafting.RecipeSerializer;
import net.minecraft.world.level.ItemLike;
import net.minecraftforge.common.crafting.conditions.IConditionBuilder;

import java.util.List;
import java.util.function.Consumer;

public class ModRecipeProvider extends RecipeProvider implements IConditionBuilder {

    public ModRecipeProvider(PackOutput pOutput) {
        super(pOutput);
    }

    @Override
    protected void buildRecipes(Consumer<FinishedRecipe> pWriter) {

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModBlocks.RAW_ADAMANTITE_BLOCK.get())
                .pattern("SSS")
                .pattern("SSS")
                .pattern("SSS")
                .define('S', ModItems.RAW_ADAMANTITE.get())
                .unlockedBy(getHasName(ModItems.RAW_ADAMANTITE.get()), has(ModItems.RAW_ADAMANTITE.get()))
                .save(pWriter);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModItems.STEEL_SWORD.get()).pattern("I").pattern("I").pattern("S").define('I', ModItems.STEEL_INGOT.get()).define('S', Items.STICK).unlockedBy(getHasName(ModItems.STEEL_INGOT.get()), has(ModItems.STEEL_INGOT.get())).save(pWriter);
        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModItems.STEEL_AXE.get()).pattern("II ").pattern("IS ").pattern(" S ").define('I', ModItems.STEEL_INGOT.get()).define('S', Items.STICK).unlockedBy(getHasName(ModItems.STEEL_INGOT.get()), has(ModItems.STEEL_INGOT.get())).save(pWriter);
        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModItems.STEEL_PICKAXE.get()).pattern("III").pattern(" S ").pattern(" S ").define('I', ModItems.STEEL_INGOT.get()).define('S', Items.STICK).unlockedBy(getHasName(ModItems.STEEL_INGOT.get()), has(ModItems.STEEL_INGOT.get())).save(pWriter);
        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModItems.STEEL_SHOVEL.get()).pattern("I").pattern("S").pattern("S").define('I', ModItems.STEEL_INGOT.get()).define('S', Items.STICK).unlockedBy(getHasName(ModItems.STEEL_INGOT.get()), has(ModItems.STEEL_INGOT.get())).save(pWriter);
        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModItems.STEEL_HOE.get()).pattern("II ").pattern(" S ").pattern(" S ").define('I', ModItems.STEEL_INGOT.get()).define('S', Items.STICK).unlockedBy(getHasName(ModItems.STEEL_INGOT.get()), has(ModItems.STEEL_INGOT.get())).save(pWriter);
        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModItems.MITHRIL_SWORD.get()).pattern("I").pattern("I").pattern("S").define('I', ModItems.MITHRIL_INGOT.get()).define('S', Items.STICK).unlockedBy(getHasName(ModItems.MITHRIL_INGOT.get()), has(ModItems.MITHRIL_INGOT.get())).save(pWriter);
        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModItems.MITHRIL_AXE.get()).pattern("II ").pattern("IS ").pattern(" S ").define('I', ModItems.MITHRIL_INGOT.get()).define('S', Items.STICK).unlockedBy(getHasName(ModItems.MITHRIL_INGOT.get()), has(ModItems.MITHRIL_INGOT.get())).save(pWriter);
        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModItems.MITHRIL_PICKAXE.get()).pattern("III").pattern(" S ").pattern(" S ").define('I', ModItems.MITHRIL_INGOT.get()).define('S', Items.STICK).unlockedBy(getHasName(ModItems.MITHRIL_INGOT.get()), has(ModItems.MITHRIL_INGOT.get())).save(pWriter);
        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModItems.MITHRIL_SHOVEL.get()).pattern("I").pattern("S").pattern("S").define('I', ModItems.MITHRIL_INGOT.get()).define('S', Items.STICK).unlockedBy(getHasName(ModItems.MITHRIL_INGOT.get()), has(ModItems.MITHRIL_INGOT.get())).save(pWriter);
        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModItems.MITHRIL_HOE.get()).pattern("II ").pattern(" S ").pattern(" S ").define('I', ModItems.MITHRIL_INGOT.get()).define('S', Items.STICK).unlockedBy(getHasName(ModItems.MITHRIL_INGOT.get()), has(ModItems.MITHRIL_INGOT.get())).save(pWriter);
        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModItems.ELVEN_BRASS_SWORD.get()).pattern("I").pattern("I").pattern("S").define('I', ModItems.ELVEN_BRASS_INGOT.get()).define('S', Items.STICK).unlockedBy(getHasName(ModItems.ELVEN_BRASS_INGOT.get()), has(ModItems.ELVEN_BRASS_INGOT.get())).save(pWriter);
        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModItems.ELVEN_BRASS_AXE.get()).pattern("II ").pattern("IS ").pattern(" S ").define('I', ModItems.ELVEN_BRASS_INGOT.get()).define('S', Items.STICK).unlockedBy(getHasName(ModItems.ELVEN_BRASS_INGOT.get()), has(ModItems.ELVEN_BRASS_INGOT.get())).save(pWriter);
        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModItems.ELVEN_BRASS_PICKAXE.get()).pattern("III").pattern(" S ").pattern(" S ").define('I', ModItems.ELVEN_BRASS_INGOT.get()).define('S', Items.STICK).unlockedBy(getHasName(ModItems.ELVEN_BRASS_INGOT.get()), has(ModItems.ELVEN_BRASS_INGOT.get())).save(pWriter);
        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModItems.ELVEN_BRASS_SHOVEL.get()).pattern("I").pattern("S").pattern("S").define('I', ModItems.ELVEN_BRASS_INGOT.get()).define('S', Items.STICK).unlockedBy(getHasName(ModItems.ELVEN_BRASS_INGOT.get()), has(ModItems.ELVEN_BRASS_INGOT.get())).save(pWriter);
        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModItems.ELVEN_BRASS_HOE.get()).pattern("II ").pattern(" S ").pattern(" S ").define('I', ModItems.ELVEN_BRASS_INGOT.get()).define('S', Items.STICK).unlockedBy(getHasName(ModItems.ELVEN_BRASS_INGOT.get()), has(ModItems.ELVEN_BRASS_INGOT.get())).save(pWriter);
        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModItems.DRAGONBONE_SWORD.get()).pattern("I").pattern("I").pattern("S").define('I', ModItems.DRAGONBONE.get()).define('S', Items.STICK).unlockedBy(getHasName(ModItems.DRAGONBONE.get()), has(ModItems.DRAGONBONE.get())).save(pWriter);
        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModItems.DRAGONBONE_AXE.get()).pattern("II ").pattern("IS ").pattern(" S ").define('I', ModItems.DRAGONBONE.get()).define('S', Items.STICK).unlockedBy(getHasName(ModItems.DRAGONBONE.get()), has(ModItems.DRAGONBONE.get())).save(pWriter);
        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModItems.DRAGONBONE_PICKAXE.get()).pattern("III").pattern(" S ").pattern(" S ").define('I', ModItems.DRAGONBONE.get()).define('S', Items.STICK).unlockedBy(getHasName(ModItems.DRAGONBONE.get()), has(ModItems.DRAGONBONE.get())).save(pWriter);
        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModItems.DRAGONBONE_SHOVEL.get()).pattern("I").pattern("S").pattern("S").define('I', ModItems.DRAGONBONE.get()).define('S', Items.STICK).unlockedBy(getHasName(ModItems.DRAGONBONE.get()), has(ModItems.DRAGONBONE.get())).save(pWriter);
        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModItems.DRAGONBONE_HOE.get()).pattern("II ").pattern(" S ").pattern(" S ").define('I', ModItems.DRAGONBONE.get()).define('S', Items.STICK).unlockedBy(getHasName(ModItems.DRAGONBONE.get()), has(ModItems.DRAGONBONE.get())).save(pWriter);

        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, ModItems.RAW_ADAMANTITE.get(), 9).requires(ModBlocks.RAW_ADAMANTITE_BLOCK.get()).unlockedBy(getHasName(ModBlocks.RAW_ADAMANTITE_BLOCK.get()), has(ModBlocks.RAW_ADAMANTITE_BLOCK.get())).save(pWriter);
    }


    protected static void oreSmelting(Consumer<FinishedRecipe> pFinishedRecipeConsumer, List<ItemLike> pIngredients, RecipeCategory pCategory, ItemLike pResult, float pExperience, int pCookingTIme, String pGroup) {
        oreCooking(pFinishedRecipeConsumer, RecipeSerializer.SMELTING_RECIPE, pIngredients, pCategory, pResult, pExperience, pCookingTIme, pGroup, "_from_smelting");
    }

    protected static void oreBlasting(Consumer<FinishedRecipe> pFinishedRecipeConsumer, List<ItemLike> pIngredients, RecipeCategory pCategory, ItemLike pResult, float pExperience, int pCookingTime, String pGroup) {
        oreCooking(pFinishedRecipeConsumer, RecipeSerializer.BLASTING_RECIPE, pIngredients, pCategory, pResult, pExperience, pCookingTime, pGroup, "_from_blasting");
    }

    protected static void oreCooking(Consumer<FinishedRecipe> pFinishedRecipeConsumer, RecipeSerializer<? extends AbstractCookingRecipe> pCookingSerializer, List<ItemLike> pIngredients, RecipeCategory pCategory, ItemLike pResult, float pExperience, int pCookingTime, String pGroup, String pRecipeName) {
        for(ItemLike itemlike : pIngredients) {
            SimpleCookingRecipeBuilder.generic(Ingredient.of(itemlike), pCategory, pResult,
                            pExperience, pCookingTime, pCookingSerializer)
                    .group(pGroup).unlockedBy(getHasName(itemlike), has(itemlike))
                    .save(pFinishedRecipeConsumer,  DnD.MOD_ID + ":" + getItemName(pResult) + pRecipeName + "_" + getItemName(itemlike));
        }
    }
}