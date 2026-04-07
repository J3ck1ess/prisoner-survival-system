package com.agzhan.prisoner;

import com.agzhan.prisoner.model.Prisoner;

import java.util.ArrayList;
import java.util.List;

// Prisoner Survival
public class App {
    public static void main(String[] args) {
        // 1. Create 100 randomly assigned, uniquely numbered prisoners.
        //    Simultaneously record their initial position index.
        List<Prisoner> prisoners = new ArrayList<>();
        for (int i = 1; i <= 100; i++) {
            int code = (int) (Math.random() * 200 + 1);
            if (!isRepeat(prisoners, code)) {
                i--;
                continue;
            }
            Prisoner p = new Prisoner(code, i);
            prisoners.add(p);
        }
        System.out.println(" prisoners: " + prisoners);

        // 2. Create a loop that, in each iteration, adds the even-numbered prisoners to a new set,
        //    until only one prisoner remains.
        while (prisoners.size() > 1) {
            List<Prisoner> lastPrisoners = new ArrayList<>();
            for (int i = 1; i < prisoners.size(); i += 2) {
                lastPrisoners.add(prisoners.get(i));
            }
            System.out.println("The remaining number of players in this round: " + lastPrisoners.size());
            if (lastPrisoners.size() == 1) {
                System.out.println("The last remaining prisoner number: " + lastPrisoners.get(0).getId());
                System.out.println("The location where the last remaining prisoner first appeared: " + lastPrisoners.get(0).getFirstLocation());
                break;
            }
            prisoners = lastPrisoners;
        }


    }

    public static boolean isRepeat(List<Prisoner> prisoners, int code) {
        for (Prisoner p : prisoners) {
            if (p.getId() == code) {
                return false;
            }
        }
        return true;
    }
}
