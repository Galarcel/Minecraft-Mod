package net.galarcel.tutorialmod.item;

import net.galarcel.tutorialmod.item.custom.Firestone;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.galarcel.tutorialmod.TutorialMod;

import java.awt.event.InputEvent;

public class ModItems {

    public static final DeferredRegister<Item> ITEMS =
            DeferredRegister.create(ForgeRegistries.ITEMS, TutorialMod.MOD_ID);

    public static final RegistryObject<Item> AMETHYST = ITEMS.register("amethyst",
            () -> new Item(new Item.Properties().group(ModItemGroup.TUTORIAL_GROUP)));
    public static final RegistryObject<Item> FIRESTONE = ITEMS.register("firestone",
            () -> new Firestone(new Item.Properties().group(ModItemGroup.TUTORIAL_GROUP).maxDamage(8)));

    public static void register(IEventBus eventBus){
        ITEMS.register(eventBus);
    }
}
