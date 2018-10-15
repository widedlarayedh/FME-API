package com.winners.isetch.fmeapi.Repository;

import com.winners.isetch.fmeapi.Entity.Player;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.CrossOrigin;

import java.util.List;

@Repository
@CrossOrigin(origins = "http://localhost:4200")
public interface PlayerRepository extends JpaRepository<Player,Integer> {
    List<Player> findByActualTeamId(int id);
}
