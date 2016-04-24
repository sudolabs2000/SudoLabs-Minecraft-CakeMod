package com.sudolabs.cakemod;

import net.minecraft.item.ItemFood;
import net.minecraft.potion.Potion;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class ItemChocolateCake extends ItemFood { 

	private String name = "chocolateCake";

	public ItemChocolateCake(int amount, float saturation, boolean wolfFood)
	{
		super(amount, saturation, wolfFood);
		
		GameRegistry.registerItem(this,name);
		setUnlocalizedName(CakeMod.MODID + "_" + name);
		setPotionEffect(Potion.damageBoost.id, 15, 0, 1F);
		setAlwaysEdible();
	}
	
	public String getName()
	{
		return name;
	}
}	

	
