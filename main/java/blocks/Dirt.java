package blocks;

import java.util.Random;

import net.minecraft.block.BlockOre;
import net.minecraft.block.SoundType;
import net.minecraft.block.state.IBlockState;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.fml.common.registry.GameRegistry;


public class Dirt extends BlockOre {
 
	public Dirt() {
		super();
		String dirt = "dirt";
		this.setRegistryName(dirt);
		this.setUnlocalizedName(dirt);
		this.setCreativeTab(CreativeTabs.BUILDING_BLOCKS);
		this.setHardness(3.0F);
		this.setResistance(5.0F);
		this.setSoundType(SoundType.SNOW);	
	}
		public Item getItemDropped(IBlockState state, Random rand, int fortune) {
		int drop = rand.nextInt(10);
		if (drop > 5) {
		Item item =
					GameRegistry.findRegistry(Item.class).getValue(new ResourceLocation("examplemod:worm"));
			return item;
			
		}else {
			return null;
		}
	}
	
}


