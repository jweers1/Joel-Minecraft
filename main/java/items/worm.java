package items;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.init.MobEffects;
import net.minecraft.item.ItemFood;
import net.minecraft.potion.PotionEffect;

public class worm extends ItemFood {

	public worm(int amount, float saturation , boolean isWolfFood) {
		super(amount,saturation, isWolfFood);
		// TODO Auto-generated constructor stub

		String worm = "worm" ;
		this.setRegistryName(worm);
		this.setUnlocalizedName(worm);
		this.setCreativeTab(CreativeTabs.FOOD);
		this.setPotionEffect(new PotionEffect(MobEffects.SPEED,300,10),1.0F);
		this.setAlwaysEdible();
		
	}
}
