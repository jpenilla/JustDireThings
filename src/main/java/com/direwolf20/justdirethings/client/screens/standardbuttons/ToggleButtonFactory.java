package com.direwolf20.justdirethings.client.screens.standardbuttons;

import com.direwolf20.justdirethings.JustDireThings;
import com.direwolf20.justdirethings.client.screens.widgets.GrayscaleButton;
import com.direwolf20.justdirethings.client.screens.widgets.NumberButton;
import com.direwolf20.justdirethings.client.screens.widgets.ToggleButton;
import com.direwolf20.justdirethings.common.items.tools.utils.Ability;
import com.direwolf20.justdirethings.setup.Config;
import net.minecraft.client.gui.components.Button;
import net.minecraft.network.chat.Component;
import net.minecraft.resources.ResourceLocation;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ToggleButtonFactory {
    public record TextureLocalization(ResourceLocation texture, Component localization) {
    }

    private static final int STANDARD_WIDTH = 16; // Example width
    private static final int STANDARD_HEIGHT = 16; // Example height

    private static final Map<Ability, List<TextureLocalization>> abilityTextureMap = new HashMap<>() {{
        put(Ability.HAMMER, HAMMER_TEXTURES);
    }};

    /** Redstone Button **/
    private static final List<TextureLocalization> REDSTONE_TEXTURES = List.of(
            new TextureLocalization(new ResourceLocation(JustDireThings.MODID, "textures/gui/buttons/redstoneignore.png"), Component.translatable("justdirethings.screen.ignored")),
            new TextureLocalization(new ResourceLocation(JustDireThings.MODID, "textures/gui/buttons/redstonelow.png"), Component.translatable("justdirethings.screen.low")),
            new TextureLocalization(new ResourceLocation(JustDireThings.MODID, "textures/gui/buttons/redstonehigh.png"), Component.translatable("justdirethings.screen.high")),
            new TextureLocalization(new ResourceLocation(JustDireThings.MODID, "textures/gui/buttons/redstonepulse.png"), Component.translatable("justdirethings.screen.pulse"))
    );

    public static ToggleButton REDSTONEBUTTON(int x, int y, int startingValue, Button.OnPress onPress) {
        return new ToggleButton(x, y, STANDARD_WIDTH, STANDARD_HEIGHT, REDSTONE_TEXTURES, startingValue, onPress);
    }

    /** Redstone Button **/
    private static final List<TextureLocalization> ALLOW_LIST_TEXTURES = List.of(
            new TextureLocalization(new ResourceLocation(JustDireThings.MODID, "textures/gui/buttons/allowlistfalse.png"), Component.translatable("justdirethings.screen.denylist")),
            new TextureLocalization(new ResourceLocation(JustDireThings.MODID, "textures/gui/buttons/allowlisttrue.png"), Component.translatable("justdirethings.screen.allowlist"))
    );

    public static ToggleButton ALLOWLISTBUTTON(int x, int y, boolean startingValue, Button.OnPress onPress) {
        return new ToggleButton(x, y, STANDARD_WIDTH, STANDARD_HEIGHT, ALLOW_LIST_TEXTURES, startingValue, onPress);
    }

    private static final ResourceLocation COMPARE_NBT = new ResourceLocation(JustDireThings.MODID, "textures/gui/buttons/matchnbttrue.png");
    private static final Component COMPARE_NBT_LOCALIZATION = Component.translatable("justdirethings.screen.comparenbt");

    public static GrayscaleButton COMPARENBTBUTTON(int x, int y, boolean startingValue, Button.OnPress onPress) {
        return new GrayscaleButton(x, y, STANDARD_WIDTH, STANDARD_HEIGHT, COMPARE_NBT, COMPARE_NBT_LOCALIZATION, startingValue, onPress);
    }

    private static final ResourceLocation RENDER_AREA = new ResourceLocation(JustDireThings.MODID, "textures/gui/buttons/area.png");
    private static final Component RENDER_AREA_LOCALIZATION = Component.translatable("justdirethings.screen.renderarea");

    public static GrayscaleButton RENDERAREABUTTON(int x, int y, boolean startingValue, Button.OnPress onPress) {
        return new GrayscaleButton(x, y, STANDARD_WIDTH, STANDARD_HEIGHT, RENDER_AREA, RENDER_AREA_LOCALIZATION, startingValue, onPress);
    }

    /** Direction Button **/
    private static final List<TextureLocalization> DIRECTION_TEXTURES = List.of(
            new TextureLocalization(new ResourceLocation(JustDireThings.MODID, "textures/gui/buttons/direction-down.png"), Component.translatable("justdirethings.screen.direction-down")),
            new TextureLocalization(new ResourceLocation(JustDireThings.MODID, "textures/gui/buttons/direction-up.png"), Component.translatable("justdirethings.screen.direction-up")),
            new TextureLocalization(new ResourceLocation(JustDireThings.MODID, "textures/gui/buttons/direction-north.png"), Component.translatable("justdirethings.screen.direction-north")),
            new TextureLocalization(new ResourceLocation(JustDireThings.MODID, "textures/gui/buttons/direction-south.png"), Component.translatable("justdirethings.screen.direction-south")),
            new TextureLocalization(new ResourceLocation(JustDireThings.MODID, "textures/gui/buttons/direction-west.png"), Component.translatable("justdirethings.screen.direction-west")),
            new TextureLocalization(new ResourceLocation(JustDireThings.MODID, "textures/gui/buttons/direction-east.png"), Component.translatable("justdirethings.screen.direction-east"))
    );

    public static ToggleButton DIRECTIONBUTTON(int x, int y, int startingValue, Button.OnPress onPress) {
        return new ToggleButton(x, y, STANDARD_WIDTH, STANDARD_HEIGHT, DIRECTION_TEXTURES, startingValue, onPress);
    }

    /** Direction With None Button **/
    private static final List<TextureLocalization> DIRECTION_NONE_TEXTURES = List.of(
            new TextureLocalization(new ResourceLocation(JustDireThings.MODID, "textures/gui/buttons/direction-none.png"), Component.translatable("justdirethings.screen.direction-none")),
            new TextureLocalization(new ResourceLocation(JustDireThings.MODID, "textures/gui/buttons/direction-down.png"), Component.translatable("justdirethings.screen.direction-down")),
            new TextureLocalization(new ResourceLocation(JustDireThings.MODID, "textures/gui/buttons/direction-up.png"), Component.translatable("justdirethings.screen.direction-up")),
            new TextureLocalization(new ResourceLocation(JustDireThings.MODID, "textures/gui/buttons/direction-north.png"), Component.translatable("justdirethings.screen.direction-north")),
            new TextureLocalization(new ResourceLocation(JustDireThings.MODID, "textures/gui/buttons/direction-south.png"), Component.translatable("justdirethings.screen.direction-south")),
            new TextureLocalization(new ResourceLocation(JustDireThings.MODID, "textures/gui/buttons/direction-west.png"), Component.translatable("justdirethings.screen.direction-west")),
            new TextureLocalization(new ResourceLocation(JustDireThings.MODID, "textures/gui/buttons/direction-east.png"), Component.translatable("justdirethings.screen.direction-east"))
    );

    public static ToggleButton DIRECTIONNONEBUTTON(int x, int y, int startingValue, Button.OnPress onPress) {
        return new ToggleButton(x, y, STANDARD_WIDTH, STANDARD_HEIGHT, DIRECTION_NONE_TEXTURES, startingValue, onPress);
    }

    /** FilterBlockItem Button **/
    private static final List<TextureLocalization> FILTERBLOCKITEM_TEXTURES = List.of(
            new TextureLocalization(new ResourceLocation(JustDireThings.MODID, "textures/gui/buttons/filter-block.png"), Component.translatable("justdirethings.screen.filter-block")),
            new TextureLocalization(new ResourceLocation(JustDireThings.MODID, "textures/gui/buttons/filter-item.png"), Component.translatable("justdirethings.screen.filter-item"))
    );

    public static ToggleButton FILTERBLOCKITEMBUTTON(int x, int y, int startingValue, Button.OnPress onPress) {
        return new ToggleButton(x, y, STANDARD_WIDTH, STANDARD_HEIGHT, FILTERBLOCKITEM_TEXTURES, startingValue, onPress);
    }

    /** Hammer Button **/
    private static final List<TextureLocalization> HAMMER_TEXTURES = List.of(
            new TextureLocalization(new ResourceLocation(JustDireThings.MODID, "textures/gui/buttons/ignore.png"), Component.translatable("justdirethings.ability.hammer_off")),
            new TextureLocalization(new ResourceLocation(JustDireThings.MODID, "textures/gui/buttons/hammer3.png"), Component.translatable("justdirethings.ability.hammer_3")),
            new TextureLocalization(new ResourceLocation(JustDireThings.MODID, "textures/gui/buttons/hammer5.png"), Component.translatable("justdirethings.ability.hammer_5")),
            new TextureLocalization(new ResourceLocation(JustDireThings.MODID, "textures/gui/buttons/hammer7.png"), Component.translatable("justdirethings.ability.hammer_7"))
    );

    public static ToggleButton ABILITYCYCLEBUTTON(int x, int y, Ability ability, int startingValue, Button.OnPress onPress) {
        return new ToggleButton(x, y, STANDARD_WIDTH, STANDARD_HEIGHT, HAMMER_TEXTURES, startingValue, onPress);
    }

    private static Component ticksButtonLocalization = Component.translatable("justdirethings.screen.tickspeed");

    public static NumberButton TICKSPEEDBUTTON(int x, int y, int value, Button.OnPress onPress) {
        return new NumberButton(x, y, 24, 12, value, Config.MINIMUM_MACHINE_TICK_SPEED.get(), 1200, ticksButtonLocalization, onPress);
    }
}
