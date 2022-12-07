package net.dragonatte.maegiteknica.item;

import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import org.jetbrains.annotations.Contract;
import org.jetbrains.annotations.NotNull;

public class ModCreativeModeTab {
    public static final CreativeModeTab NaturaTAB = new CreativeModeTab("natura") {
        @Contract(" -> new")
        @Override
        public @NotNull ItemStack makeIcon() {
            return new ItemStack(ModItems.ENERGY_CRYSTAL.get());
        }
    };
}
