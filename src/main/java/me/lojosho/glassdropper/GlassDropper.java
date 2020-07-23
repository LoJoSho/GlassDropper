package me.lojosho.glassdropper;

import org.bstats.bukkit.Metrics;
import org.bukkit.GameMode;
import org.bukkit.Material;
import org.bukkit.block.Block;
import org.bukkit.event.EventHandler;
import org.bukkit.event.EventPriority;
import org.bukkit.event.Listener;
import org.bukkit.event.block.BlockBreakEvent;
import org.bukkit.inventory.ItemStack;
import org.bukkit.plugin.java.JavaPlugin;

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

    @EventHandler(priority = EventPriority.LOWEST)
    public void onBlockBreakGLASS(BlockBreakEvent event) {
        if (!event.isCancelled()) {
            if (event.getPlayer().getGameMode() == GameMode.SURVIVAL) {
                if (event.getBlock().getType() == Material.GLASS) {
                    Block b = event.getBlock();
                    b.setType(Material.AIR);
                    b.getWorld().dropItemNaturally(b.getLocation(), new ItemStack(Material.GLASS, 1));
                    event.setCancelled(true);
                }
                if (event.getBlock().getType() == Material.GLASS_PANE) {
                    Block b = event.getBlock();
                    b.setType(Material.AIR);
                    b.getWorld().dropItemNaturally(b.getLocation(), new ItemStack(Material.GLASS_PANE, 1));
                    event.setCancelled(true);
                }
                if (event.getBlock().getType() == Material.WHITE_STAINED_GLASS) {
                    Block b = event.getBlock();
                    b.setType(Material.AIR);
                    b.getWorld().dropItemNaturally(b.getLocation(), new ItemStack(Material.WHITE_STAINED_GLASS, 1));
                    event.setCancelled(true);
                }
                if (event.getBlock().getType() == Material.ORANGE_STAINED_GLASS) {
                    Block b = event.getBlock();
                    b.setType(Material.AIR);
                    b.getWorld().dropItemNaturally(b.getLocation(), new ItemStack(Material.ORANGE_STAINED_GLASS, 1));
                    event.setCancelled(true);
                }
                if (event.getBlock().getType() == Material.PURPLE_STAINED_GLASS) {
                    Block b = event.getBlock();
                    b.setType(Material.AIR);
                    b.getWorld().dropItemNaturally(b.getLocation(), new ItemStack(Material.PURPLE_STAINED_GLASS, 1));
                    event.setCancelled(true);
                }
                if (event.getBlock().getType() == Material.LIGHT_BLUE_STAINED_GLASS) {
                    Block b = event.getBlock();
                    b.setType(Material.AIR);
                    b.getWorld().dropItemNaturally(b.getLocation(), new ItemStack(Material.LIGHT_BLUE_STAINED_GLASS, 1));
                    event.setCancelled(true);
                }
                if (event.getBlock().getType() == Material.YELLOW_STAINED_GLASS) {
                    Block b = event.getBlock();
                    b.setType(Material.AIR);
                    b.getWorld().dropItemNaturally(b.getLocation(), new ItemStack(Material.YELLOW_STAINED_GLASS, 1));
                    event.setCancelled(true);
                }
                if (event.getBlock().getType() == Material.LIME_STAINED_GLASS) {
                    Block b = event.getBlock();
                    b.setType(Material.AIR);
                    b.getWorld().dropItemNaturally(b.getLocation(), new ItemStack(Material.LIME_STAINED_GLASS, 1));
                    event.setCancelled(true);
                }
                if (event.getBlock().getType() == Material.PINK_STAINED_GLASS) {
                    Block b = event.getBlock();
                    b.setType(Material.AIR);
                    b.getWorld().dropItemNaturally(b.getLocation(), new ItemStack(Material.PINK_STAINED_GLASS, 1));
                    event.setCancelled(true);
                }
                if (event.getBlock().getType() == Material.GRAY_STAINED_GLASS) {
                    Block b = event.getBlock();
                    b.setType(Material.AIR);
                    b.getWorld().dropItemNaturally(b.getLocation(), new ItemStack(Material.GRAY_STAINED_GLASS, 1));
                    event.setCancelled(true);
                }
                if (event.getBlock().getType() == Material.LIGHT_GRAY_STAINED_GLASS) {
                    Block b = event.getBlock();
                    b.setType(Material.AIR);
                    b.getWorld().dropItemNaturally(b.getLocation(), new ItemStack(Material.LIGHT_GRAY_STAINED_GLASS, 1));
                    event.setCancelled(true);
                }
                if (event.getBlock().getType() == Material.CYAN_STAINED_GLASS) {
                    Block b = event.getBlock();
                    b.setType(Material.AIR);
                    b.getWorld().dropItemNaturally(b.getLocation(), new ItemStack(Material.CYAN_STAINED_GLASS, 1));
                    event.setCancelled(true);
                }
                if (event.getBlock().getType() == Material.MAGENTA_STAINED_GLASS) {
                    Block b = event.getBlock();
                    b.setType(Material.AIR);
                    b.getWorld().dropItemNaturally(b.getLocation(), new ItemStack(Material.MAGENTA_STAINED_GLASS, 1));
                    event.setCancelled(true);
                }
                if (event.getBlock().getType() == Material.BLUE_STAINED_GLASS) {
                    Block b = event.getBlock();
                    b.setType(Material.AIR);
                    b.getWorld().dropItemNaturally(b.getLocation(), new ItemStack(Material.BLUE_STAINED_GLASS, 1));
                    event.setCancelled(true);
                }
                if (event.getBlock().getType() == Material.BROWN_STAINED_GLASS) {
                    Block b = event.getBlock();
                    b.setType(Material.AIR);
                    b.getWorld().dropItemNaturally(b.getLocation(), new ItemStack(Material.BROWN_STAINED_GLASS, 1));
                    event.setCancelled(true);
                }
                if (event.getBlock().getType() == Material.GREEN_STAINED_GLASS) {
                    Block b = event.getBlock();
                    b.setType(Material.AIR);
                    b.getWorld().dropItemNaturally(b.getLocation(), new ItemStack(Material.GREEN_STAINED_GLASS, 1));
                    event.setCancelled(true);
                }
                if (event.getBlock().getType() == Material.RED_STAINED_GLASS) {
                    Block b = event.getBlock();
                    b.setType(Material.AIR);
                    b.getWorld().dropItemNaturally(b.getLocation(), new ItemStack(Material.RED_STAINED_GLASS, 1));
                    event.setCancelled(true);
                }
                if (event.getBlock().getType() == Material.BLACK_STAINED_GLASS) {
                    Block b = event.getBlock();
                    b.setType(Material.AIR);
                    b.getWorld().dropItemNaturally(b.getLocation(), new ItemStack(Material.BLACK_STAINED_GLASS, 1));
                    event.setCancelled(true);
                }
                if (event.getBlock().getType() == Material.WHITE_STAINED_GLASS_PANE) {
                    Block b = event.getBlock();
                    b.setType(Material.AIR);
                    b.getWorld().dropItemNaturally(b.getLocation(), new ItemStack(Material.WHITE_STAINED_GLASS_PANE, 1));
                    event.setCancelled(true);
                }
                if (event.getBlock().getType() == Material.ORANGE_STAINED_GLASS_PANE) {
                    Block b = event.getBlock();
                    b.setType(Material.AIR);
                    b.getWorld().dropItemNaturally(b.getLocation(), new ItemStack(Material.ORANGE_STAINED_GLASS_PANE, 1));
                    event.setCancelled(true);
                }
                if (event.getBlock().getType() == Material.MAGENTA_STAINED_GLASS_PANE) {
                    Block b = event.getBlock();
                    b.setType(Material.AIR);
                    b.getWorld().dropItemNaturally(b.getLocation(), new ItemStack(Material.MAGENTA_STAINED_GLASS_PANE, 1));
                    event.setCancelled(true);
                }
                if (event.getBlock().getType() == Material.LIGHT_BLUE_STAINED_GLASS_PANE) {
                    Block b = event.getBlock();
                    b.setType(Material.AIR);
                    b.getWorld().dropItemNaturally(b.getLocation(), new ItemStack(Material.LIGHT_BLUE_STAINED_GLASS_PANE, 1));
                    event.setCancelled(true);
                }
                if (event.getBlock().getType() == Material.YELLOW_STAINED_GLASS_PANE) {
                    Block b = event.getBlock();
                    b.setType(Material.AIR);
                    b.getWorld().dropItemNaturally(b.getLocation(), new ItemStack(Material.YELLOW_STAINED_GLASS_PANE, 1));
                    event.setCancelled(true);
                }
                if (event.getBlock().getType() == Material.LIME_STAINED_GLASS_PANE) {
                    Block b = event.getBlock();
                    b.setType(Material.AIR);
                    b.getWorld().dropItemNaturally(b.getLocation(), new ItemStack(Material.LIME_STAINED_GLASS_PANE, 1));
                    event.setCancelled(true);
                }
                if (event.getBlock().getType() == Material.PINK_STAINED_GLASS_PANE) {
                    Block b = event.getBlock();
                    b.setType(Material.AIR);
                    b.getWorld().dropItemNaturally(b.getLocation(), new ItemStack(Material.PINK_STAINED_GLASS_PANE, 1));
                    event.setCancelled(true);
                }
                if (event.getBlock().getType() == Material.GRAY_STAINED_GLASS_PANE) {
                    Block b = event.getBlock();
                    b.setType(Material.AIR);
                    b.getWorld().dropItemNaturally(b.getLocation(), new ItemStack(Material.GRAY_STAINED_GLASS_PANE, 1));
                    event.setCancelled(true);
                }
                if (event.getBlock().getType() == Material.LIGHT_GRAY_STAINED_GLASS_PANE) {
                    Block b = event.getBlock();
                    b.setType(Material.AIR);
                    b.getWorld().dropItemNaturally(b.getLocation(), new ItemStack(Material.LIGHT_GRAY_STAINED_GLASS_PANE, 1));
                    event.setCancelled(true);
                }
                if (event.getBlock().getType() == Material.CYAN_STAINED_GLASS_PANE) {
                    Block b = event.getBlock();
                    b.setType(Material.AIR);
                    b.getWorld().dropItemNaturally(b.getLocation(), new ItemStack(Material.CYAN_STAINED_GLASS_PANE, 1));
                    event.setCancelled(true);
                }
                if (event.getBlock().getType() == Material.PURPLE_STAINED_GLASS_PANE) {
                    Block b = event.getBlock();
                    b.setType(Material.AIR);
                    b.getWorld().dropItemNaturally(b.getLocation(), new ItemStack(Material.PURPLE_STAINED_GLASS_PANE, 1));
                    event.setCancelled(true);
                }
                if (event.getBlock().getType() == Material.BLUE_STAINED_GLASS_PANE) {
                    Block b = event.getBlock();
                    b.setType(Material.AIR);
                    b.getWorld().dropItemNaturally(b.getLocation(), new ItemStack(Material.BLUE_STAINED_GLASS_PANE, 1));
                    event.setCancelled(true);
                }
                if (event.getBlock().getType() == Material.BROWN_STAINED_GLASS_PANE) {
                    Block b = event.getBlock();
                    b.setType(Material.AIR);
                    b.getWorld().dropItemNaturally(b.getLocation(), new ItemStack(Material.BROWN_STAINED_GLASS_PANE, 1));
                    event.setCancelled(true);
                }
                if (event.getBlock().getType() == Material.GREEN_STAINED_GLASS_PANE) {
                    Block b = event.getBlock();
                    b.setType(Material.AIR);
                    b.getWorld().dropItemNaturally(b.getLocation(), new ItemStack(Material.GREEN_STAINED_GLASS_PANE, 1));
                    event.setCancelled(true);
                }
                if (event.getBlock().getType() == Material.RED_STAINED_GLASS_PANE) {
                    Block b = event.getBlock();
                    b.setType(Material.AIR);
                    b.getWorld().dropItemNaturally(b.getLocation(), new ItemStack(Material.RED_STAINED_GLASS_PANE, 1));
                    event.setCancelled(true);
                }
                if (event.getBlock().getType() == Material.BLACK_STAINED_GLASS_PANE) {
                    Block b = event.getBlock();
                    b.setType(Material.AIR);
                    b.getWorld().dropItemNaturally(b.getLocation(), new ItemStack(Material.BLACK_STAINED_GLASS_PANE, 1));
                    event.setCancelled(true);
                }
            }
        }
    }
}
