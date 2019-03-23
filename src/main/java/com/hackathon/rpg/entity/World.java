package com.hackathon.rpg.entity;

import java.util.List;

public class World {

    private String name;
    private String environment;
    private List<String> locations;

    public World() {
    }

    public World(String name, String environment, List<String> locations) {
        this.name = name;
        this.environment = environment;
        this.locations = locations;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEnvironment() {
        return environment;
    }

    public void setEnvironment(String environment) {
        this.environment = environment;
    }

    public List<String> getLocations() {
        return locations;
    }

    public void setLocations(List<String> locations) {
        this.locations = locations;
    }
}
