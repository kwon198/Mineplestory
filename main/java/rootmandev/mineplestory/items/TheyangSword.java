package rootmandev.mineplestory.items;

import java.util.List;

import javax.annotation.Nullable;

import net.minecraft.client.util.ITooltipFlag;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemSword;
import net.minecraft.world.World;
import rootmandev.mineplestory.Main;
import rootmandev.mineplestory.util.IHasModel;

public class TheyangSword extends ItemSword implements IHasModel {
	
	public TheyangSword(String name, ToolMaterial material) {
		
		super(material);
		setUnlocalizedName(name);
		setRegistryName(name);
		setCreativeTab(CreativeTabs.COMBAT);
		
		rootmandev.mineplestory.init.Items.ITEMS.add(this);

}
	
	@Override
	public void registerModels() {
	
		Main.proxy.registerItemRenderer(this, 0, "inventory");
}
	@Override
	public void addInformation(ItemStack itemStack, @Nullable World worldIn, List<String> tooltip, ITooltipFlag flagIn) {
		
		tooltip.add("2019년 가장 유행했던 단어입니다. 음기잇!");
	
}
}
