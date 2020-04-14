package com.akhil.demo;

import com.akhil.demo.data.entites.Player;
import com.akhil.demo.data.repositories.PlayerRepository;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.orm.hibernate5.LocalSessionFactoryBean;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringRunner;

import javax.persistence.EntityManager;

@SpringBootTest
@ContextConfiguration(classes = {PlayerRepository.class})
class DemoApplicationTests {

    @Autowired
    PlayerRepository playerRepository;

    @Test
    void contextLoads() {

        playerRepository.saveAndFlush(new Player());
    }

}
