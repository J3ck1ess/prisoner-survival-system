package com.agzhan.prisoner.service;

import com.agzhan.prisoner.model.Prisoner;

import java.util.ArrayList;
import java.util.List;

public class PrisonerService {
    public static Prisoner findSurvivor(List<Prisoner> prisoners) {
        // Create a loop that, in each iteration, adds the even-numbered prisoners to a new set,
        // until only one prisoner remains.
        while (prisoners.size() > 1) {

            List<Prisoner> lastPrisoners = new ArrayList<>();

            // Preserve even-numbered positions (index 1, 3, 5)
            for (int i = 1; i < prisoners.size(); i += 2) {
                lastPrisoners.add(prisoners.get(i));
            }

            System.out.println("The remaining number of players in this round: " + lastPrisoners.size());

            prisoners = lastPrisoners;
        }
        return prisoners.get(0);
    }
}