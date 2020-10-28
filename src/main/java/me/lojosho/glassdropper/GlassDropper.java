package me.lojosho.glassdropper;

import org.bstats.bukkit.Metrics;
import org.bukkit.GameMode;
import org.bukkit.Material;
import org.bukkit.block.Block;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.block.BlockBreakEvent;
import org.bukkit.inventory.ItemStack;
import org.bukkit.plugin.java.JavaPlugin;

import java.util.ArrayList;
import java.util.List;

public final class GlassDropper extends JavaPlugin implements Listener {

    @Override
    public void onEnable() {
        // Plugin startup logic
        getServer().getPluginManager().registerEvents(this, this);
        int pluginId = 8282; // <-- Replace with the id of your plugin!
        Metrics metrics = new Metrics(this, pluginId);
        }

    @Override
    public void onDisable() {
        // Plugin shutdown logic
    }

    public List<Material> getGlassList() {
        List<Material> GlassList = new ArrayList<>();
        GlassList.add(Material.GLASS);
        GlassList.add(Material.WHITE_STAINED_GLASS);
        GlassList.add(Material.ORANGE_STAINED_GLASS);
        GlassList.add(Material.PURPLE_STAINED_GLASS);
        GlassList.add(Material.LIGHT_BLUE_STAINED_GLASS);
        GlassList.add(Material.YELLOW_STAINED_GLASS);
        GlassList.add(Material.LIME_STAINED_GLASS);
        GlassList.add(Material.PINK_STAINED_GLASS);
        GlassList.add(Material.GRAY_STAINED_GLASS);
        GlassList.add(Material.LIGHT_GRAY_STAINED_GLASS);
        GlassList.add(Material.CYAN_STAINED_GLASS);
        GlassList.add(Material.MAGENTA_STAINED_GLASS);
        GlassList.add(Material.BLUE_STAINED_GLASS);
        GlassList.add(Material.BROWN_STAINED_GLASS);
        GlassList.add(Material.GREEN_STAINED_GLASS);
        GlassList.add(Material.RED_STAINED_GLASS);
        GlassList.add(Material.BLACK_STAINED_GLASS);
        GlassList.add(Material.GLASS_PANE);
        GlassList.add(Material.WHITE_STAINED_GLASS_PANE);
        GlassList.add(Material.ORANGE_STAINED_GLASS_PANE);
        GlassList.add(Material.MAGENTA_STAINED_GLASS_PANE);
        GlassList.add(Material.LIGHT_BLUE_STAINED_GLASS_PANE);
        GlassList.add(Material.LIME_STAINED_GLASS_PANE);
        GlassList.add(Material.YELLOW_STAINED_GLASS_PANE);
        GlassList.add(Material.PINK_STAINED_GLASS_PANE);
        GlassList.add(Material.GRAY_STAINED_GLASS_PANE);
        GlassList.add(Material.LIGHT_GRAY_STAINED_GLASS_PANE);
        GlassList.add(Material.CYAN_STAINED_GLASS_PANE);
        GlassList.add(Material.PURPLE_STAINED_GLASS_PANE);
        GlassList.add(Material.BLUE_STAINED_GLASS_PANE);
        GlassList.add(Material.BROWN_STAINED_GLASS_PANE);
        GlassList.add(Material.GREEN_STAINED_GLASS_PANE);
        GlassList.add(Material.RED_STAINED_GLASS_PANE);
        GlassList.add(Material.BLACK_STAINED_GLASS_PANE);
        return GlassList;
    }


    @EventHandler
    public void onBlockBreak(BlockBreakEvent event) {
        if (!event.isCancelled()) {
            if (event.getPlayer().getGameMode() == GameMode.SURVIVAL) {
                Material m = event.getBlock().getBlockData().getMaterial();
                Block b = event.getBlock();
                if (getGlassList().contains(event.getBlock().getBlockData().getMaterial())) {
                    b.setType(Material.AIR);
                    b.getWorld().dropItemNaturally(b.getLocation(), new ItemStack(m, 1));
                    event.setCancelled(true);
                }
            }
        }
    }
}
