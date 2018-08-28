package com.example.examplemod;

import items.Ingot;
import items.worm;
import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.RenderItem;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.item.Item;
import net.minecraft.item.ItemBlock;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import net.minecraftforge.fml.common.registry.GameRegistry;
import net.minecraftforge.fml.relauncher.Side;
import blocks.Dirt;
import generators.DirtGen;


@Mod(modid = ExampleMod.MODID, version = ExampleMod.VERSION)
public class ExampleMod
{
  public static final String MODID = "examplemod";
  public static final String VERSION = "1.0";

  // Initialize Field Variables
worm Worm;
Ingot Ingot;
Dirt Dirt;
  
  @EventHandler
  public void preInit(FMLPreInitializationEvent event)
  {
    // Create Object - Call Constructor

	  Worm = new worm(2, 0.3F, false) ;
	  Ingot = new Ingot();
	  Dirt = new Dirt();

	  
    // Add to Game Registry Here
	  
	  GameRegistry.register(Worm);
	  GameRegistry.register(Ingot);
	  GameRegistry.register(Dirt);
	  GameRegistry.register(new
			  ItemBlock(Dirt).setRegistryName(Dirt.getRegistryName()));
	  GameRegistry.registerWorldGenerator(new DirtGen(Dirt),0);
	  
  }
  @EventHandler
  public void init(FMLInitializationEvent event)
  {
    if (event.getSide() == Side.CLIENT) {
      RenderItem renderItem = Minecraft.getMinecraft().getRenderItem();


      //Paste Code for ITEMS Below
      
      renderItem.getItemModelMesher().register(Worm, 0, 
    		  new ModelResourceLocation(Worm.getRegistryName(), "inventory"));
      
      renderItem.getItemModelMesher().register(Ingot, 0,
    		  new ModelResourceLocation(Ingot.getRegistryName(), "inventory"));
      
      renderItem.getItemModelMesher().register(Item.getItemFromBlock(Dirt),
    		  0,
    		  	new ModelResourceLocation(Dirt.getRegistryName(), "inventory"));
      
      
    }
  }
}
