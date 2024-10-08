package com.metacontent.yetanotherchancebooster.boost;

import org.jetbrains.annotations.NotNull;

public class SpeciesWeightBoost extends Boost {
    private final String species;

    public SpeciesWeightBoost(float amplifier, long duration, @NotNull String species) {
        super(amplifier, duration);
        this.species = species;
    }

    public String getSpecies() {
        return species;
    }

    @Override
    public String toString() {
        return "species: " + species + " | amplifier: " + getAmplifier() + " | duration: " + getTicksRemain();
    }

    @Override
    public String info() {
        return "Species weight boost (" + species + ")";
    }
}
