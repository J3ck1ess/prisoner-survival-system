package com.agzhan.prisoner.service;

import com.agzhan.prisoner.model.Prisoner;
import com.agzhan.prisoner.util.LogUtil;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class PrisonerService {
    public static Prisoner findSurvivor(List<Prisoner> prisoners, int step) {
        // Create a loop that, in each iteration, adds the even-numbered prisoners to a new set,
        // until only one prisoner remains.
        int index = 0;

        while (prisoners.size() > 1) {
            index = (index + step - 1) % prisoners.size();
            Prisoner removed = prisoners.remove(index);

            LogUtil.info("Elimination number: " + removed.getId() +
                    " - Remaining number: " + prisoners.size());
        }
        return prisoners.get(0);
    }
}