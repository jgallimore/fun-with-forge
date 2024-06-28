package com.example.examplemod;

import com.mojang.brigadier.CommandDispatcher;
import com.mojang.brigadier.context.CommandContext;
import net.minecraft.commands.CommandSourceStack;
import net.minecraft.commands.Commands;
import net.minecraft.core.BlockPos;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.server.level.ServerPlayer;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.MobSpawnType;

public class MyCommand {

    public MyCommand(CommandDispatcher<CommandSourceStack> dispatcher) {
        dispatcher.register(Commands.literal("spawnpig").executes(this::execute));
    }

    private int execute(CommandContext<CommandSourceStack> context) {
        ServerPlayer player = context.getSource().getPlayer();
        ServerLevel level = player.serverLevel();

        final BlockPos blockPos = player.blockPosition();

        for (int i = 0; i<1000; i++) {
            int x = blockPos.getX() + (int) (Math.random() * 200) - 100;
            int y = blockPos.getY() + 200;
            int z = blockPos.getZ() + (int) (Math.random() * 200) - 100;

            BlockPos pos = new BlockPos(x, y ,z);

            EntityType.PIG.spawn(level, pos, MobSpawnType.TRIGGERED);
        }

        return 0;
    }


}
