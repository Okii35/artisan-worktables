package com.codetaylor.mc.artisanworktables.modules.worktables.tile;

import com.codetaylor.mc.artisanworktables.modules.worktables.ModuleWorktables;
import com.codetaylor.mc.artisanworktables.modules.worktables.ModuleWorktablesConfig;
import com.codetaylor.mc.artisanworktables.modules.worktables.block.BlockWorktableEnumType;
import com.codetaylor.mc.artisanworktables.modules.worktables.tile.spi.TileEntityWorktableFluidBase;
import net.minecraft.util.ResourceLocation;

import java.awt.*;

public class TileEntityWorktableJeweler
    extends TileEntityWorktableFluidBase {

  private static final int TEXT_SHADOW_COLOR = new Color(105, 89, 133).getRGB();
  private static final BlockWorktableEnumType TYPE = BlockWorktableEnumType.JEWELER;
  private static final ResourceLocation BACKGROUND_TEXTURE = new ResourceLocation(
      ModuleWorktables.MOD_ID,
      String.format(ModuleWorktables.Textures.WORKTABLE_GUI, TYPE.getName())
  );

  public TileEntityWorktableJeweler() {

    super(3, 3);
  }

  @Override
  protected String getWorktableName() {

    return TYPE.getName();
  }

  @Override
  protected int getWorktableGuiTextShadowColor() {

    return TEXT_SHADOW_COLOR;
  }

  @Override
  protected ResourceLocation getWorktableGuiBackgroundTexture() {

    return BACKGROUND_TEXTURE;
  }

  @Override
  public int getWorktableGuiTabTextureYOffset() {

    return 3;
  }

  @Override
  public boolean canHandleJEIRecipeTransfer(String name) {

    return TYPE.getName().equals(name);
  }

  @Override
  protected int getFluidCapacity() {

    return ModuleWorktablesConfig.FLUID_CAPACITY.JEWELER;
  }
}
