package com.akhil.demo.data.repositories;

import com.akhil.demo.data.entites.Player;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PlayerRepository extends JpaRepository<Player,Long> {

}
