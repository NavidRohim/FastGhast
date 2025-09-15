package me.brynview.navidrohim.fastghast;


import net.neoforged.bus.api.IEventBus;
import net.neoforged.fml.common.Mod;

@Mod(Constants.MOD_ID)
public class Fastghast {

    public Fastghast(IEventBus eventBus) {
        Constants.LOG.info("Initialised Faster Happy Ghast");
    }
}
