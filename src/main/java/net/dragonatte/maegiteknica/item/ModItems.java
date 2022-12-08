package net.dragonatte.maegiteknica.item;

import net.dragonatte.maegiteknica.MaegyTekhnika;
import net.dragonatte.maegiteknica.item.custom.MagicEightBallItem;
import net.minecraft.world.item.Item;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModItems {
    public static final DeferredRegister<Item> ITEMS =
            DeferredRegister.create(ForgeRegistries.ITEMS, MaegyTekhnika.MOD_ID);

    public static final RegistryObject<Item> ENERGY_CRYSTAL = ITEMS.register("energy_crystal",
            ()-> new Item(new Item.Properties().tab(ModCreativeModeTab.NATURA_TAB)));
    public static final RegistryObject<Item> ENERGY_CRYSTAL_SHARD = ITEMS.register("energy_crystal_shard",
            ()-> new Item(new Item.Properties().tab(ModCreativeModeTab.NATURA_TAB)));
    public static final RegistryObject<Item> ENERGY_CRYSTAL_SHARD_FRAGMENT = ITEMS.register("energy_crystal_shard_fragment",
            ()-> new Item(new Item.Properties().tab(ModCreativeModeTab.NATURA_TAB)));

    public static final RegistryObject<Item> MANA_CRYSTAL = ITEMS.register("mana_crystal",
            ()-> new Item(new Item.Properties().tab(ModCreativeModeTab.NATURA_TAB)));
    public static final RegistryObject<Item> MANA_CRYSTAL_SHARD = ITEMS.register("mana_crystal_shard",
            ()-> new Item(new Item.Properties().tab(ModCreativeModeTab.NATURA_TAB)));
    public static final RegistryObject<Item> MANA_CRYSTAL_SHARD_FRAGMENT = ITEMS.register("mana_crystal_shard_fragment",
            ()-> new Item(new Item.Properties().tab(ModCreativeModeTab.NATURA_TAB)));

    public static final RegistryObject<Item> MAGIC_EIGHT_BALL = ITEMS.register("magic_eight_ball",
            ()-> new MagicEightBallItem(new Item.Properties().tab(ModCreativeModeTab.ARTIFICIA_TAB).stacksTo(1)));


    public static void register( IEventBus eventbus) {
        ITEMS.register(eventbus);
    }
}
