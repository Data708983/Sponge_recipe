package org.data7.sponge_recipe;

import org.bukkit.Material;
import org.bukkit.NamespacedKey;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.ShapedRecipe;
import org.bukkit.plugin.java.JavaPlugin;

public final class Sponge_recipe extends JavaPlugin {

    @Override
    public void onEnable() {
        getServer().getLogger().info("Sponge Recipe Added!");
        NamespacedKey key = new NamespacedKey(this, "sponge");
        ItemStack item = ItemStack.of(Material.SPONGE, 1);
        ShapedRecipe recipe = new ShapedRecipe(key, item);
        recipe.shape("ABA", "BCB", "ABA");
        recipe.setIngredient('A', Material.GOLD_NUGGET);
        recipe.setIngredient('B', Material.PRISMARINE_CRYSTALS);
        recipe.setIngredient('C', Material.HAY_BLOCK);
        getServer().addRecipe(recipe);
    }

    @Override
    public void onDisable() {
    }
}
