//package com.example.examplemod;
package com.sudolabs.cakemod;

import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.entity.RenderItem;
import net.minecraft.client.resources.model.ModelResourceLocation;
import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import net.minecraftforge.fml.common.registry.GameRegistry;
import net.minecraftforge.fml.relauncher.Side;

@Mod(modid = CakeMod.MODID, version = CakeMod.VERSION)
public class CakeMod {
    public static final String MODID = "sudolabs_cakemod";
    public static final String VERSION = "0.1";
    public static Item chocolateCake;
    
    
    
  
    
    
    @EventHandler
    public void preInit(FMLPreInitializationEvent event)
    {
    	chocolateCake = new ItemChocolateCake(3, 0.3F, true);
    }
    
    
    
    
    
    
    @EventHandler
    public void init(FMLInitializationEvent event)
    {
    	addCustomSmeltingRecipes();
    	addCustomRecipes();
	}
    @EventHandler
    public void postInit(FMLPostInitializationEvent event)
    {
    	if (event.getSide() == Side.CLIENT)
    	{
    		//Items... the last step
    		
    		RenderItem renderItem = Minecraft.getMinecraft().getRenderItem();
    		
    		renderItem.getItemModelMesher().register(chocolateCake, 0,
    				new ModelResourceLocation(MODID + ":" + ((ItemChocolateCake)chocolateCake).getName(), "inventory")
    				);
    	}
    }
    
    
    
    
    
    private void addCustomSmeltingRecipes()
    {
        // Melting recipes
        GameRegistry.addSmelting(Items.stick, new ItemStack(Blocks.torch), 0.2F);
    	GameRegistry.addSmelting(Items.clay_ball, new ItemStack(Blocks.clay), 0.4F);
    	GameRegistry.addSmelting(Items.redstone, new ItemStack(Blocks.redstone_torch), 0.6F);
    	GameRegistry.addSmelting(Blocks.cake, new ItemStack(Items.sugar), 0.2F);
    	GameRegistry.addSmelting(Blocks.gravel, new ItemStack(Blocks.stone), 0.1F);
    	GameRegistry.addSmelting(Blocks.glowstone, new ItemStack(Items.fire_charge), 0.5F);
    	GameRegistry.addSmelting(Items.prismarine_crystals, new ItemStack(Items.blaze_powder), 0.7F);
    	GameRegistry.addSmelting(Blocks.leaves, new ItemStack(Items.apple), 0.9F);
    	GameRegistry.addSmelting(Items.golden_sword, new ItemStack(Items.diamond_sword), 0.8F);
    	GameRegistry.addSmelting(Items.gold_ingot, new ItemStack(Items.diamond), 0.7F);
    	GameRegistry.addSmelting(Items.iron_ingot, new ItemStack(Items.gold_ingot), 0.5F);
    	GameRegistry.addSmelting(Blocks.gold_block, new ItemStack(Items.cake), 0.9F);
    	GameRegistry.addSmelting(Blocks.iron_block, new ItemStack(Blocks.gold_block), 0.6F);
    	GameRegistry.addSmelting(Items.water_bucket, new ItemStack(Items.lava_bucket), 0.2F);
    	GameRegistry.addSmelting(Items.coal, new ItemStack(Blocks.glowstone), 0.3F);
    	GameRegistry.addSmelting(Items.fire_charge, new ItemStack(Blocks.tnt), 0.7F);
    	
    }
    
    private void addCustomRecipes()
    
    {
    	//shapeless recipes
    	GameRegistry.addShapelessRecipe(new ItemStack(chocolateCake),
    		Items.cake, Items.dye);
    }
}