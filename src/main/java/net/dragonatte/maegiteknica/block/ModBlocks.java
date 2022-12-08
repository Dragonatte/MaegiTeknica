package net.dragonatte.maegiteknica.block;

import net.dragonatte.maegiteknica.MaegyTekhnika;
import net.dragonatte.maegiteknica.item.ModCreativeModeTab;
import net.dragonatte.maegiteknica.item.ModItems;
import net.minecraft.util.valueproviders.UniformInt;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.DropExperienceBlock;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.material.Material;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

import java.util.function.Supplier;

public class ModBlocks {
    public static final DeferredRegister<Block> BLOCKS =
            DeferredRegister.create(ForgeRegistries.BLOCKS, MaegyTekhnika.MOD_ID);

    public static final RegistryObject<Block> ENERGY_ORE = registerBlock("energy_ore",
            () -> new DropExperienceBlock(BlockBehaviour.Properties.of(Material.STONE).strength(6f).
                    requiresCorrectToolForDrops(), UniformInt.of(3,7)), ModCreativeModeTab.NATURA_TAB);
    public static final RegistryObject<Block> DEEPSLATE_ENERGY_ORE = registerBlock("deepslate_energy_ore",
            () -> new DropExperienceBlock(BlockBehaviour.Properties.of(Material.STONE).strength(6f).
                    requiresCorrectToolForDrops(), UniformInt.of(3,7)), ModCreativeModeTab.NATURA_TAB);
    public static final RegistryObject<Block> ENERGY_BLOCK = registerBlock("energy_block",
            () -> new Block(BlockBehaviour.Properties.of(Material.METAL).strength(6f).requiresCorrectToolForDrops()), ModCreativeModeTab.NATURA_TAB);

    public static final RegistryObject<Block> MANA_ORE = registerBlock("mana_ore",
            () -> new DropExperienceBlock(BlockBehaviour.Properties.of(Material.STONE).strength(6f).
                    requiresCorrectToolForDrops(), UniformInt.of(3,7)), ModCreativeModeTab.NATURA_TAB);
    public static final RegistryObject<Block> DEEPSLATE_MANA_ORE = registerBlock("deepslate_mana_ore",
            () -> new DropExperienceBlock(BlockBehaviour.Properties.of(Material.STONE).strength(6f).
                    requiresCorrectToolForDrops(), UniformInt.of(3,7)), ModCreativeModeTab.NATURA_TAB);
    public static final RegistryObject<Block> MANA_BLOCK = registerBlock("mana_block",
            () -> new Block(BlockBehaviour.Properties.of(Material.METAL).strength(6f).requiresCorrectToolForDrops()), ModCreativeModeTab.NATURA_TAB);

    private static <T extends Block> RegistryObject<T> registerBlock(String  name, Supplier<T> block, CreativeModeTab tab) {
        RegistryObject<T> toReturn = BLOCKS.register(name, block);
        registerBlockItem(name, toReturn, tab);
        return toReturn;
    }

    private static <T extends Block> RegistryObject<Item> registerBlockItem(String  name, Supplier<T> block, CreativeModeTab tab) {
        return ModItems.ITEMS.register(name, () -> new BlockItem(block.get(), new Item.Properties().tab(tab)));
    }

    public static void register(IEventBus modEventBus) {
        BLOCKS.register(modEventBus);
    }
}
