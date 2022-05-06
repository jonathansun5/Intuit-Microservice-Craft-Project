package com.demo.intuitcraftexercise.player;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PlayerService {

    private final PlayerRepository playerRepository;

    @Autowired
    public PlayerService(PlayerRepository playerRepository) {
        this.playerRepository = playerRepository;
    }

    public List<Player> getPlayers() {
        return playerRepository.findAll();
    }

    public Player getSinglePlayer(String playerid) {
        return playerRepository.findById(playerid)
                .orElseThrow(() -> new IllegalStateException("playerId " + playerid + " does not exist"));

//        boolean exists = playerRepository.existsById(playerid);
//        if (!exists) {
//            throw new IllegalStateException("playerId " + playerid + " does not exist");
//        }
//        ArrayList<Player> players = new ArrayList();
//
////        playerRepository.getById(playerid).get
//        players.add(playerRepository.getById(playerid));
//        return players;
    }
}
