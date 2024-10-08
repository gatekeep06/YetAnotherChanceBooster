package com.metacontent.yetanotherchancebooster.influence;

import com.cobblemon.mod.common.api.spawning.context.SpawningContext;
import com.cobblemon.mod.common.api.spawning.detail.PokemonSpawnDetail;
import com.cobblemon.mod.common.api.spawning.detail.SpawnDetail;
import com.metacontent.yetanotherchancebooster.store.BoostManagerData;
import net.minecraft.server.network.ServerPlayerEntity;
import org.jetbrains.annotations.NotNull;

public class SpeciesWeightBooster extends SpawningBooster {
    public SpeciesWeightBooster(ServerPlayerEntity player) {
        super(player);
    }

    @Override
    public float affectWeight(@NotNull SpawnDetail spawnDetail, @NotNull SpawningContext spawningContext, float weight) {
        if (spawnDetail instanceof PokemonSpawnDetail pokemonSpawnDetail) {
            String species = pokemonSpawnDetail.getPokemon().getSpecies();
            float amplifier = BoostManagerData.getOrCreate(player).getManager().getWeightAmplifier(species);

            return weight * amplifier;
        }
        return super.affectWeight(spawnDetail, spawningContext, weight);
    }
}
