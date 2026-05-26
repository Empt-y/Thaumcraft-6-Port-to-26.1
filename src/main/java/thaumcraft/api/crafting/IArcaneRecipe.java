package thaumcraft.api.crafting;
import net.minecraft.world.item.crafting.Recipe;
import thaumcraft.api.aspects.AspectList;


public interface IArcaneRecipe extends net.minecraft.world.item.crafting.Recipe<net.minecraft.world.item.crafting.CraftingInput>, IThaumcraftRecipe
{
    public int getVis();
    public String getResearch();
    public AspectList getCrystals();
    default public String getGroup() { return ""; }
}
