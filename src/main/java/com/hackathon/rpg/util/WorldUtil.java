package com.hackathon.rpg.util;

import com.hackathon.rpg.entity.World;

import java.util.ArrayList;
import java.util.List;

public class WorldUtil {

    public static World worldGen() {
        List<String> names = new ArrayList<>();
        List<String> environments = new ArrayList<>();
        List<String> locations = new ArrayList<>();

        World world = new World();

        /*
           "Alior",
                "Asgard",
                "Yggdrasil",
                "Elysium",
                "Asphodel"
        );
         */
        names.add("Alior");
        names.add("Asgard");
        names.add("Yggdrasil");
        names.add("Elysium");
        names.add("Asphodel");

        world.setName(names.get((int) (Math.random() * 5)));

        environments.add("Forest");
        environments.add("Plains");
        environments.add("Mountains");
        environments.add("Desert");
        environments.add("Underwater");

        world.setEnvironment(environments.get((int) (Math.random() * 5)));

        locations.add("Louisville");
        locations.add("New York");

        world.setLocations(locations);

        return world;
    }
}
