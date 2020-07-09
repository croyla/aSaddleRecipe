package me.crola.sr;

import org.bukkit.Bukkit;
import org.bukkit.Material;
import org.bukkit.NamespacedKey;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.ShapedRecipe;
import org.bukkit.plugin.java.JavaPlugin;

public class SaddleRecipe extends JavaPlugin {

    @Override
    public void onEnable() {
        NamespacedKey key = new NamespacedKey(this, "saddle"); //key
        ItemStack saddle = new ItemStack(Material.SADDLE); //result
        ShapedRecipe recipe = new ShapedRecipe(key, saddle); //recipe
        recipe.shape(
                "LLL", //first row of recipe
                "H H"); //defining the crafting method
        recipe.setIngredient('L', Material.LEATHER);
        recipe.setIngredient('H', Material.TRIPWIRE_HOOK);
        Bukkit.addRecipe(recipe);
    }
}
