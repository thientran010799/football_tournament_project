package com.axonactive.training.football_project.team;

import java.util.ArrayList;
import java.util.List;

import com.axonactive.training.football_project.player.Player;

public class TeamController {

    Team team = new Team();

    List<Team> teams = new ArrayList<>();

    public void addPlayer(Player player) {
        if (team.getPlayers().size() < Team.MAXIMUN_SIZE) {
            if (player.isWorkForCompany()) {
                team.getPlayers().add(player);
            }
            throw new IllegalArgumentException("This player do not work for this company");
        }
        throw new IllegalArgumentException("Size of team is max");
    }

    public void register(Team team) {
        if (team.isEnoughPlayer()) {
            teams.add(this.team);
        }
        throw new IllegalArgumentException("Your team is not enough player");
    }
}
