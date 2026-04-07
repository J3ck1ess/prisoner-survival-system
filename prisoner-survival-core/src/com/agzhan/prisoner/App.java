package com.agzhan.prisoner;

import com.agzhan.prisoner.model.Prisoner;
import com.agzhan.prisoner.service.PrisonerService;
import com.agzhan.prisoner.util.PrisonerUtil;

import java.util.List;

// Prisoner Survival
public class App {
    public static void main(String[] args) {
        // 1. Generate prisoners
        List<Prisoner> prisoners = PrisonerUtil.generatePrisoners(100);

        System.out.println("Initial Prisoner List: ");
        System.out.println(prisoners);

        // 2. Implement the elimination process
        Prisoner survivor = PrisonerService.findSurvivor(prisoners);

        // 3. Print the result
        System.out.println("\nThe final survivor: ");
        System.out.println("ID: " + survivor.getId() +
                ", Position: " + survivor.getFirstLocation());
    }

}
