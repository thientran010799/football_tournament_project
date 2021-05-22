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

    public static final int MAXIMUN_SIZE = 12;

    public static final int MINIMUN_SIZE = 7;

    private String name;

    private int score;

    private List<Player> players = new ArrayList<>();

    public boolean isEnoughPlayer() {
        return (this.getPlayers().size() < MINIMUN_SIZE) ;
    }

}
