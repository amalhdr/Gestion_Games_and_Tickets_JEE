package com.haidara.gamesandticketsservices.repositories;

import com.haidara.gamesandticketsservices.entities.Game;
import org.springframework.data.jpa.repository.JpaRepository;

public interface GameRepository extends JpaRepository<Game, String> {
}
