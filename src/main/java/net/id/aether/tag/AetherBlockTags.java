package net.id.aether.tag;

import net.fabricmc.fabric.api.tag.TagFactory;
import net.id.aether.Aether;
import net.minecraft.block.Block;
import net.minecraft.tag.Tag;
import net.minecraft.util.Identifier;

import static net.id.aether.Aether.*;

public class AetherBlockTags {

    //Gravitite
    public static final Tag<Block> FAST_FLOATERS = TagFactory.BLOCK.create(locate("fast_floaters"));
    public static final Tag<Block> NON_FLOATERS = TagFactory.BLOCK.create(locate("non_floaters"));

    //Plants
    public static final Tag<Block> LICHEN_SPREADABLES = TagFactory.BLOCK.create(locate("world/lichen_spreadable"));
    public static final Tag<Block> FUNGI_CLINGABLES = TagFactory.BLOCK.create(locate("world/fungi_clingable"));

    //Swets
    public static final Tag<Block> SWET_TRANSFORMERS_BLUE = TagFactory.BLOCK.create(locate("swet_transformers/blue"));
    public static final Tag<Block> SWET_TRANSFORMERS_GOLDEN = TagFactory.BLOCK.create(locate("swet_transformers/golden"));
    public static final Tag<Block> SWET_TRANSFORMERS_PURPLE = TagFactory.BLOCK.create(locate("swet_transformers/purple"));
    public static final Tag<Block> SWET_TRANSFORMERS_VERMILION = TagFactory.BLOCK.create(locate("swet_transformers/vermilion"));

    //Worldgen
    public static final Tag<Block> BASE_AETHER_STONE = TagFactory.BLOCK.create(locate("base_aether_stone"));
    public static final Tag<Block> FLUID_IRREPLACEABLES = TagFactory.BLOCK.create(locate("fluid_irreplaceable"));
    public static final Tag<Block> BASE_REPLACEABLES = TagFactory.BLOCK.create(locate("base_replaceables"));

    //JEB, WHY ARE SHEARS HARDCODED
    public static final Tag<Block> AETHER_SHEARABLE = TagFactory.BLOCK.create(locate("mineable_by_shears"));
}
