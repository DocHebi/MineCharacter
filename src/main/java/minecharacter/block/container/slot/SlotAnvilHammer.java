package minecharacter.block.container.slot;

import minecharacter.misc.InitItem;
import net.minecraft.inventory.IInventory;
import net.minecraft.inventory.Slot;
import net.minecraft.item.ItemStack;

public class SlotAnvilHammer extends Slot {

	public SlotAnvilHammer(IInventory par1iInventory, int par2, int par3,
			int par4) {
		super(par1iInventory, par2, par3, par4);

	}

	@Override
	public boolean isItemValid(ItemStack par1ItemStack) {
		if ((par1ItemStack.getItem().equals(InitItem.woodHammer))
				|| (par1ItemStack.getItem().equals(InitItem.stoneHammer))
				|| (par1ItemStack.getItem().equals(InitItem.ironHammer))
				|| (par1ItemStack.getItem().equals(InitItem.goldHammer))
				|| (par1ItemStack.getItem().equals(InitItem.diamondHammer))
				|| (par1ItemStack.getItem().equals(InitItem.mjolnir))) {
			return true;
		}

		return false;
	}

}
