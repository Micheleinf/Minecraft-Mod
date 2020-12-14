package com.michelebiondi.mod.util;

import com.michelebiondi.mod.TheMicheleMod;
import com.michelebiondi.mod.items.ItemBase;
import net.minecraft.item.Item;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class RegistryHandler {

    public static final DeferredRegister<Item> ITEMS = new DeferredRegister<>(ForgeRegistries.ITEMS, TheMicheleMod.MOD_ID);

    public static void init(){
        ITEMS.register(FMLJavaModLoadingContext.get().getModEventBus());

    }


    //Items
    public static final RegistryObject<Item> MICHELESWORD = ITEMS.register( "michelesword", ItemBase::new);
    public static final RegistryObject<Item> MICHELEPIC = ITEMS.register( "michelepic", ItemBase::new);
    



}