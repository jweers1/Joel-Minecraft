package items;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

public class Ingot extends Item {

	public Ingot() {
		// TODO Auto-generated constructor stub
		
		String ingot = "ingot";
		this.setRegistryName(ingot);
		this.setUnlocalizedName(ingot);
		this.setCreativeTab(CreativeTabs.MATERIALS);
		
		
		
	}

}
