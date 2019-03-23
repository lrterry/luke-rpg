package com.hackathon.rpg.controller;

import com.hackathon.rpg.entity.World;
import com.hackathon.rpg.util.WorldUtil;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/world")
public class WorldController {

    @GetMapping("/random")
    public ResponseEntity<World> getRandomWorld() {
        System.out.println("test");
        ResponseEntity<World> response;
        World world = WorldUtil.worldGen();
        response = new ResponseEntity<>(world, HttpStatus.OK);
        return response;
    }
}
