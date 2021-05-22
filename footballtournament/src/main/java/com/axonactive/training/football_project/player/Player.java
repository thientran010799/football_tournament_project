package com.axonactive.training.football_project.player;

import com.axonactive.training.football_project.team.Team;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class Player {

    private String name;

    private Gender gender;

    private String socialInsuranceNumber;

    public boolean isWorkForCompany() {
        return (this.socialInsuranceNumber == Team.COMPANY_SOCIAL_INSURANCE_NUMBER);
    }

}
