package net.dragonatte.maegiteknica.item.custom;

import net.minecraft.network.chat.Component;
import net.minecraft.world.InteractionHand;
import net.minecraft.world.InteractionResultHolder;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.Level;
import org.jetbrains.annotations.NotNull;

public class MagicEightBallItem extends Item {
    public MagicEightBallItem(Properties properties) {
        super(properties);
    }

    @Override
    public @NotNull InteractionResultHolder<ItemStack> use(Level level, @NotNull Player player, @NotNull InteractionHand hand) {
        if (!level.isClientSide && hand == InteractionHand.MAIN_HAND) {
            printRandomNumber(player);
            player.getCooldowns().addCooldown(this, 20);
        }

        return super.use(level, player, hand);
    }
    private void printRandomNumber(Player player) {
        player.sendSystemMessage(Component.literal("La balla de magia dice: " + getRandomNumber()));
    }
    private int getRandomNumber() {
        return (int) (Math.random() * 100);
    }
}
