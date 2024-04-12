package cn.nukkit.block;

import cn.nukkit.block.property.enums.OldLeafType;
import cn.nukkit.block.property.enums.WoodType;
import cn.nukkit.item.Item;
import org.jetbrains.annotations.NotNull;

import static cn.nukkit.block.property.CommonBlockProperties.*;


public class BlockCherryLeaves extends BlockLeaves {

    public static final BlockProperties PROPERTIES = new BlockProperties(CHERRY_LEAVES,PERSISTENT_BIT, UPDATE_BIT);

    public BlockCherryLeaves() {
        this(PROPERTIES.getDefaultState());
    }

    public BlockCherryLeaves(BlockState blockState) {
        super(blockState);
    }


    @Override
    @NotNull public BlockProperties getProperties() {
        return PROPERTIES;
    }

    @Override
    public String getName() {
        return "Cherry Leaves";
    }

    @Override
    public Item getSapling() {
        return new BlockCherrySapling().toItem();
    }
    /*这里写木质类型为BIRCH只是为了获取凋落物时的概率正确，并不代表真的就是白桦木*/

    @Override
    public WoodType getType() {
        return WoodType.valueOf(OldLeafType.BIRCH.name().toUpperCase());
    }
}
