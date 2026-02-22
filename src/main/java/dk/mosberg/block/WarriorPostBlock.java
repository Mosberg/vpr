package dk.mosberg.block;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.mojang.serialization.MapCodec;

import net.minecraft.block.AbstractBlock;
import net.minecraft.block.Block;

public class WarriorPostBlock extends Block {
  public static final String MOD_ID = "vpr";
  public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

  public static final MapCodec<WarriorPostBlock> CODEC = createCodec(WarriorPostBlock::new);

  @Override
  public MapCodec<WarriorPostBlock> getCodec() {
    return CODEC;
  }

  public WarriorPostBlock(AbstractBlock.Settings settings) {
    super(settings);
  }
}
