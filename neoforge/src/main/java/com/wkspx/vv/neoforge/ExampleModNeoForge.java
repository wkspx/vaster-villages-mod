package com.wkspx.vv.neoforge;

import net.neoforged.fml.common.Mod;

import com.wkspx.vv.ExampleMod;

@Mod(ExampleMod.MOD_ID)
public final class ExampleModNeoForge {
    public ExampleModNeoForge() {
        // Run our common setup.
        ExampleMod.init();
    }
}
