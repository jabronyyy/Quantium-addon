package com.example.addon;
import meteordevelopment.meteorclient.events.entity.DropItemsEvent;
import meteordevelopment.meteorclient.systems.modules.Categories;
import com.example.addon.modules.misc.*;
import com.mojang.logging.LogUtils;
import meteordevelopment.meteorclient.systems.hud.Hud;
import meteordevelopment.meteorclient.systems.hud.HudGroup;
import meteordevelopment.meteorclient.addons.MeteorAddon;
import meteordevelopment.meteorclient.systems.modules.Category;
import meteordevelopment.meteorclient.systems.modules.Modules;
import org.slf4j.Logger;



public class Addon extends MeteorAddon {
    public static String VERSION = "Quantium";
    public static String INVITE_LINK = "https://discord.gg/FP8jcqTZyG";

    public static final Logger LOG = LogUtils.getLogger();
    public static final Category misc = new Category("Quantium");
    public static final HudGroup HUD_GROUP = new HudGroup("QuantiumHud");


    @Override
    public void onInitialize() {
        LOG.info("Initializing Meteor Addon Quantium");

        // HUD
//		Hud.get().register(ItemCounter.INFO);
//        Hud.get().register(WelcomeHud.INFO);
//        Hud.get().register(TextPresets.INFO);

        Modules.get().add(new FakeOP());
        Modules.get().add(new CrashExploit());
        Modules.get().add(new AutoTrapPlus());
        Modules.get().add(new gm3());
        Modules.get().add(new godmode());
        Modules.get().add(new FoxDupe());
        Modules.get().add(new PacketFlyPlus());
        Modules.get().add(new ProxyAutoTotem());
        Modules.get().add(new SeedChecker());
        Modules.get().add(new SilentSurround());
        Modules.get().add(new SoundForKill());
        Modules.get().add(new WorldScanExploits());
        Modules.get().add(new DropInventory());

    }

    @Override
    public void onRegisterCategories() {
        Modules.registerCategory(misc);
    }

    @Override
    public String getPackage() {
        return "com.example.addon";
    }
}
