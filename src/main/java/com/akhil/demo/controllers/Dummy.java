package com.akhil.demo.controllers;

import com.akhil.demo.data.entites.Player;
import com.akhil.demo.data.repositories.PlayerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Dummy {

    @Autowired
    PlayerRepository playerRepository;

    @GetMapping("/createPlayer/{name}")
    Player createPlayer(@PathVariable("name") String name){
        Player player = new Player();
        player.setName(name);

        return playerRepository.saveAndFlush(player);
    }


}
