/*
 * Copyright (c) 2020-2021 lokka30. Use of this source code is governed by the MIT license that can be found in the LICENSE.md file.
 * This class is bundled inside the MicroLib resource, a library purposed for Bukkit/SpigotMC plugin developers. Read more about the resource here: https://www.spigotmc.org/resources/microlib.84017/
 */

package me.lokka30.microlib.wholes;

import org.bukkit.Bukkit;
import org.bukkit.Location;
import org.bukkit.Sound;
import org.bukkit.entity.Player;

import java.util.List;

/**
 * An object that makes it easier to store and play sounds
 *
 * @author lokka30
 * @since unknown
 */
@SuppressWarnings("unused")
public class WholeSound {

    public final Sound sound;
    public final float volume;
    public final float pitch;

    public WholeSound(Sound sound, float volume, float pitch) {
        this.sound = sound;
        this.volume = volume;
        this.pitch = pitch;
    }

    public void playToIndividual(Player player) {
        player.playSound(player.getLocation(), sound, volume, pitch);
    }

    public void playToIndividuals(Player[] players) {
        for (Player player : players) {
            playToIndividual(player);
        }
    }

    public void playToIndividuals(List<Player> players) {
        for (Player player : players) {
            playToIndividual(player);
        }
    }

    public void playToIndividualAtLocation(Player player, Location location) {
        player.playSound(location, sound, volume, pitch);
    }

    public void playToIndividualsAtLocation(Player[] players, Location location) {
        for (Player player : players) {
            playToIndividualAtLocation(player, location);
        }
    }

    public void playToIndividualsAtLocation(List<Player> players, Location location) {
        for (Player player : players) {
            playToIndividualAtLocation(player, location);
        }
    }

    public void playToIndividualsAtLocations(Player[] players, Location[] locations) {
        for (Player player : players) {
            for (Location location : locations) {
                playToIndividualAtLocation(player, location);
            }
        }
    }

    public void playToIndividualsAtLocations(List<Player> players, List<Location> locations) {
        for (Player player : players) {
            for (Location location : locations) {
                playToIndividualAtLocation(player, location);
            }
        }
    }

    public void playToAll() {
        for (Player player : Bukkit.getOnlinePlayers()) {
            playToIndividual(player);
        }
    }

    public void playToAllAtLocation(Location location) {
        assert location.getWorld() != null;
        location.getWorld().playSound(location, sound, volume, pitch);
    }

    public void playToAllAtLocations(Location[] locations) {
        for (Location location : locations) {
            playToAllAtLocation(location);
        }
    }

    public void playToAllAtLocations(List<Location> locations) {
        for (Location location : locations) {
            playToAllAtLocation(location);
        }
    }
}
