package com.axonactive.training.football_project.team;

import java.util.ArrayList;
import java.util.List;

import com.axonactive.training.football_project.player.Player;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class Team {

    public static final String COMPANY_SOCIAL_INSURANCE_NUMBER = "";

    private String name;

    private int score;

    private List<Player> players = new ArrayList<>();

    public void addPlayer(Player player) {
        if (players.size() < 12) {
            players.add(player);
        }
        throw new IllegalArgumentException("Size of team is max");
    }

}
