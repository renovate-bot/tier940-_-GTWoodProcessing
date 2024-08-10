package com.github.gtexpert.gtwp.api.util;

import java.util.Objects;
import java.util.Random;

import net.minecraft.item.ItemStack;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.fluids.FluidRegistry;
import net.minecraftforge.fluids.FluidStack;
import net.minecraftforge.fml.common.registry.GameRegistry;
import net.minecraftforge.oredict.OreDictionary;

import org.jetbrains.annotations.NotNull;

import com.github.gtexpert.gtwp.api.GTWPValues;

import gregtech.api.unification.OreDictUnifier;
import gregtech.api.unification.material.Material;
import gregtech.api.unification.stack.ItemMaterialInfo;
import gregtech.api.unification.stack.MaterialStack;

public class GTWPUtility {

    public static @NotNull ItemStack getModItem(String modID, String itemName) {
        return GameRegistry.makeItemStack(modID + ":" + itemName, 0, 1, null);
    }

    public static @NotNull ItemStack getModItem(String modID, String itemName, int amount) {
        return GameRegistry.makeItemStack(modID + ":" + itemName, 0, amount, null);
    }

    public static @NotNull ItemStack getModItem(String modID, String itemName, int amount, int meta) {
        return GameRegistry.makeItemStack(modID + ":" + itemName, meta, amount, null);
    }

    public static @NotNull ItemStack getModItem(String modID, String itemName, int amount, int meta,
                                                NBTTagCompound nbt) {
        return GameRegistry.makeItemStack(modID + ":" + itemName, meta, amount, nbt != null ? nbt.toString() : null);
    }

    public static @NotNull FluidStack getModFluid(String fluidName) {
        return Objects.requireNonNull(FluidRegistry.getFluidStack(fluidName, 1000));
    }

    public static @NotNull FluidStack getModFluid(String fluidName, int amount) {
        return Objects.requireNonNull(FluidRegistry.getFluidStack(fluidName, amount));
    }

    public static @NotNull ResourceLocation gtwpId(String path) {
        return new ResourceLocation(GTWPValues.MODID, path);
    }

    public static void registerOre(String dictName, ItemStack... itemStacks) {
        for (ItemStack stack : itemStacks) {
            OreDictionary.registerOre(dictName, stack);
        }
    }

    public static String generateRandomString(int length) {
        Random random = new Random();
        StringBuilder stringBuilder = new StringBuilder(length);

        for (int i = 0; i < length; i++) {
            stringBuilder.append(random.nextInt(10));
        }

        return stringBuilder.toString();
    }

    public static void registerOre(ItemStack itemStack, Material material, long amount) {
        registerOre(itemStack, new MaterialStack(material, amount));
    }

    public static void registerOre(ItemStack itemStack, MaterialStack... materialStacks) {
        registerOre(itemStack, new ItemMaterialInfo(materialStacks));
    }

    public static void registerOre(ItemStack itemStack, ItemMaterialInfo materialInfo) {
        OreDictUnifier.registerOre(itemStack, materialInfo);
    }
}
