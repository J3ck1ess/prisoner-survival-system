package com.agzhan.prisoner.service;

import com.agzhan.prisoner.model.Prisoner;
import com.agzhan.prisoner.util.LogUtil;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class PrisonerService {
    /**
     * Simulation method (List removal)
     * Time Complexity: O(n^2)
     */
    public static Prisoner findSurvivor(List<Prisoner> prisoners, int step) {
        // Create a loop that, in each iteration, adds the even-numbered prisoners to a new set,
        // until only one prisoner remains.
        int index = 0;

        while (prisoners.size() > 1) {
            // Calculate the index of the eliminated prisoner
            index = (index + step - 1) % prisoners.size();

            Prisoner removed = prisoners.remove(index);

            LogUtil.info("Elimination number: " + removed.getId() +
                    " - Remaining number: " + prisoners.size());
        }
        return prisoners.get(0);
    }

    /**
     * Mathematical solution (Josephus formula)
     * Time Complexity: O(n)
     * Returns the index of the survivor (0-based)
     */
    public static int findSurvivorIndexMath(int n, int step) {
        int result = 0; // Base case: f(1) = 0

        for (int i = 2; i <= n; i++) {
            result = (result + step) % i;
        }

        return result;
    }

    /**
     * Get the survivor using mathematical method
     */
    public static Prisoner findSurvivorMath(List<Prisoner> prisoners, int step) {
        int index = findSurvivorIndexMath(prisoners.size(), step);

        return prisoners.get(index);
    }
}